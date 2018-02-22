package com.decapitator.guruspringapptwo.services;

import org.springframework.stereotype.Service;

@Service
public class GetterGreetingService implements GreetingService{
    @Override
    public String sayGreeting() {
        return "I was injected by getter";
    }
}
