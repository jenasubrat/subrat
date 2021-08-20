package com.boot.domain;

import lombok.Data;

@Data
public class Student {
	
	private String name;
	private String adress;
	private Long mobileno;
	private String city;
	private String gender;
	private String[] hobbies;

}
