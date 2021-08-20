package com.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.boot.domain.Student;

@Controller
public class StudentController {
	
	@ModelAttribute
	public void init(Model model) {
		Student s=new Student();
		model.addAttribute("student",s);
	}
	@GetMapping(value= {"/","/register"})
	public String loadForm(Model model) {
		Student s=new Student();
		model.addAttribute("student",s);
		return "studentReg";
	}
	@PostMapping(value="/register")
	public String handleSubmitBtn(@ModelAttribute("student")Student student,Model model) {
		System.out.println(student);
		model.addAttribute("Succmsg","Registration Succesfully");
		return "regSuccess";
	}

}
