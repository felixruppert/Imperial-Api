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
}
