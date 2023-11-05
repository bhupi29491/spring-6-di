package com.bhupi.spring6di.services;

import org.springframework.stereotype.Service;

@Service("propertyGreetingService")
public class GreetingServicePropertyInjected implements  GreetingService{

    @Override
    public String sayGreeting() {
        return "Property injection must not be used..!!!";
    }
}
