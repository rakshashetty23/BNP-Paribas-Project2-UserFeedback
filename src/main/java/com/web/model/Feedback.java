package com.web.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Entity
public class Feedback {

	@Id
	private int id;
	private String name;
	private String emailId;
	private Date dob; 
	@Min(value=1, message="rating value cannot be less than 1")  
    @Max(value=10, message="rating value cannot be more than 10")  
	private int rating;
	private String suggestion;
	
	
	public Feedback() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Feedback(int id, String name, String emailId, Date dob, int rating, String suggestion) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.dob = dob;
		this.rating = rating;
		this.suggestion = suggestion;
	}

	
	public Date getDob() {
		return dob;
	}

	
	public void setDob(Date dob) {
		this.dob = dob;
	}

	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	public String getSuggestion() {
		return suggestion;
	}


	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}


	@Override
	public String toString() {
		return "Feedback [id=" + id + ", name=" + name + ", emailId=" + emailId + ", rating=" + rating
				+ ", suggestion=" + suggestion + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Feedback other = (Feedback) obj;
		if (id != other.id)
			return false;
		return true;
	}


	
	
	
	
}
