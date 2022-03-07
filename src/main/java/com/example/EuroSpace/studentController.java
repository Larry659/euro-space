package com.example.EuroSpace;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class studentController {

    @GetMapping("/get-student")
    public Student getStudent(){
        return new Student("samuel","maduka");
    }
}
