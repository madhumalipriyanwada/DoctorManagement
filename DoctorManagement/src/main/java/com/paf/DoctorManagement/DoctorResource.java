package com.paf.DoctorManagement;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.PathParam;

@Path("doctors")
public class DoctorResource {

	DoctorRepository repo = new DoctorRepository();
	
	@GET
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public List<Doctor> getDoctor() {
		
		System.out.println("getDoctor called...");
		
		return repo.getDoctor();
	}
	
	@GET
	@Path("doctor/{id}")
	@Produces({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	
	public Doctor getAlien(@PathParam("id") int id) {
		
		return repo.getDoctor(id);
	}
	
	@POST
	@Path("doctor")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Doctor CreateAlien(Doctor a1) {
		System.out.println(a1);
		repo.create(a1);
		
		return a1;
	}
	
	@PUT
	@Path("doctor")
	@Consumes({MediaType.APPLICATION_JSON,MediaType.APPLICATION_XML})
	public Doctor UpdateDoctor(Doctor a1) {
		
		System.out.println(a1);
		
		if(repo.getDoctor(a1.getID()).getID()==0) {
			
			repo.create(a1);
		}
		else
		{
			
			repo.update(a1);
		}
		
		return a1;
	}
	
	@DELETE
	@Path("doctor/{ID}")
	public Doctor DeleteDoctor(@PathParam("ID") int ID) {
		
		Doctor a = repo.getDoctor(ID);
		
		if(a.getID()!=0) {
			repo.delete(ID);
		}
		return a;
	}
	
}
