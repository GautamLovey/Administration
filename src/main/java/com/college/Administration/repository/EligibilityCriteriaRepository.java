package com.college.Administration.repository;


import com.college.Administration.model.EligibilityCriteria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EligibilityCriteriaRepository extends JpaRepository<EligibilityCriteria,String> {
}
