package com.infybuzz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infybuzz.entity.Student;
// import com.infybuzz.entity.model.StudentModel;
import com.infybuzz.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api")

/**
 * StudentController
 */
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/std")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @GetMapping("/std/{id}")
    public Student getById(@PathVariable Long id) {
        return studentService.getById(id);
    }

    @PostMapping("/std/create")
    public Student createStudent(@RequestBody Student student) {
        // TODO: process POST request

        return studentService.createStudent(student);
    }
    // public Student createStudent(@RequestBody StudentModel student) {
    // // TODO: process POST request

    // return studentService.createStudent(student);
    // }

    @PutMapping("/std/update")
    public Student updateStudent(@RequestBody Student student) {
        return studentService.updateStudent(student);
    }

    @DeleteMapping("/std/delete/{id}")
    public String deleteStudent(@PathVariable Long id) {
        return studentService.deleteStudent(id);
    }
}
