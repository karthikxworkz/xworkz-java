package com.xworkz.abstracts;

import com.xworkz.dto.HotelDto;

public abstract class HotelAbstract{
	public abstract boolean onSave(HotelDto hotelDto);
    public abstract void read();
    public abstract void searchByaddresss(String addresss);
    public abstract void searchByhotelName(String hotelname);
}
