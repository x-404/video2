package com.qfedu.dao;


import com.qfedu.entity.Course;

import java.util.List;

public interface CourseDao {

    public List<Course> findAllCourse(Course course);

    public List<Course> findCourse();

    public void addCourse(Course course);

    public void deleteCourse(Integer id);

    public void updateCourse(Course course);

    public Course selectByCourseId(Integer id);

}
