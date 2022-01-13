package com.awanish.springdatajpa;

import org.springframework.data.jpa.repository.JpaRepository;

import com.awanish.springdatajpa.entites.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
