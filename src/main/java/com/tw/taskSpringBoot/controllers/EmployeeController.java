package com.tw.taskSpringBoot.controllers;

import static org.springframework.http.HttpStatus.NO_CONTENT;

import com.tw.taskSpringBoot.entities.EmployeeEntity;
import com.tw.taskSpringBoot.repositories.EmployeeRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    if (employeesList == null) {
      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    return new ResponseEntity<>(employeesList, HttpStatus.OK);
  }

  @GetMapping(value = "/{id}")
  public ResponseEntity findEmployeeById(@PathVariable long id) {
    EmployeeEntity employee = employeeRepository.getEmployee(id);
    return new ResponseEntity<>(employee, HttpStatus.OK);
  }

  //  新增一个员工
  @PostMapping(value = "")
  public ResponseEntity addEmployee(@RequestBody EmployeeEntity employee) throws Exception {
    employeeRepository.createEmployee(employee);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }

  //  删除一个员工
  @DeleteMapping(value = "/{id}")
  public ResponseEntity deleteEmployee(@PathVariable long id) throws Exception {
    employeeRepository.deleteEmployee(id);
    return new ResponseEntity(NO_CONTENT);
  }

  //  更新员工信息
  @PutMapping(value = "/{id}")
  public ResponseEntity updateEmployee(@PathVariable long id, @RequestBody EmployeeEntity newEmployee)
      throws Exception {
    employeeRepository.updateEmployee(id,newEmployee);
    return new ResponseEntity(NO_CONTENT);
  }
}