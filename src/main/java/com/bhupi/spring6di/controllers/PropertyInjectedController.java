package com.bhupi.spring6di.controllers;

import com.bhupi.spring6di.services.GreetingService;

public class PropertyInjectedController {

    GreetingService greetingService;

    public String sayHello() {
        return greetingService.sayGreeting();
    }
}
