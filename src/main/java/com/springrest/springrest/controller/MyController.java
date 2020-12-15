package com.springrest.springrest.controller;
//import java.util.List;

//import com.springrest.springrest.Nutrients.Nutrients;
import com.springrest.springrest.services.FoodService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyController {
    @Autowired
    private FoodService foodService;

    @GetMapping("/home")
    public String Home(){
        return "Hello WOrld";

    }
    
    //get the course
    @GetMapping("/roti")
    public Object getNutrients(){
        return this.foodService.getNutrients();

    }

}
