package com.springboot.learn_jpa_hibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.springboot.learn_jpa_hibernate.course.jdbc.CourseJdbcRepository;
import com.springboot.learn_jpa_hibernate.course.jpa.CourseJpaRepository;
import com.springboot.learn_jpa_hibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	@Override
	public void run(String... args) throws Exception {
//		repository.insert();
		//Spring Jdbc and JPA
//		repository.insert(new Course(4, "Alibaba", "Course 5"));
		
		//Spring Data JPA
//		repository.save(new Course(4, "Oracle", "Course 4"));
		
//		repository.deleteById(4);
		
		//Spring Data JPA
//		repository.deleteById(4l);
		
//		System.out.println(repository.findById(1));
//		System.out.println(repository.findById(2));
		
		//Spring Data JPA
//		System.out.println(repository.findById(1l));
//		System.out.println(repository.findById(2l));
//		System.out.println(repository.findAll());
//		System.out.println(repository.count());
		System.out.println(repository.findByAuthor("Course 2"));
	}
	
}
