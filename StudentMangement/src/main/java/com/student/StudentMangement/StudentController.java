package com.student.StudentMangement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/post")
public class StudentController {
    @Autowired
    private Service service;


    @GetMapping
    public List<Student> getallStudent() {
        return service.getallstudent();
    }
}
//@PostMapping

//@PutMapping
//@DeleteMapping
