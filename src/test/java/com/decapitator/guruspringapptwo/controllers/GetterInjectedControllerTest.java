package com.decapitator.guruspringapptwo.controllers;

import com.decapitator.guruspringapptwo.services.GreetingService;
import com.decapitator.guruspringapptwo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GetterInjectedControllerTest {

    private GetterInjectedController getterInjectedController;

    @Before
    public void setUp()throws Exception{
        this.getterInjectedController = new GetterInjectedController();
        this.getterInjectedController.setGreetingService(new GreetingServiceImpl());
    }
        @Test
        public void testGreeting() throws Exception{
            assertEquals(GreetingServiceImpl.HELLO_GURUS, getterInjectedController.sayHello());
        }

}
