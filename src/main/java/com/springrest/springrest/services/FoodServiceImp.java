package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import com.springrest.springrest.Nutrients.Nutrients;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FoodServiceImp implements FoodService{
    List<Nutrients> list;
    private RestTemplate restTemplate;
   

  
    
    public Object getNutrients(){
    	list = new ArrayList<Nutrients>();
         Object object = restTemplate.getForObject(
            "https://api.nal.usda.gov/fdc/v1/foods/search?api_key=8206umIWtl4ZxonAFUAl2IFUCZDWjBeU2IEAea0W&query=roti", Object.class );
          
         return object;
    }

}
