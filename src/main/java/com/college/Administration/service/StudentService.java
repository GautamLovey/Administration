package com.college.Administration.service;

import com.college.Administration.model.EligibilityCriteria;
import com.college.Administration.model.RegisterStudent;
import com.college.Administration.model.Student;
import com.college.Administration.repository.EligibilityCriteriaRepository;
import com.college.Administration.repository.RegisterRepository;
import com.college.Administration.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.Optional;
import java.util.Properties;

@Service
public class StudentService {
    @Autowired
    RegisterRepository registerRepository;
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    EligibilityCriteriaRepository eligibilityCriteriaRepository;
    public Student createStudent(Student student){
       for(RegisterStudent R:registerRepository.findAll()){
            try {
                if(student.getStudentRollNumber().substring(8).equals(readPropertiesFiles(R.getEnrollCourse()))){
                    Optional<EligibilityCriteria> optionalEligibilityCriteria = eligibilityCriteriaRepository.findById(readPropertiesFiles(R.getEnrollCourse()));
                    EligibilityCriteria eligibilityCriteria = optionalEligibilityCriteria.get();
                    if( R.getHighSchoolMarks() >= eligibilityCriteria.getMinHighSchoolMarks() && eligibilityCriteria.getMinSecuredEntranceScore()<= R.getEntranceScore()){
                        student.setStudentName(R.getStudentName());
                        student.setStudentEmailId(R.getEmailId());
                        student.setStudentFatherName(R.getStudentFatherName());
                        student.setStudentAddress(R.getStudentAddress());
                        registerRepository.deleteById(R.getStudentAadhaarNumber());
                        break;
                    }
                    //eligibility check
                    //student.setallfields(r.getallfield)
                    //registerstudent-> delete

                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }


        }

        studentRepository.saveAndFlush(student);
        return student;

    }
  public String readPropertiesFiles(String courseName) throws IOException {
      Properties properties = new Properties();
      properties.load(getClass().getClassLoader().getResourceAsStream("application.properties"));
      String prop = properties.getProperty(courseName);
      return prop;

      //course
      //register
      //eligibilty
  }

}
