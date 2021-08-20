package com.boot.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="STUDENT_REG")
public class StudentEntity {
	private String name;
	private String adress;
	private Long mobileno;
	private String city;
	private String gender;
	private String[] hobbies;


}
