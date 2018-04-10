package com.tw.taskSpringBoot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/employees")
public class Employee {

  @GetMapping(value = "/hello")
  public String sayHello() {
    return "Hello World";
  }

}