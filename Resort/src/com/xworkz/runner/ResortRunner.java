package com.xworkz.runner;

import com.xworkx.constants.ResortName;
import com.xworkz.abstracts.ResortAbstact;
import com.xworkz.dto.ResortDto;
import com.xworkz.implementation.ResortImpl;

public class ResortRunner {
	public static void main(String[] args) {
		ResortDto r = new ResortDto();
		ResortAbstact ra=new ResortImpl();
		r.setAddress("banglore");
	    r.setContactNumber(788987899l);
		r.setEmail("hj");
		r.setId("1");
		r.setName(ResortName.A2b);
		r.setReview("g");
		ra.onSave(r);
		
		ResortDto r1 = new ResortDto();
		r1.setAddress("banglore");
		r1.setContactNumber(788987899l);
		r1.setEmail("hj");
		r1.setId("2");
		r1.setName(ResortName.A3B);
		r1.setReview("g");
		ra.onSave(r1);
		ra.read();
		ra.searchResortId("1");
		ra.searchEmailID("hj");
		System.out.println(ra.searchEmailID("hj"));
		System.out.println(ra.updateByEmailId("hj", "gh"));
		ra.deleteById("1");
		System.out.println(" ");
		ra.read();	
	}
}
