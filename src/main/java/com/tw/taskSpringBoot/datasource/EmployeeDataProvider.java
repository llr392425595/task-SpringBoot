package com.tw.taskSpringBoot.datasource;

import com.tw.taskSpringBoot.entities.EmployeeEntity;
import java.util.Arrays;
import java.util.List;

public class EmployeeDataProvider {
  private List<EmployeeEntity> employees = Arrays.asList(
      new EmployeeEntity(0, "小明", 20, "男"),
      new EmployeeEntity(1, "小红", 19, "女"),
      new EmployeeEntity(2, "小智", 15, "男"),
      new EmployeeEntity(3, "小刚", 16, "男"),
      new EmployeeEntity(4, "小霞", 15, "女")
  );

  public List<EmployeeEntity> getEmployees() {
    return employees;
  }

  public EmployeeEntity getEmployee(long id) {
    for (EmployeeEntity employee : employees) {
      if (employee.getId() == id) {
        return employee;
      }
    }
    return null;
  }

  public EmployeeEntity getEmployee(String name) {
    for (EmployeeEntity employee : employees) {
      if (employee.getName().equals(name)) {
        return employee;
      }
    }
    return null;
  }

  public EmployeeEntity insertEmployee(EmployeeEntity employee) throws Exception {
    if (employee.getAge() == null || employee.getName() == null || employee.getGender() == null) {
      throw new Exception("Invalid Employee!");
    }
    long userID = employees.get(employees.size() - 1).getId() + 1;
    employees.add(employee.setId(userID));
    return employee;
  }

  public EmployeeEntity updateEmployee(long id, EmployeeEntity employee) throws Exception {
    if (employee.getAge() == null || employee.getName() == null || employee.getGender() == null) {
      throw new Exception("Invalid Employee!");
    }

    EmployeeEntity originalEmployee = getEmployee(id);

    if (originalEmployee == null) {
      throw new Exception("Employee not found by id: " + id);
    }

    return originalEmployee
        .setName(employee.getName())
        .setAge(employee.getAge())
        .setGender(employee.getGender());
  }

  public EmployeeEntity deleteEmployee(long id) throws Exception {
    EmployeeEntity employee = getEmployee(id);

    if (employee == null) {
      throw new Exception("Employee not found by id: " + id);
    }

    employees.remove(employee);
    return employee;
  }
}
