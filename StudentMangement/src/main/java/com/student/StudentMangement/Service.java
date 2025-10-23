package com.student.StudentMangement;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

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

    public Student updatestudent(int id , Student student)
    {
        Student S1 = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
        S1.setName(student.getName());
        S1.setAge(student.getAge());
        S1.setCourse(student.getCourse());
        return studentRepository.save(student);
    }
}
