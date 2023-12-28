package com.xworkz.googleApps.Repository;

import com.xworkz.googleApps.Dto.GoogleApplicationDto;

public interface GoogleApplicationRepository {
	
	boolean onSave(GoogleApplicationDto  googleApplicationDto);
	GoogleApplicationDto[] read();

}
