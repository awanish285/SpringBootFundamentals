package com.awanish.springdatajpa;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.awanish.springdatajpa.entites.Student;

@SpringBootTest
class SpringdatajpaApplicationTests {
    @Autowired
	private StudentRepo studentrepo;
	
	@Test
	public void testSaveStudent() {
		Student student = new Student();
		student.setId(1);
		student.setName("Mark");
		student.setTestScore(100);
		studentrepo.save(student);
		
		Student saveStudent = studentrepo.findById(1).get();
		assertNotNull(saveStudent);
	}

}
