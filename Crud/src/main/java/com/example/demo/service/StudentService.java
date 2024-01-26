package com.example.demo.service;

import com.example.demo.model.Student;

public interface StudentService {

	public Student saveStudent(Student Std);

	public Student getStudentById(Integer id);

	public void deleteEmployee(Integer id);

	public boolean updateById(int id);

	public void updateEntity(Student sdt);

	

	

	
}
