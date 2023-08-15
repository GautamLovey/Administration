package com.college.Administration.service;

import com.college.Administration.model.Course;
import com.college.Administration.model.EligibilityCriteria;
import com.college.Administration.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class CourseService {
     @Autowired
     CourseRepository courseRepository;
    public void addCourseDetails(Course course){

        courseRepository.saveAndFlush(course);
    }
    public Course getCourseDetails(String courseId){
        Optional<Course> optional = courseRepository.findById(courseId);
        Course course = optional.get();
        return course;

    }
    public void deleteCourseDetails(String courseId){
       courseRepository.deleteById(courseId);
    }
    public Course updateCourseDetails(Course course){
         Optional<Course> optionalCourse = courseRepository.findById(course.getCourseId());
         Course course1 = optionalCourse.get();
         course1.setCourseTitle(course.getCourseTitle());
         course1.setCourseType(course.getCourseType());
         course1.setCourseDuration(course.getCourseDuration());
         course1.setCourseFee(course.getCourseFee());
         return courseRepository.save(course1);
    }
}
