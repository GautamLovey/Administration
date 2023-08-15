package com.college.Administration.service;

import com.college.Administration.model.Course;
import com.college.Administration.model.EligibilityCriteria;
import com.college.Administration.repository.EligibilityCriteriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class EligibilityService {
    @Autowired
    EligibilityCriteriaRepository eligibilityCriteriaRepository;

    public void addEligibilityDetails(EligibilityCriteria eligibilityCriteria){
        eligibilityCriteriaRepository.saveAndFlush(eligibilityCriteria);
    }
    public EligibilityCriteria getEligibilityCriteria(String courseId){
        Optional<EligibilityCriteria> optionalEligibilityCriteria = eligibilityCriteriaRepository.findById(courseId);
        EligibilityCriteria eligibilityCriteria = optionalEligibilityCriteria.get();
        return eligibilityCriteria;
    }
    public void deleteEligibilityCriteriaDetails(String courseId){
        eligibilityCriteriaRepository.deleteById(courseId);
    }
    public EligibilityCriteria updateEligibilityCriteriaDetails(EligibilityCriteria eligibilityCriteria){
       Optional<EligibilityCriteria> optionalEligibilityCriteria = eligibilityCriteriaRepository.findById(eligibilityCriteria.getCourseId());
       EligibilityCriteria eligibilityCriteria1 = optionalEligibilityCriteria.get();
       eligibilityCriteria1.setMinHighSchoolMarks(eligibilityCriteria.getMinHighSchoolMarks());
       eligibilityCriteria1.setMinSecuredEntranceScore(eligibilityCriteria.getMinSecuredEntranceScore());
       return  eligibilityCriteria1;

    }
}
