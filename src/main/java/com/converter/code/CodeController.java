package com.converter.code;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodeController {
    private Converter con = new Converter();

    @RequestMapping("/inches")
    public double sum(@RequestParam int inches){
        return con.centimeters(inches);
    }
}