package com.xworkz.googleApps.Repository;

import com.xworkz.googleApps.Dto.GoogleApplicationDto;

public class GoogleApplicationRepositoryImplementation implements GoogleApplicationRepository{
       
	   private GoogleApplicationDto[] googleAppsDtos=new GoogleApplicationDto[5];
	   private int index=0;

	@Override
	public boolean onSave(GoogleApplicationDto googleApplicationDto) {
		if(index<googleAppsDtos.length) {
			googleAppsDtos[index]=googleApplicationDto;
			index++;
			return true;
		}
		return false;
	}

	@Override
	public GoogleApplicationDto[] read() { 
		
		return googleAppsDtos;
	}

}
