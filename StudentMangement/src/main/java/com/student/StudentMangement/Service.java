package com.student.StudentMangement;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class Service
{
    @Autowired
    StudentRepository studentRepository;
    public List<Student> getallstudent ()
    {
        List<Student> Students = studentRepository.findAll();
        return Students;
    }

    public Student addstudent(Student student)
    {
        return studentRepository.save(student);
    }
}
