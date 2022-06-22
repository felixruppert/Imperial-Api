package com.converter.code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConverterTest {
    Converter converter = new Converter();
    @Test
    void inchTest(){
        int inches = 2;
        double expected = 2*2.54;
        double result = converter.centimeters(inches);
        assertEquals(expected,result);
    }

    @Test
    void yardsTest(){
        int yards = 5;
        double expected = 5*0.9144;
        double result = converter.centimeters(yards);
        assertEquals(expected,result);
    }
}
