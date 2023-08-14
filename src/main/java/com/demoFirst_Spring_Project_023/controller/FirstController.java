package com.demoFirst_Spring_Project_023.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class FirstController {


    @GetMapping(value = "/hello")
    public static String getFunction(){
        return "Hi";
    }

    @GetMapping(value = "/return/{s}")
    public static String returnFunction(@PathVariable String s){
        System.out.println("STRING");
        return s;
    }

    @GetMapping(value = "/return_number/{n}")
    public static int returnFunction(@PathVariable int n){
        System.out.println("INTEGER");
        return n;
    }

}
