package com.cg;

import org.example.com.cg.Calculator;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CalculatorTest {
    static Calculator cal;

    @BeforeAll
    static void init(){
        cal= new Calculator();
        System.out.println("Calculator instance created");
    }

    @AfterAll
    static void destroy(){
        cal=null;
        System.out.println("Calculator instance destroyed");

    }
    @Test
    // @Timeout(value = 1, unit = TimeUnit.MILLISECONDS)
    void calTest(){
        System.out.println("Testing calculate method");
        assertEquals(10,cal.calculate(5,5));

    }
    //@Test
    // @Timeout(value = 1,unit = TimeUnit.MILLISECONDS)
    // @Disabled
    @ParameterizedTest
    @ValueSource(ints = {2,3,5,7})
    void isPrimeTest(int num){

        System.out.println("Testing isPrime method");
        assert(cal.isPrime(num));
        assertEquals(true,cal.isPrime(7));
        assertEquals(false,cal.isPrime(10));
    }
}
