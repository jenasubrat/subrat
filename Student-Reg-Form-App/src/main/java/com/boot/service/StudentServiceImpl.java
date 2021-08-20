package com.boot.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.bindings.StudentBindings;
import com.boot.entity.StudentEntity;
import com.boot.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
    private StudentRepository studentRepo;
	
	@Override
	public boolean saveStudent(StudentBindings student) {
		
		StudentEntity entity=new StudentEntity();
		BeanUtils.copyProperties(student, entity);
		StudentEntity savedEntity=studentRepo.save(entity);
		return true;
	}

}
