package com.xworkz.abstracts;

import com.xworkz.dto.ResortDto;

public abstract class ResortAbstact {
	
	public abstract boolean onSave(ResortDto resortDto);
    public abstract void read();
    public abstract void searchResortId(String id);
    public abstract void searchResortName(String name);
    public abstract ResortDto searchEmailID(String email);
    public abstract ResortDto updateByEmailId(String oldemail,String newemail);
    public abstract void deleteById(String Id);
}
