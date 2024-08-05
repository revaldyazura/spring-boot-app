package com.infybuzz.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infybuzz.entity.SubjectsLearning;
import com.infybuzz.service.SubjectsLearningService;

@RestController
@RequestMapping("/api")
public class SubjectsLearningController {
    @Autowired
    private SubjectsLearningService subjectsLearningService;

    @GetMapping("/subjectslearning")
    public List<SubjectsLearning> getAllSubjectsLearnings() {
        return subjectsLearningService.getAllSubjectsLearnings();
    }

    @GetMapping("/subjectslearning/{id}")
    public SubjectsLearning getById(@PathVariable Long id) {
        return subjectsLearningService.getById(id);
    }

    @PostMapping("/subjectslearning/create")
    public SubjectsLearning createSubjectsLearning(@RequestBody SubjectsLearning subjectsLearning) {
        // TODO: process POST request

        return subjectsLearningService.createSubjectsLearning(subjectsLearning);
    }

    @PutMapping("/Subjectslearning/update")
    public SubjectsLearning updateSubjectsLearning(@RequestBody SubjectsLearning subjectsLearning) {
        return subjectsLearningService.updateSubjectsLearning(subjectsLearning);
    }

    @DeleteMapping("/subjectslearning/delete/{id}")
    public String deleteSubjectsLearning(@PathVariable Long id) {
        return subjectsLearningService.deleteSubjectsLearning(id);
    }
}
