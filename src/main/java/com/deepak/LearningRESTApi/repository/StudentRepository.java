package com.deepak.LearningRESTApi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import  com.deepak.LearningRESTApi.entity.*;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
