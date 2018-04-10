package com.tw.taskSpringBoot.controllers;

import com.tw.taskSpringBoot.entities.EmployeeEntity;
import com.tw.taskSpringBoot.repositories.EmployeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/employees")
public class EmployeeController {

  @Autowired
  private EmployeeRepository employeeRepositoryy;

  @GetMapping(value = "/hello")
  public String sayHello() {
    return "Hello World";
  }



  @GetMapping(value = "")
  public ResponseEntity<List> getAllEmployees() {
    List<EmployeeEntity> employeesList = employeeRepositoryy.findAll();

    return new ResponseEntity<>(employeesList, HttpStatus.OK);
  }


}