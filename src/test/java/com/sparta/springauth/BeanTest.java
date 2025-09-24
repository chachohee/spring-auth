package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.AutoClose;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {

    @Qualifier("chicken")
    @Autowired
    Food food;

    @Autowired
    Food pizza;

    @Test
    void test1() {
        food.eat();
        pizza.eat();
    }
}
