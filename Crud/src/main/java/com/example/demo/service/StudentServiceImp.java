package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;


@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentRepository studentRepository;
	@Override
	public Student saveStudent(Student Std) {
		// TODO Auto-generated method stub
		return studentRepository.save(Std);
	}
	@Override
	public Student getStudentById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteEmployee(Integer id) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean updateById(int id) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void updateEntity(Student sdt) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
