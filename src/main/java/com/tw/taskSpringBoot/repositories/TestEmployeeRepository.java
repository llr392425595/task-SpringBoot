package com.tw.taskSpringBoot.repositories;

import com.tw.taskSpringBoot.datasource.EmployeeDataProvider;
import com.tw.taskSpringBoot.entities.EmployeeEntity;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class TestEmployeeRepository implements EmployeeRepository{
  private EmployeeDataProvider employeeDataProvider = new EmployeeDataProvider();

  @Override
  public EmployeeEntity createEmployee(EmployeeEntity employee) throws Exception {
    return employeeDataProvider.insertEmployee(employee);
  }

  @Override
  public EmployeeEntity deleteEmployee(int id) throws Exception {
    return employeeDataProvider.deleteEmployee(id);
  }

  @Override
  public EmployeeEntity updateEmployee(int id, EmployeeEntity employee) throws Exception {
    return employeeDataProvider.updateEmployee(id, employee);
  }

  @Override
  public EmployeeEntity getEmployee(String name) {
    return employeeDataProvider.getEmployee(name);
  }

  @Override
  public EmployeeEntity getEmployee(int id) {
    return employeeDataProvider.getEmployee(id);
  }

  @Override
  public List<EmployeeEntity> getAllEmployees() {
    return employeeDataProvider.getEmployees();
  }
}
