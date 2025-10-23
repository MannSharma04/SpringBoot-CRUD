package com.student.StudentMangement;

import jakarta.persistence.Id;
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


    @GetMapping("/getallstudents")
    public List<Student> getallStudent() {
        return service.getallstudent();
    }
    @PostMapping("/createstudent")
    public ResponseEntity<Student> addStudent(@RequestBody Student student)
    {
        student = service.addstudent(student);

        return new ResponseEntity< >(student, HttpStatus.CREATED);
    }
    @PutMapping("/{Id}")
    public ResponseEntity<Student> updateStudent(@PathVariable(value = "Id") int id , @RequestBody Student newstudent)
    {
    Student Updatedstudent = service.updatestudent(id , newstudent);
    return new ResponseEntity< >(Updatedstudent, HttpStatus.CREATED);
    }




}


//@PutMapping
//@DeleteMapping
