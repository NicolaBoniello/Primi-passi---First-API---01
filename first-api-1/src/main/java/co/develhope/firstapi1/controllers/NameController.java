package co.develhope.firstapi1.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/name")
public class NameController {

    private String myName = "Nicola";

    @GetMapping("/")
    public String getMyName(){
        return myName;
    }

    @PostMapping(value = "/reversedName")
    public String reversedName(){
        StringBuilder stringBuilder = new StringBuilder();
       return stringBuilder.append(myName).reverse().toString();

    }
}