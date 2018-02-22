package com.decapitator.guruspringapptwo.services;

import org.springframework.stereotype.Component;


public interface GreetingRepository {
    String getEnglishGreeting();
    String getSpanishGreeting();
    String getGermanGreeting();
}
