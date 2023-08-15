package com.college.Administration.controller;

import com.college.Administration.model.Course;
import com.college.Administration.model.EligibilityCriteria;
import com.college.Administration.service.EligibilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/eligibility")
public class EligibilityCriteriaController {
    @Autowired
    EligibilityService eligibilityService;

    @PostMapping("/")
    public void addEligibilityDetails(@RequestBody EligibilityCriteria eligibilityCriteria){
        eligibilityService.addEligibilityDetails(eligibilityCriteria);
    }
    @GetMapping("/{courseId}")
    public EligibilityCriteria getEligibilityCriteria(@PathVariable String courseId){
        return  eligibilityService.getEligibilityCriteria(courseId);
    }
    @DeleteMapping("/{courseId}")
    public void deleteEligibilityCriteriaDetails(@PathVariable String courseId){
        eligibilityService.deleteEligibilityCriteriaDetails(courseId);
    }
   @PutMapping("/")
    public EligibilityCriteria updateEligibilityCriteriaDetails(@RequestBody EligibilityCriteria eligibilityCriteria){
        return eligibilityService.updateEligibilityCriteriaDetails(eligibilityCriteria);
    }
}
