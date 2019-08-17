package com.qfedu.controller;

import com.github.pagehelper.Page;
import com.qfedu.common.JsonResult;
import com.qfedu.entity.Course;
import com.qfedu.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@ResponseBody
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/listCourse.do")
    public Map<String, Object> listCourse(Course course, Integer page, Integer limit) {
        List<Course> list = courseService.findAllCourse(course, page, limit);
        long total = ((Page) list).getTotal();
        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "");
        map.put("count", total);
        map.put("data", list);
        return map;
    }


    @RequestMapping("/courseList.do")
    public JsonResult list() {
        List<Course> course = courseService.findCourse();
        return new JsonResult(1, course);
    }

    @RequestMapping("/addCourse.do")
    public JsonResult addCourse(Course course) {
        courseService.addCourse(course);
        return new JsonResult(1, null);
    }

    @RequestMapping("/deleteCourse.do")
    public JsonResult deleteCourse(Integer id) {
        courseService.deleteCourse(id);
        return new JsonResult(1, "删除成功");
    }

    @RequestMapping("/updateCourse.do")
    public JsonResult updateCourse(Course course) {
        courseService.updateCourse(course);
        return new JsonResult(1, null);
    }

    @RequestMapping("/queryCourse.do")
    public JsonResult selectByCourseId(Integer id) {
        Course course = courseService.selectByCourseId(id);
        return new JsonResult(1, course);
    }

}
