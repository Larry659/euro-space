package com.example.EuroSpace;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class studentController {
    //CRUD operations
    //post -create
    //get - retrieve
    //put - update
    //delete - delete

    @GetMapping("/getstudent")
    public Student getStudent(){
//        Student st = new Student("Joshua","Aworinke");
//        return st;

        return new Student("samuel","maduka");
    }
    @GetMapping("/greetings")
    public String salute(){
        return "this is a practice springboot project";
    }


    @GetMapping("/getemployee")
    public Employee getEmployee(){
        ArrayList<String> family = new ArrayList<>();
        family.add("bimpe");
        family.add("wale");
        family.add("gbolahan");
        return new Employee("agbabiaka","director",34,family,"12 shola alinson street");
    }
    @GetMapping("/studentlist")
    public List<Student> getStudentList(){
        List<Student> studentlist = new ArrayList<>();
        studentlist.add(new Student("ronke","folarin"));
        studentlist.add(new Student("samuel","maduka"));
        studentlist.add(new Student("smith","rowe"));
        studentlist.add(new Student("ansumane","fati"));
        return studentlist;

    }
    // when you see url like http://localhost:8080/studentlist/3 the 3 is a path variable, it could be a string
    // multiple path variable are like http://localhost:8080/studentlist/remeesh/balogun the remeesh and balogun
    // are path variables
    @GetMapping("/student/{name1}/{lastname1}")
    public Student getStudentByName(@PathVariable("name1") String name,@PathVariable("lastname1") String lastname){
        return new Student(name,lastname);
        // note: when using @Pathvariable, the name in your pathvariable must be the same with the name in your
        //@GetMapping annotation
    }
}
