package com.college.Administration.repository;

import com.college.Administration.model.StudentAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentAddressARepository extends JpaRepository<StudentAddress,Integer> {
}
