package com.restexample.restfulpractice;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public GreetingService greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new GreetingService(counter.incrementAndGet(), String.format(template, name));
    }

    @PostMapping("/postName")
    public void postName(@RequestParam(value="name", defaultValue = "") String name){
            System.out.println("Name passed: " + name);

    }

    @GetMapping("/error")
    public String errorMSG(){
        return "Something went wrong";
    }
}
