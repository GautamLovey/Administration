package com.college.Administration.controller;

import com.college.Administration.model.RegisterStudent;
import com.college.Administration.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/register")
public class RegisterController {
    @Autowired
    RegisterService registerService;

    @PostMapping("/")
   public void addRegisterDetails(@RequestBody RegisterStudent registerStudent){
       registerService.addRegisterDetails(registerStudent);
   }
    @GetMapping("/{StudentAadhaarNumber}")
    public RegisterStudent getRegisterDetails(@PathVariable String studentAadhaarNumber){
        return registerService.getRegisterDetails(studentAadhaarNumber);
    }
    @DeleteMapping("/")
    public void deleteRegisterDetails(@PathVariable String studentAadhaarNumber){
        registerService.deleteRegisterDetails(studentAadhaarNumber);
    }
    @PutMapping("/")
    public RegisterStudent updateRegisterStudent(@RequestBody RegisterStudent registerStudent){
        return registerService.updateRegisterStudent(registerStudent);

    }

}
