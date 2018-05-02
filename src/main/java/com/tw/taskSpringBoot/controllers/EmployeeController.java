package com.tw.taskSpringBoot.controllers;

import com.tw.taskSpringBoot.entities.EmployeeEntity;
import com.tw.taskSpringBoot.repositories.EmployeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
@RequestMapping(value = "/employees")
public class EmployeeController {

  @Autowired
  private EmployeeRepository employeeRepository;

//  查询所有员工
  @GetMapping(value = "")
  public ResponseEntity<List> getAllEmployees() {
    List<EmployeeEntity> employeesList = employeeRepository.getAllEmployees();

    return new ResponseEntity<>(employeesList, HttpStatus.OK);
  }

//  新增一个员工
  @PostMapping(value = "")
  public ResponseEntity addEmployee(@RequestBody EmployeeEntity employee) throws Exception {
    employeeRepository.createEmployee(employee);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }

}