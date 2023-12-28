package com.xworkz.googleApps.Service;

import com.xworkz.googleApps.Dto.GoogleApplicationDto;
import com.xworkz.googleApps.Repository.GoogleApplicationRepository;

public class GoogleApplicationServiceImplementation implements GoogleApplicationService{
	
	 private GoogleApplicationRepository repository;

	public GoogleApplicationServiceImplementation(GoogleApplicationRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public boolean validateAndsave(GoogleApplicationDto googleApplicationDto) {
		boolean valiadatename=true;
		boolean validateID=true;
		boolean validateCost=true;
		boolean validateVersion=true;
		boolean validateStorage=true;
		boolean validateLimit=true;
		
		if(googleApplicationDto!=null) {
			if(googleApplicationDto.getApplicationName()==null||googleApplicationDto.getApplicationName().equals("null")||googleApplicationDto.getApplicationName().length()<3&&googleApplicationDto.getApplicationName().length()>30) {
				System.out.println("Validating the length condition of Name");
				 valiadatename = false;
		}
		
		if(googleApplicationDto.getApplicationID()==null||googleApplicationDto.getApplicationID().equals("null")||googleApplicationDto.getApplicationID().length()<3&&googleApplicationDto.getApplicationID().length()>30
				||googleApplicationDto.getApplicationID().startsWith("G")) {
			System.out.println("Valiadating the length condition of ID");
			validateID=false;
		}
		
	   if(googleApplicationDto.getApplicationCost()==null||googleApplicationDto.getApplicationCost().equals("null")||googleApplicationDto.getApplicationCost().length()<3&&googleApplicationDto.getApplicationCost().length()>30) {
		   System.out.println("Validating the length condition of Cost");
		   validateCost=false;
	   }
	   
	   if(googleApplicationDto.getApplicationVersion()==null||googleApplicationDto.getApplicationVersion().equals("null")||googleApplicationDto.getApplicationVersion().length()<3&& googleApplicationDto.getApplicationVersion().length()>30) {
		   System.out.println("Validating the length condition of version");
		   validateVersion=false;
	   }
	   
	   if(googleApplicationDto.getApplicationStorage()==0||googleApplicationDto.getApplicationStorage()<0) {
		   System.out.println("Validating the length condition of Storage");
		   validateStorage=false;
	   }
	   
	   if(googleApplicationDto.getApplicationLimit()==0||googleApplicationDto.getApplicationLimit()<0) {
		   System.out.println("Validating the length condition of Limit");
		   validateLimit=false;
	   }
	   
	   
		}
		if(valiadatename==true&&validateID==true&&validateCost==true&&validateVersion==true&&validateStorage==true&&validateLimit==true) {
			boolean save=repository.onSave(googleApplicationDto);
			System.out.println("Element is :"+save);
		}
		return false;
	}
	

}
