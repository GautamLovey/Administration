package com.college.Administration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class EligibilityCriteria {
    @Id
    String courseId;
    Integer minHighSchoolMarks;
    Integer minSecuredEntranceScore;
    String courseName;
    String reservationType;

}
