package com.example.cicd;

import org.apache.catalina.mbeans.SparseUserDatabaseMBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CiCdApplication {

    @GetMapping("/")
    public String home() {
        return "Hello World! Docker Password Test from hostel";
    }

    public static void main(String[] args) {
        SpringApplication.run(CiCdApplication.class, args);
    }

}
