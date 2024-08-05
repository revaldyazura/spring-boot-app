package com.infybuzz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.infybuzz.entity.SubjectsLearning;

@Repository
public interface SubjectsLearningRepository extends JpaRepository<SubjectsLearning, Long> {

}
