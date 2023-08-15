package com.college.Administration.service;

import com.college.Administration.model.RegisterStudent;
import com.college.Administration.repository.RegisterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class RegisterService {
    @Autowired
    RegisterRepository registerRepository;

    public void addRegisterDetails(RegisterStudent registerStudent){
         registerRepository.saveAndFlush(registerStudent);
    }
    public RegisterStudent getRegisterDetails(String studentAadhaarNumber){
        Optional<RegisterStudent> optionalRegisterStudent = registerRepository.findById(studentAadhaarNumber);
        RegisterStudent registerStudent = optionalRegisterStudent.get();
        return  registerStudent;
    }

    public void deleteRegisterDetails(String studentAadhaarNumber){
          registerRepository.deleteById(studentAadhaarNumber);
    }

    public RegisterStudent updateRegisterStudent(RegisterStudent registerStudent){
        Optional<RegisterStudent> optionalRegisterStudent = registerRepository.findById(registerStudent.getStudentAadhaarNumber());
        RegisterStudent registerStudent1 = optionalRegisterStudent.get();
        registerStudent1.setEmailId(registerStudent.getEmailId());
        return registerStudent1;
    }

}
