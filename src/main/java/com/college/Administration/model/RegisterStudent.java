package com.college.Administration.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Value;

@Entity
@Data
public class RegisterStudent {
     @Id
     //@JsonProperty("studentAadhaarNumber")
    // @Column(name = "studentAadhaarNumber")
    // @GeneratedValue(strategy = GenerationType.AUTO)
     String studentAadhaarNumber;
     String studentName;
     String studentFatherName;
     String studentMotherName;
     String studentPhoneNumber;
     String emailId;
     String enrollCourse;
     String enrollBranch;
     Integer entranceScore;
     Integer highSchoolMarks;
     Boolean academicsReservation;
     Boolean sportsReservation;
     Boolean managementReservation;

     @OneToOne(cascade=CascadeType.ALL)
     StudentAddress studentAddress;
}
