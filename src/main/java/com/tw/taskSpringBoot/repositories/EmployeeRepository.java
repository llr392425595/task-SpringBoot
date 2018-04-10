package com.tw.taskSpringBoot.repositories;


import com.tw.taskSpringBoot.entities.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Integer>{

}