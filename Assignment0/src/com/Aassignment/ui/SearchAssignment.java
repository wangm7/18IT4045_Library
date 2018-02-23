package com.Aassignment.ui;

import javax.faces.bean.ManagedBean;
import javax.inject.Inject;
import javax.inject.Named;
import org.springframework.context.annotation.Scope;

import com.Aassignment.dto.Assignments;


@Named
@ManagedBean
@Scope("session")

public class SearchAssignment {
	@Inject
	private Assignments assignment;
	public Assignments getAssignment() {
		return assignment;
	}
	public void setAssignment(Assignments assignment) {
		this.assignment = assignment;
	}
	
	public String execute() {
		if(assignment != null && assignment.getName().equalsIgnoreCase("java")) {
			return "search";
		}else {
			return "noresults";
		}
	
	}
}
