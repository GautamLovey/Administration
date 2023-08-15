package com.college.Administration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Course {
    @Id
    String courseId;
    String courseTitle;
    String courseType;
    Integer totalSeat;
    String courseDuration;
    Integer courseFee;

}


