package com.example.demo;

@Controller
public class Test{
    @RequestMapping("/hello")
    public String Hello(){
        return "hello world";
    }
}