package com.neosoft.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//-----------Lombok---------------
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter

@Entity
@Table(name = "USER_TABLE")

public class User {

	@Id // Taking Id as Primary key
	@GeneratedValue(strategy = GenerationType.AUTO) // For Auto generation of ID
	private int id;

	@NotBlank(message = "Name should not be null") // Validations
	private String name;

	@NotBlank(message = "Surname should not be null")
	private String surName;

	@NotBlank(message = "DOB should not be null")
	private String dob;

	@NotBlank(message = "Joining Date should not be null")
	private String joiningDate;

	@NotBlank(message = "State should not be null")
	private String state;

	@NotBlank(message = "Pincode should not be null")
	private String pincode;

	public Integer getId() {
	
		return null;
	}

	public Object getName() {
		
		return null;
	}

	public void setName(Object name2) {
		
		
	}

	public Object getSurName() {
		
		return null;
	}

	public void setSurName(Object surName2) {
		
	}

	public Object getDob() {
		
		return null;
	}

	public void setDob(Object dob2) {
		
	}

	public Object getJoiningDate() {
		
		return null;
	}

	public void setJoiningDate(Object joiningDate2) {
		
		
	}

	public Object getState() {
		
		return null;
	}

	public void setState(Object state2) {
	
		
	}

	public Object getPincode() {
		
		return null;
	}

	public void setPincode(Object pincode2) {
		
		
	}

}
