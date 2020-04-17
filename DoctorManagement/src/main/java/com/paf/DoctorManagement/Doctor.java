package com.paf.DoctorManagement;

//import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Doctor {

	private int ID;
	private String Name;
	private int Age;
	private String DateofBirth;
	private int ContactNo;
	private String Email;
	private String Address;
	private String NIC;
	private String Gender;
	private String Specialization;
	private String RegHospital;
	private String JoinDate;
	
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getDateofBirth() {
		return DateofBirth;
	}
	public void setDateofBirth(String dateofBirth) {
		DateofBirth = dateofBirth;
	}
	public int getContactNo() {
		return ContactNo;
	}
	public void setContactNo(int contactNo) {
		ContactNo = contactNo;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getNIC() {
		return NIC;
	}
	public void setNIC(String nIC) {
		NIC = nIC;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getSpecialization() {
		return Specialization;
	}
	public void setSpecialization(String specialization) {
		Specialization = specialization;
	}
	public String getRegHospital() {
		return RegHospital;
	}
	public void setRegHospital(String regHospital) {
		RegHospital = regHospital;
	}
	public String getJoinDate() {
		return JoinDate;
	}
	public void setJoinDate(String joinDate) {
		JoinDate = joinDate;
	}
	@Override
	public String toString() {
		return "Doctor [ID=" + ID + ", Name=" + Name + ", Age=" + Age + ", DateofBirth=" + DateofBirth + ", ContactNo="
				+ ContactNo + ", Email=" + Email + ", Address=" + Address + ", NIC=" + NIC + ", Gender=" + Gender
				+ ", Specialization=" + Specialization + ", RegHospital=" + RegHospital + ", JoinDate=" + JoinDate
				+ "]";
	}
	
	
	
}
