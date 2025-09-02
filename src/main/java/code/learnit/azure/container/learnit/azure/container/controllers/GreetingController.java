package code.learnit.azure.container.learnit.azure.container.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/hello")
    public String sayHello(){
        return "hello from Raghu Ram";
    }
}
