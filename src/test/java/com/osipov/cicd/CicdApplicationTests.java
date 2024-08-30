package com.osipov.cicd;

import com.osipov.cicd.service.CalcService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CicdApplicationTests {
    @Autowired
    private CalcService service;

    @Test
    void addReturnCorrectData() {
        assertEquals(4, service.add(2, 2));
    }

    @Test
    void subReturnCorrectData() {
        assertEquals(0, service.sub(2, 2));
    }

    @Test
    void mulReturnCorrectData() {
        assertEquals(15, service.mul(5, 3));
    }

    @Test
    void divReturnCorrectData() {
        assertEquals(10, service.div(20, 2));
    }
}
