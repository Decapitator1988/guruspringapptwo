package com.decapitator.guruspringapptwo.controllers;

import com.decapitator.guruspringapptwo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {
    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
    public String sayHello(){
      return   greetingService.sayGreeting();
    }

}
