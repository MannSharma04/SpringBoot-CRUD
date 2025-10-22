package com.student.StudentMangement;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jdk.jfr.DataAmount;
import lombok.*;

@Entity
@Table(name = "Student")
@Data
public class Student
{
    @Id
    private int Id ;
    private String Name ;
    private String Course ;
    private int age ;
}
