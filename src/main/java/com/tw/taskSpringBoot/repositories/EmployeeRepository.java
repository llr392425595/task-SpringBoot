package com.tw.taskSpringBoot.repositories;

import com.tw.taskSpringBoot.entities.EmployeeEntity;
import java.util.List;

public interface EmployeeRepository {
  EmployeeEntity createEmployee(EmployeeEntity employee) throws Exception;
  EmployeeEntity deleteEmployee(long id) throws Exception;
  EmployeeEntity updateEmployee(long id, EmployeeEntity employee) throws Exception;
  EmployeeEntity getEmployee(long id);
  EmployeeEntity getEmployee(String name);
  List<EmployeeEntity> getAllEmployees();
}