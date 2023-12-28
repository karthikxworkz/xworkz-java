package com.xworkz.googleApps.Dto;

public class GoogleApplicationDto {
	
	 private String applicationName;
	 private String applicationID;
	 private String applicationCost;
	 private String applicationVersion;
	 private int applicationStorage;
	 private int applicationLimit;
	 
	 public GoogleApplicationDto() {
		 System.out.println("No argument constructor");
	 }
	 
	public GoogleApplicationDto(String applicationName, String applicationID, String applicationCost,
			String applicationVersion, int applicationStorage, int applicationLimit) {
		System.out.println("All argument constructor");
		this.applicationName = applicationName;
		this.applicationID = applicationID;
		this.applicationCost = applicationCost;
		this.applicationVersion = applicationVersion;
		this.applicationStorage = applicationStorage;
		this.applicationLimit = applicationLimit;
	}

	public String getApplicationName() {
		return applicationName;
	}

	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	public String getApplicationID() {
		return applicationID;
	}

	public void setApplicationID(String applicationID) {
		this.applicationID = applicationID;
	}

	public String getApplicationCost() {
		return applicationCost;
	}

	public void setApplicationCost(String applicationCost) {
		this.applicationCost = applicationCost;
	}

	public String getApplicationVersion() {
		return applicationVersion;
	}

	public void setApplicationVersion(String applicationVersion) {
		this.applicationVersion = applicationVersion;
	}

	public int getApplicationStorage() {
		return applicationStorage;
	}

	public void setApplicationStorage(int applicationStorage) {
		this.applicationStorage = applicationStorage;
	}

	public int getApplicationLimit() {
		return applicationLimit;
	}

	public void setApplicationLimit(int applicationLimit) {
		this.applicationLimit = applicationLimit;
	}

	@Override
	public String toString() {
		return "GoogleApplicationDto [applicationName=" + applicationName + ", applicationID=" + applicationID
				+ ", applicationCost=" + applicationCost + ", applicationVersion=" + applicationVersion
				+ ", applicationStorage=" + applicationStorage + ", applicationLimit=" + applicationLimit + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((applicationCost == null) ? 0 : applicationCost.hashCode());
		result = prime * result + ((applicationID == null) ? 0 : applicationID.hashCode());
		result = prime * result + applicationLimit;
		result = prime * result + ((applicationName == null) ? 0 : applicationName.hashCode());
		result = prime * result + applicationStorage;
		result = prime * result + ((applicationVersion == null) ? 0 : applicationVersion.hashCode());
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
		GoogleApplicationDto other = (GoogleApplicationDto) obj;
		if (applicationCost == null) {
			if (other.applicationCost != null)
				return false;
		} else if (!applicationCost.equals(other.applicationCost))
			return false;
		if (applicationID == null) {
			if (other.applicationID != null)
				return false;
		} else if (!applicationID.equals(other.applicationID))
			return false;
		if (applicationLimit != other.applicationLimit)
			return false;
		if (applicationName == null) {
			if (other.applicationName != null)
				return false;
		} else if (!applicationName.equals(other.applicationName))
			return false;
		if (applicationStorage != other.applicationStorage)
			return false;
		if (applicationVersion == null) {
			if (other.applicationVersion != null)
				return false;
		} else if (!applicationVersion.equals(other.applicationVersion))
			return false;
		return true;
	}

	 
	
}
