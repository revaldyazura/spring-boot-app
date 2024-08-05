package com.infybuzz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infybuzz.entity.Department;
import com.infybuzz.entity.Student;
// import com.infybuzz.entity.model.StudentModel;
import com.infybuzz.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    // @Autowired
    // private DepartmentRepository departmentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getById(Long id) {
        return studentRepository.findById(id).get();
    }

    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }
    // public Student createStudent(StudentModel student) {
    // Student std = new Student();
    // Department dpt = new Department();
    // dpt.setId(student.getDepartment());
    // std.setFirstName(student.getFirstName());
    // std.setLastName(student.getLastName());
    // std.setEmail(student.getEmail());
    // std.setDepartment(dpt);

    // return studentRepository.save(std);
    // }
    // public Student createStudent(StudentModel student) {
    // Student std = new Student();
    // Department dpt =
    // departmentRepository.findById(student.getDepartment()).get();
    // std.setFirstName(student.getFirstName());
    // std.setLastName(student.getLastName());
    // std.setEmail(student.getEmail());
    // std.setDepartment(dpt);
    // return studentRepository.save(std);
    // }

    public Student updateStudent(Student student) {
        return studentRepository.save(student);
    }

    public String deleteStudent(Long id) {
        studentRepository.deleteById(id);
        return "Student has been deleted";
    }
}
