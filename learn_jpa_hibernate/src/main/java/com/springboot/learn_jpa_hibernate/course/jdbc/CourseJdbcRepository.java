package com.springboot.learn_jpa_hibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.learn_jpa_hibernate.course.Course;

@Repository
public class CourseJdbcRepository {

	@Autowired
	private JdbcTemplate springJdbcTemplate;
	
	private static String SELECT_QUERY = 
			"""
			SELECT * FROM course;
			""";
	
	private static String SELECT_QUERY_BY_ID = 
			"""
			SELECT * FROM course WHERE id = ?;
			""";
	
	private static String INSERT_QUERY = 
			"""
			INSERT INTO course (id, name, author)
			VALUES (?, ?, ?);
			""";
	
	private static String DELETE_QUERY = 
			"""
			DELETE FROM course WHERE id = ?;
			""";
	
	public Course findById(long id) {
		return springJdbcTemplate.queryForObject(SELECT_QUERY_BY_ID, new BeanPropertyRowMapper<>(Course.class), id);
		//ResultSet -> Bean => Row Mapper =>
	}
	
	public void insert(Course course) {
		springJdbcTemplate.update(INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}
	
	public void deleteById(long id) {
		springJdbcTemplate.update(DELETE_QUERY, id);
	}
}
