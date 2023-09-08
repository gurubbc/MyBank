package com.ofss.model;
import java.util.*;

import com.ofss.service.Services;
public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private Date dateOfBirth; 
	private char gender;
	private long phoneNumber; // 9288567182
	private String emailId;
	private String address;
	private long aadharId;
	private String panCardId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public long getAadharId() {
		return aadharId;
	}
	public void setAadharId(long aadharId) {
		this.aadharId = aadharId;
	}
	public String getPanCardId() {
		return panCardId;
	}
	public void setPanCardId(String panCardId) {
		this.panCardId = panCardId;
	}
	
	
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
				+ ", dateOfBirth=" + dateOfBirth + ", gender=" + gender + ", phoneNumber=" + phoneNumber + ", emailId="
				+ emailId + ", address=" + address + ", aadharId=" + aadharId + ", panCardId=" + panCardId + "]";
	}
	
	
	
	
	
	
	
	
	
}
