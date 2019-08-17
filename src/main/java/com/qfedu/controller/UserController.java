package com.qfedu.controller;

import com.qfedu.common.JsonResult;
import com.qfedu.entity.User;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/addUser.do")
    @ResponseBody
    public JsonResult addUser(User user) {
        userService.addUser(user);
        return new JsonResult(1, null);
    }

    @RequestMapping("deleteUser.do")
    @ResponseBody
    public JsonResult deleteUser(Integer id) {
        userService.deleteById(id);
        return new JsonResult(1, null);
    }

    @RequestMapping("queryUser.do")
    @ResponseBody
    public JsonResult findByUid(Integer id) {
        User uid = userService.findByUid(id);
        return new JsonResult(1, uid);
    }

    @RequestMapping("")
    @ResponseBody
    public JsonResult updateUser(User user) {
        userService.updateUser(user);
        return new JsonResult(1, null);
    }

}
