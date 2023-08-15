package com.nosql.demo.cassandra.controller;

import com.nosql.demo.cassandra.exception.ResourceNotFoundException;
import com.nosql.demo.cassandra.model.Student;
import com.nosql.demo.cassandra.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentController {


    @Autowired
    StudentRepository studentRepository;


    @RequestMapping("/students")
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }

    @RequestMapping("/students/{studentId}")
    public Student getStudents(@PathVariable Integer studentId){
        return studentRepository.findById(studentId).orElseThrow(() -> new ResourceNotFoundException("Student not available for the id: "+studentId));
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/students/{studentId}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Integer studentId){
        Student student =  studentRepository.findById(studentId).orElseThrow(() -> new ResourceNotFoundException("Student not available for the id: "+studentId));
        studentRepository.delete(student);
        return ResponseEntity.ok().build();
    }

    @RequestMapping(method = RequestMethod.POST, path = "/students")
    public Student addStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }

}
