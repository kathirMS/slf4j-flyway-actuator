package com.example.demo.customendpoind;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="about")
public class CustomEndPoint {

    @ReadOperation
    public String customFeatures(){

        return "I am kathir Software Engineering";
    }
}
