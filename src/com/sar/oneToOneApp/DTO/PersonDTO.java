package com.sar.oneToOneApp.DTO;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Person_Table")
public class PersonDTO implements Serializable
{
	@Id
	@GenericGenerator(name="person", strategy="increment")
	@GeneratedValue(generator="person")
	@Column(name="p_id")
	private int id;
	@Column(name="p_name")
	private String name;
	@Column(name="p_age")
	private int age;
	@Column(name="p_location")
	private String location;
	@Column(name="p_phone")
	private long phone;
	
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private MobileDTO mobileDTO; 
	
	
	public PersonDTO() {
		System.out.println(this.getClass().getSimpleName()+"created");	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}
	
	public MobileDTO getMobileDTO() {
		return mobileDTO;
	}

	public void setMobileDTO(MobileDTO mobileDTO) {
		this.mobileDTO = mobileDTO;
	}

	@Override
	public String toString() {
		return "PersonDTO [id=" + id + ", name=" + name + ", age=" + age + ", location=" + location + ", phone=" + phone
				+ "]";
	}

	 
	
	
}
