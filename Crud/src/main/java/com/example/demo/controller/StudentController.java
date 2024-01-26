package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	

	@Autowired
	private StudentService studentservice;
	
	@PostMapping("/saveStudent")
	public ResponseEntity<Student>saveStudent(@RequestBody Student std){
		
		Student s=studentservice.saveStudent(std);
		return ResponseEntity.ok().body(s);
	}
	@GetMapping("/getdata")
	public String getTest() {

		return "student data";
	}


	
	@GetMapping("/get/{id}")
	public ResponseEntity<Student> getEmployeeById(@PathVariable("id") Integer id) {
		Student s1 = studentservice.getStudentById(id);
		return ResponseEntity.ok().body(s1);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteEmployeeById(@PathVariable("id") Integer id) throws Exception {
		studentservice.deleteEmployee(id);
	}

	 @PutMapping("/update/{id}")
	    public ResponseEntity<String> updateResource(@PathVariable int id, @RequestBody Student sdt) {
	       
	        if (studentservice.updateById(id)) {
	          
	        	sdt.setId(id);

	           
	            studentservice.updateEntity(sdt);
	            return ResponseEntity.ok("Resource updated successfully");
	        } else {
	           
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Resource not found");
	        }
}
	

}
