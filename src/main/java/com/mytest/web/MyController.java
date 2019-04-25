package com.mytest.web;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;

@RestController
@AllArgsConstructor
public class MyController {

    @GetMapping( "/api/{name}" )
    @ResponseStatus( OK )
    @ResponseBody
    public String signin( @PathVariable String name ) {
        return "Hello there " + name;
    }
}