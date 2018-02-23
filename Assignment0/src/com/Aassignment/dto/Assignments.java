package com.Aassignment.dto;
import javax.faces.bean.ManagedBean;
import javax.inject.Named;
import org.springframework.context.annotation.Scope;


@Named
@ManagedBean
@Scope("session")
public class Assignments {
	String name;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
