package com.xworkz.runner;

import com.xworkz.abstracts.HotelAbstract;
import com.xworkz.dto.HotelDto;
import com.xworkz.implementation.Hotelimpl;

public class HotelRunner {
	public static void main(String[] args) {
		HotelDto h = new HotelDto();
		HotelAbstract ha=new Hotelimpl();
		h.setHostelName("A");
		h.setAddresss("rt");
		h.setPrice(67);
		h.setTables(67);
		ha.onSave(h);
		ha.read();
		
		HotelDto d = new HotelDto();
		d.setAddresss("tr");
		d.setHostelName("B");
		d.setPrice(76);
		d.setTables(87);
		ha.onSave(d);
		ha.read();
		ha.searchByaddresss("tr");
		ha.searchByhotelName("B");
	
	}

}
