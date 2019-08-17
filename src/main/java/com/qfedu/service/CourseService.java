package com.qfedu.service;

import com.qfedu.entity.Course;
import java.util.List;

public interface CourseService {

    public List<Course> findAllCourse(Course course, Integer page, Integer limit);

    public List<Course> findCourse();

    public void addCourse(Course course);

    public void deleteCourse(Integer id);

    public void updateCourse(Course course);

    public Course selectByCourseId(Integer id);
}
