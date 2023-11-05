package com.bhupi.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service
public class EnvironmentServiceQA implements EnvironmentService{

    @Override
    public String getEnv() {
        return "This is Quality Analysis Environment...!!!";
    }
}
