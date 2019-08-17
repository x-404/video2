package com.qfedu.controller;

import com.qfedu.common.JsonResult;
import com.qfedu.entity.Admin;
import com.qfedu.service.AdminService;
import com.qfedu.utils.StrUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {

//    @Autowired
//    private AdminService adminService;
//
//    @RequestMapping("/query.do")
//    @ResponseBody
//    public JsonResult getLoginInfo(HttpSession session) {
//        Admin ad = (Admin) session.getAttribute(StrUtils.LOGIN_USER);
//        Admin admin = adminService.selectByCode(ad.getUsername());
//        JsonResult result = new JsonResult(1, admin);
//        return result;
//    }


}
