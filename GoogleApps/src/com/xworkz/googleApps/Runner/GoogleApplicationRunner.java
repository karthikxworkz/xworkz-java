package com.xworkz.googleApps.Runner;

import com.xworkz.googleApps.Dto.GoogleApplicationDto;
import com.xworkz.googleApps.Repository.GoogleApplicationRepository;
import com.xworkz.googleApps.Repository.GoogleApplicationRepositoryImplementation;
import com.xworkz.googleApps.Service.GoogleApplicationService;
import com.xworkz.googleApps.Service.GoogleApplicationServiceImplementation;

public class GoogleApplicationRunner {
	public static void main(String[] args) {
		GoogleApplicationDto googleApplicationDto = new GoogleApplicationDto();
		googleApplicationDto.setApplicationID("G001");
		googleApplicationDto.setApplicationName("null");
		googleApplicationDto.setApplicationCost("null");
		googleApplicationDto.setApplicationVersion("null");
		googleApplicationDto.setApplicationStorage(0);
		googleApplicationDto.setApplicationLimit(0);
		System.out.println(googleApplicationDto.toString());
		
		GoogleApplicationRepository repository=new GoogleApplicationRepositoryImplementation();
		GoogleApplicationService service=new GoogleApplicationServiceImplementation(repository);
		service.validateAndsave(googleApplicationDto);
		
	
		
		
	}

}

	