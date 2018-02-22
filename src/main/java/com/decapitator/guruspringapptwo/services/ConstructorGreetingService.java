package com.decapitator.guruspringapptwo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "I was injected by the Constructor";
    }
}
