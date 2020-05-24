package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TareacrudApplication {

    public static void main(String[] args) {
        SpringApplication.run(TareacrudApplication.class, args);
        System.out.println("Klk");
    }

    @GetMapping("/")
    public String sayKlk()
    {
        return "Klk Jean";

    }

}
