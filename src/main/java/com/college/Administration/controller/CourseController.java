package com.college.Administration.controller;

import com.college.Administration.model.Course;
import com.college.Administration.model.EligibilityCriteria;
import com.college.Administration.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController {
    @Autowired
    CourseService courseService;
    @PostMapping("/")
    public void addCourseDetails(@RequestBody Course course){
        courseService.addCourseDetails(course);
    }

    @GetMapping("/{courseId}")
    public Course getCourseDetails(@PathVariable String courseId){

        return courseService.getCourseDetails(courseId);
    }

    @DeleteMapping("/{courseId}")
    public void deleteCourseDetails(@PathVariable String courseId){
               courseService.deleteCourseDetails(courseId);
    }
    @PutMapping("/")
    public Course updateCourseDetails(@RequestBody Course course){
           return courseService.updateCourseDetails(course);
    }

}
