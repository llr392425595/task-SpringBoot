package com.tw.taskSpringBoot.entities;

import java.util.HashMap;
import java.util.Map;

public class EmployeeEntity {

  private Long id;

  private String name;
  private Integer age;
  private String gender;

  public EmployeeEntity() { }

  public EmployeeEntity(String name, Integer age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
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
