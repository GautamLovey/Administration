package com.college.Administration.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
@Entity
public class Student {
    @Id
    String studentRollNumber;
    String course;
    String branch;
    String studentName;
    String studentFatherName;
    String studentMotherName;
    String phoneNumber;
    String studentEmailId;
    @OneToOne(cascade = CascadeType.ALL)
    StudentAddress studentAddress;


}
