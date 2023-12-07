package com.xworkz.dto;

import com.xworkx.constants.ResortName;

public class ResortDto {
	private ResortName name;
	private String id;
	private String email;
	private long contactNumber;
	private String address;
	private String review;
	
	public ResortDto() {
		System.out.println("no args constructor");
	}

	public ResortDto(ResortName name, String id, String email, long contactNumber, String address, String review) {
		System.out.println("Paramertised constructor");
		this.name = name;
		this.id = id;
		this.email = email;
		this.contactNumber = contactNumber;
		this.address = address;
		this.review = review;
	}

	public ResortName getName() {
		return name;
	}

	public void setName(ResortName a2b) {
		this.name = a2b;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}
	
	public String toString() {
		return "Id:"+id+
				"Name:"+name+
				"Email:"+email+
				"Contact Number:"+contactNumber+
				"Address:"+address+
				"review:"+review+")";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + (int) (contactNumber ^ (contactNumber >>> 32));
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((review == null) ? 0 : review.hashCode());
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
		ResortDto other = (ResortDto) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (contactNumber != other.contactNumber)
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (review == null) {
			if (other.review != null)
				return false;
		} else if (!review.equals(other.review))
			return false;
		return true;
	}
}
