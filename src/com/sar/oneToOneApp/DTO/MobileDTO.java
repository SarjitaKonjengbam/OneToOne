package com.sar.oneToOneApp.DTO;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Mobile_Table")
public class MobileDTO implements Serializable
{
	@Id
	@GenericGenerator(name="mobile", strategy="increment")
	@GeneratedValue(generator="mobile")
	@Column(name="m_id")
	private int id;
	@Column(name="m_brand")
	String brand;
	@Column(name="m_price")
	double price;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="person_id")
	private PersonDTO personDTO;
	
	public MobileDTO() {
		System.out.println(this.getClass().getSimpleName()+"created");	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public PersonDTO getPersonDTO() {
		return personDTO;
	}

	public void setPersonDTO(PersonDTO personDTO) {
		this.personDTO = personDTO;
	}

	@Override
	public String toString() {
		return "MobileDTO [id=" + id + ", brand=" + brand + ", price=" + price + "]";
	}

	 
	
	
	
}
