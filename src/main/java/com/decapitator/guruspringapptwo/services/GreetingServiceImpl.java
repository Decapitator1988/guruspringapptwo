package com.decapitator.guruspringapptwo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {

    public GreetingServiceImpl greetingService;


    public static final String HELLO_GURUS = "Hello gurus! - Original";


    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
