package org.tnsif.demo;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table(name="placement")
public class Placement {
	
	@Id
	private Integer id;
	private String name;
	private String college;
	private Integer date;
	private String qualification;
	private Integer year;
	
	
	//default constructor
	public Placement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//parameterized constructor
	public Placement(Integer id, String name, String college,Integer date, String qualification, Integer year) {
		super();
		this.id = id;
		this.name = name;
		this.college = college;
		this.date= date;
		this.qualification = qualification;
		this.year = year;

	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}

	public Integer getDate() {
		return date;
	}

	public void setDate(Integer date) {
		this.date = date;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Placement [id=" + id + ", name=" + name + ", college=" + college + ", date=" + date
				+ ", qualification=" + qualification + "]";
	}
	
	
	
	

}
