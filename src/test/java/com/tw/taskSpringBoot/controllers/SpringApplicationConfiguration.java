package com.tw.taskSpringBoot.controllers;

import org.springframework.mock.web.MockServletContext;

public @interface SpringApplicationConfiguration {

  Class<MockServletContext> classes();
}
