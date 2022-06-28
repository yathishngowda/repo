package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class User {
	
	@Id
	@GeneratedValue
	private int  id;
	private String name;
	public User(int id, String name, String city, String about) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.about = about;
	}
	
	public User() {
		super();
	}

	private String city;
	private String about;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	@Override
    public String toString() {
        return "user [id=" + id + ", name=" + name + ", city=" + city + ", about=" + about + "]";



}
}
	
