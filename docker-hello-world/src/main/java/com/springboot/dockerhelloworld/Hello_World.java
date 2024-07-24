package com.springboot.dockerhelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello_World {
    @GetMapping(path = "/")
    public String helloWorld() {
		// Implemented using String Templates
        return """
                { message: Hello World Java v5 }
               """;
    }

}
