package com.sapient.web.dockerdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/docker/hello")
public class UserController {

    @GetMapping
    public String sayHello(){
        return "Docker Demo!!";
    }

}
