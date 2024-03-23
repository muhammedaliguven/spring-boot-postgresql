package com.example.springbootpostgresql.repository;

import com.example.springbootpostgresql.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> { }
