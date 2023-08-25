package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="BabyDetails")
public class Babymodel 
{
	@Id
	private int babyid;
	private String babyFirstname;
	private String babyLastname;
	private String fatherName;
	private String motherName;
	private String address;
	public int getBabyid() {
		return babyid;
	}

	public void setBabyid(int babyid) {
		this.babyid = babyid;
	}

	public String getBabyFirstname() {
		return babyFirstname;
	}

	public void setBabyFirstname(String babyFirstname) {
		this.babyFirstname = babyFirstname;
	}

	public String getBabyLastname() {
		return babyLastname;
	}

	public void setBabyLastname(String babyLastname) {
		this.babyLastname = babyLastname;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Babymodel(int babyid, String babyFirstname, String babyLastname, String fatherName, String motherName,
			String address) {
		super();
		this.babyid = babyid;
		this.babyFirstname = babyFirstname;
		this.babyLastname = babyLastname;
		this.fatherName = fatherName;
		this.motherName = motherName;
		this.address = address;
	}

	public Babymodel() {
		super();
		// TODO Auto-generated constructor stub
		
	}
	

}