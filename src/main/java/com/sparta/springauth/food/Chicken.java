package com.sparta.springauth.food;

import org.springframework.stereotype.Component;

@Component
public class Chicken implements Food {

    @Override
    public void eat() {
        System.out.println("Chicken eat");
    }
}
