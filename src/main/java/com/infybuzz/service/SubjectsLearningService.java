package com.infybuzz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infybuzz.entity.SubjectsLearning;
import com.infybuzz.repository.SubjectsLearningRepository;

@Service
public class SubjectsLearningService {

    @Autowired
    private SubjectsLearningRepository subjectsLearningRepository;

    public List<SubjectsLearning> getAllSubjectsLearnings() {
        return subjectsLearningRepository.findAll();
    }

    public SubjectsLearning getById(Long id) {
        return subjectsLearningRepository.findById(id).get();
    }

    public SubjectsLearning createSubjectsLearning(SubjectsLearning subjectsLearning) {
        return subjectsLearningRepository.save(subjectsLearning);
    }

    public SubjectsLearning updateSubjectsLearning(SubjectsLearning subjectsLearning) {
        return subjectsLearningRepository.save(subjectsLearning);
    }

    public String deleteSubjectsLearning(Long id) {
        subjectsLearningRepository.deleteById(id);
        return "Subjects Learning has been deleted";
    }
}
