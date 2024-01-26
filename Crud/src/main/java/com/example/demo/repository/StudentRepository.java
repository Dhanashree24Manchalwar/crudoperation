package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.io.Serializable;

import com.example.demo.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Serializable> {

	Student save(Student std);

}
