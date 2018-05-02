package com.tw.taskSpringBoot.repositories;

import com.tw.taskSpringBoot.entities.EmployeeEntity;
import java.util.List;

public interface EmployeeRepository {
  EmployeeEntity createEmployee(EmployeeEntity employee) throws Exception;
  EmployeeEntity deleteEmployee(int id) throws Exception;
  EmployeeEntity updateEmployee(int id, EmployeeEntity employee) throws Exception;
  EmployeeEntity getEmployee(int id);
  EmployeeEntity getEmployee(String name);
  List<EmployeeEntity> getAllEmployees();
}