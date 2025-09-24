package com.sparta.springauth.food;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Pizza implements Food {

    @Override
    public void eat() {
        System.out.println("Pizza eat");
    }
}
