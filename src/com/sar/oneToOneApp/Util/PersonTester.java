package com.sar.oneToOneApp.Util;

import com.sar.oneToOneApp.DAO.PersonDAO;
import com.sar.oneToOneApp.DTO.MobileDTO;
import com.sar.oneToOneApp.DTO.PersonDTO;

public class PersonTester {

	public static void main(String[] args) {
		
		PersonDTO personDTO=new PersonDTO();
		personDTO.setName("Shoba");
		personDTO.setLocation("Bangalore");
		personDTO.setAge(27);
		personDTO.setPhone(23456);
		
		MobileDTO mobileDTO=new MobileDTO();
		mobileDTO.setBrand("Samsung");
		mobileDTO.setPrice(7000.00);
		
		
		personDTO.setMobileDTO(mobileDTO);
		mobileDTO.setPersonDTO(personDTO);
		
		PersonDAO personDAO=new PersonDAO();
		personDAO.saveDB(personDTO);
	}

}
