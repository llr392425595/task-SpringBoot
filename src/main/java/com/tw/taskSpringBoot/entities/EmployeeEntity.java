package com.tw.taskSpringBoot.entities;

import java.util.HashMap;
import java.util.Map;

public class EmployeeEntity {

  private long id;
  private String name;
  private Integer age;
  private String gender;

  public EmployeeEntity() { }

  public EmployeeEntity(long id, String name, Integer age, String gender) {
    this.id = id;
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public long getId() {
    return id;
  }

  public EmployeeEntity setId(long id) {
    this.id = id;
    return this;
  }

  public String getName() {
    return name;
  }

  public EmployeeEntity setName(String name) {
    this.name = name;
    return this;
  }

  public Integer getAge() {
    return age;
  }

  public EmployeeEntity setAge(Integer age) {
    this.age = age;
    return this;
  }

  public String getGender() {
    return gender;
  }

  public EmployeeEntity setGender(String gender) {
    this.gender = gender;
    return this;
  }

  @Override
  public String toString() {
    Map<String, Object> map = new HashMap<>();
    map.put("id", this.id);
    map.put("name", this.name);
    map.put("age", this.age);
    map.put("gender", this.gender);
    return map.toString();
  }
}
