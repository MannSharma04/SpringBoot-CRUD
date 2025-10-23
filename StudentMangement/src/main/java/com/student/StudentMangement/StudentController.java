package com.student.StudentMangement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    @PostMapping
    public ResponseEntity<Student> addStudent(@RequestBody Student student)
    {
        student = service.addstudent(student);

        return new ResponseEntity< >(student, HttpStatus.CREATED);
    }


}


//@PutMapping
//@DeleteMapping
