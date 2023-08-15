package com.college.Administration.repository;

import com.college.Administration.model.RegisterStudent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepository extends JpaRepository<RegisterStudent,String> {
}
