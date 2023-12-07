package com.xworkz.implementation;

import com.xworkz.abstracts.ResortAbstact;
import com.xworkz.dto.ResortDto;

public class ResortImpl extends ResortAbstact{
	
	int index=0;
	Object[] obj=new Object[4];
	@Override
	public boolean onSave(ResortDto resortDto) {
		if(resortDto!=null) {
			if(index<obj.length) {
				obj[index]=resortDto;
				index++;
			}
			return true;
		}else {
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
	public void searchResortId(String id) {
		for(Object object:obj) {
			if(object!=null) {
			ResortDto resortDto=(ResortDto)object;
			if(resortDto.getId().equals(id)) {
				System.out.println(resortDto);
				}
			}	
		}
	}
     public void searchResortName(String name) {
    	 for(Object object:obj) {
    		 if(object!=null) {
    			 ResortDto resortDto=(ResortDto) object;
    			 if(resortDto.getName().equals(name)) {
    				 System.out.println(resortDto);
    			 }
    		 }
    	 }
     }
	@Override
	public ResortDto searchEmailID(String email) {
		for(Object object:obj) {
			if(object!=null) {
				ResortDto resortDto=(ResortDto)object;
				if(resortDto.getEmail().equals(email)) {
					return resortDto;
				}
			}
		}
		return null;
	}
	
	@Override
	public ResortDto updateByEmailId(String oldemail, String newemail) {
		for(Object object:obj) {
			if(object!=null) {
				ResortDto resortDto=(ResortDto)object;
				if(resortDto.getEmail().equals(oldemail)) {
				resortDto.setEmail(newemail);
				return resortDto;
				}
			}
		}
		return null;
	}
	@Override
	public void deleteById(String Id) {
	     for(int i=0;i<obj.length;i++) {
	    	 if(obj[i]!=null) {
	    		 ResortDto resortDto=(ResortDto)obj[i];
	    		 if(resortDto.getId().equals(Id)) {
	    			 obj[i]=null;
	    		 }
	    	 }
	     }
	}
}
     
