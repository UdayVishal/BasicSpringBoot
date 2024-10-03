package com.example.Demo.Helloworld.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloworld {

    @RequestMapping("/Hello")
    public String Helloworld()
    {
        return "Hello World";
    }
}
