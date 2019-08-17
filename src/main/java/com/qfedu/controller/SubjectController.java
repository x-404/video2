package com.qfedu.controller;


import com.qfedu.common.JsonResult;
import com.qfedu.entity.Subject;
import com.qfedu.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@ResponseBody
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @RequestMapping("/subjectList.do")
    public JsonResult findSubject() {
        List<Subject> subject = subjectService.findSubject();
        return new JsonResult(1, subject);
    }

}
