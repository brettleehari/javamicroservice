package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}

@RestController
class GreetingController {
    private static final List<String> GREETINGS = Arrays.asList(
        "Hello, World!",
        "Hi there!",
        "Greetings!",
        "Howdy!",
        "Good day!",
        "Hey!"
    );
    private static final Random RANDOM = new Random();

    @GetMapping("/")
    public String greet() {
        int index = RANDOM.nextInt(GREETINGS.size());
        return GREETINGS.get(index);
    }
}