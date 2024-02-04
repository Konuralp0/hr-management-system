package com.hrms;

import com.hrms.business.concretes.EmployerManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class HrmsApplicationTests {

  @Autowired
  EmployerManager manager;

  @Test
  void contextLoads() {
  }

}
