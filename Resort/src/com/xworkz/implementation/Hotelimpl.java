package com.xworkz.implementation;

import com.xworkz.abstracts.HotelAbstract;
import com.xworkz.dto.HotelDto;

public class Hotelimpl extends HotelAbstract{
	   

	int index=0;
	Object[] obj=new Object[4];
	@Override
	public boolean onSave(HotelDto hotelDto) {
	   if(hotelDto!=null) {
		   if(index<obj.length) {
			   obj[index]=hotelDto;
			   index++;
		   }
		   return true;
	   }
	   else {
		   System.out.println("null");
	   }
		return false;
	}

	@Override
	public void read() {
		for(Object object:obj) {
			System.out.println(object);
		}
	}

	@Override
	public void searchByaddresss(String addresss) {
	      for(Object object:obj) {
	    	  if(object!=null) {
	    		 HotelDto hotelDto=(HotelDto)object;
	    		 if(hotelDto.getHostelName().equals(addresss)) {
	    			 System.out.println(hotelDto);
	    		 } 
	    	  }
	      }
	    }

	@Override
	public void searchByhotelName(String hotelname) {
		for(Object object:obj) {
			if(object!=null) {
				HotelDto hotelDto=(HotelDto)object;
				if(hotelDto.getHostelName().equals(hotelname)) {
					System.out.println(hotelDto);
				}
			}
		}
		
	}


}
