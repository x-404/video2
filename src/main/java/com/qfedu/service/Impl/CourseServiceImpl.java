package com.qfedu.service.Impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.qfedu.dao.CourseDao;
import com.qfedu.entity.Course;
import com.qfedu.service.CourseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired(required = false)
    private CourseDao courseDao;

    @Override
    public List<Course> findAllCourse(Course course, Integer page, Integer limit) {
        PageHelper.startPage(page, limit);
        List<Course> list = courseDao.findAllCourse(course);
        return list;
    }

    @Override
    public List<Course> findCourse() {
        List<Course> lt = courseDao.findCourse();
        return lt;
    }

    @Override
    public void addCourse(Course course) {
        courseDao.addCourse(course);
    }

    @Override
    public void deleteCourse(Integer id) {
        courseDao.deleteCourse(id);
    }

    @Override
    public void updateCourse(Course course) {
        courseDao.updateCourse(course);
    }

    @Override
    public Course selectByCourseId(Integer id) {
        return courseDao.selectByCourseId(id);
    }

}
