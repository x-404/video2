package com.qfedu.controller;

import com.qfedu.common.JsonResult;
import com.qfedu.entity.Admin;
import com.qfedu.entity.Video;
import com.qfedu.service.AdminService;
import com.qfedu.utils.StrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.server.reactive.ContextPathCompositeHandler;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.List;

@Controller
@Validated   //方法的参数使用的验证注解，需要在控制器类中使用该注解
public class LoginController {

    @Autowired
    private AdminService adminService;

    @RequestMapping("/login.do")
    @ResponseBody
    /**
     * 实体类中有验证注解，控制器中，使用@Valid修饰
     * 紧跟着使用注解的参数，需要定义BIndingResult参数（获取验证不通过的信息）
     */
    public JsonResult login(@Valid Admin a, BindingResult bindResult, HttpSession session) {
        boolean ret = bindResult.hasErrors();
        if (ret) {
            List<ObjectError> allErrors = bindResult.getAllErrors();
            for (ObjectError err: allErrors) {
                FieldError error = (FieldError) err;
                System.out.println(error.getField());
                System.out.println(error.getDefaultMessage());
            }
            return new JsonResult(0, "验证异常");
        }

        Admin admin = adminService.login(a.getUsername(), a.getPassword());
        session.setAttribute(StrUtils.LOGIN_USER, admin);

        JsonResult result = new JsonResult(1, null);
        return result;
    }

    @RequestMapping("/test.do")
    @ResponseBody
    public String test() {
        return "redirect:/addVideo.html";

    }

    @RequestMapping("/quit.do")
    public String quit(HttpSession session) {
        session.removeAttribute(StrUtils.LOGIN_USER);
        session.invalidate();
        return "redirect:/login.html";
    }
}
