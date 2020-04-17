package com.paf.DoctorManagement;

import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import java.sql.Connection;
//import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DoctorRepository {
	
	
	Connection con = null;
	
	
	public DoctorRepository() {
		
		try {
			
				// Connect to Database
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3308/DocManagement","root","");
				System.out.println("Successfully Connected");
		}
		catch(Exception e) {
			
			System.out.println(e);
		}
	}
	
	
	public List<Doctor> getDoctor() {
		
		List<Doctor> doctors = new ArrayList<>(); 
		String sql = "select * from DoctorTb"; //View all Added Doctors from Database
		
		try {
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				
				Doctor a = new Doctor();
				
				a.setID(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setAge(rs.getInt(3));
				a.setDateofBirth(rs.getString(4));
				a.setContactNo(rs.getInt(5));
				a.setEmail(rs.getString(6));
				a.setAddress(rs.getString(7));
				a.setNIC(rs.getString(8));
				a.setGender(rs.getString(9));
				a.setSpecialization(rs.getString(10));
				a.setRegHospital(rs.getString(11));
				a.setJoinDate(rs.getString(12));
				
				doctors.add(a);
			}
		}
		catch(Exception e) {
			
			System.out.println(e);
		}
		return doctors;
	}
	
	
	public Doctor getDoctor(int ID) {
		
		String sql = "select * from DoctorTb where ID ="+ID; // View Doctor Using Id
		
		Doctor a = new Doctor();
		try {
			
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			
			if(rs.next()) {
				
				a.setID(rs.getInt(1));
				a.setName(rs.getString(2));
				a.setAge(rs.getInt(3));
				a.setDateofBirth(rs.getString(4));
				a.setContactNo(rs.getInt(5));
				a.setEmail(rs.getString(6));
				a.setAddress(rs.getString(7));
				a.setNIC(rs.getString(8));
				a.setGender(rs.getString(9));
				a.setSpecialization(rs.getString(10));
				a.setRegHospital(rs.getString(11));
				a.setJoinDate(rs.getString(12));
			}
		}
		catch(Exception e) {
			
			System.out.println(e);
		}
		return a;
	}


	public void create(Doctor a1) {
		
		String sql = "insert into DoctorTb value(?,?,?,?,?,?,?,?,?,?,?,?)"; //Insert Doctors details to Database
		
		try {
			
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1, a1.getID());
			st.setString(2, a1.getName());
			st.setInt(3, a1.getAge());
			st.setString(4, a1.getDateofBirth());
			st.setInt(5, a1.getContactNo());
			st.setString(6, a1.getEmail());
			st.setString(7, a1.getAddress());
			st.setString(8, a1.getNIC());
			st.setString(9, a1.getGender());
			st.setString(10, a1.getSpecialization());
			st.setString(11, a1.getRegHospital());
			st.setString(12, a1.getJoinDate());
			
			st.executeUpdate();
		}
		catch(Exception e) {
			
			System.out.println(e);
		}
	}



	public void update(Doctor a1) {
		
		//Update Doctor details 
		String sql = "update DoctorTb set Name=?,Age=?,DateofBirth=?,ContactNo=?,Email=?,Address=?,NIC=?,Gender=?,Specialization=?,RegHospital=?,JoinDate=? where ID=?";
		try {
			
			PreparedStatement st = con.prepareStatement(sql);
			
			st.setString(1, a1.getName());
			st.setInt(2, a1.getAge());
			st.setString(3, a1.getDateofBirth());
			st.setInt(4, a1.getContactNo());
			st.setString(5, a1.getEmail());
			st.setString(6, a1.getAddress());
			st.setString(7, a1.getNIC());
			st.setString(8, a1.getGender());
			st.setString(9, a1.getSpecialization());
			st.setString(10, a1.getRegHospital());
			st.setString(11, a1.getJoinDate());
			st.setInt(12, a1.getID());
			st.executeUpdate();
		}
		catch(Exception e) {
			
			System.out.println(e);
		}
		
	}



	public void delete(int ID) {
		
		String sql = "delete from DoctorTb where ID=?"; //Delete Doctor details from Database
		
		try {
			
			PreparedStatement st = con.prepareStatement(sql);
			st.setInt(1,ID);
			st.executeUpdate();
		}
		catch(Exception e) {
			
			System.out.println(e);
		}
	}
		
}
	
	

	

	

