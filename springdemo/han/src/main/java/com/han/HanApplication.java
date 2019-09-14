package com.han;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jue-PC
 */
@RestController
@SpringBootApplication
public class HanApplication {

    @RequestMapping("/")
    public String index() {
        return "Hello Spring-Boot";
    }

    public static void main(String[] args) {
        SpringApplication.run(HanApplication.class, args);
    }
}
