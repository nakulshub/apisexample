package com.example.productservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class example {

    @GetMapping("/hello")
    public String hello()
    {
        return "hello";
    }

    @GetMapping("/hello/{name}")
    public String helloWithName(@PathVariable("name") String name)
    {
        return "hello " + name;
    }

    @GetMapping("/hellos/{id}")
    public String hellowithId(@PathVariable("id") int id)
    {
        return "hellowithId"+id;
    }


    @GetMapping("/booking id/{b_id}/seat no/{s_id}")
    public String bmsEx(@PathVariable("b_id") int b_id, @PathVariable("s_id") int s_id)
    {
        return "your booking idv " + b_id + " " + "you seat " + s_id;
    }
}

