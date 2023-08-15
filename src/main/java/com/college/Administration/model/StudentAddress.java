package com.college.Administration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class StudentAddress {

    @Id
            @GeneratedValue(strategy = GenerationType.AUTO)
    Integer houseNo;
    Integer streetNo;
    String  city;
    Integer pinCode;
    String  state;
    String  country;

}
