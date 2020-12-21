package com.mphasis.sbw.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mphasis.sbw.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
