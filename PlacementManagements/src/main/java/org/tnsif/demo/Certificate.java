package org.tnsif.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;

@Entity
@Table(name="certificate")

public class Certificate {
	
	@Id
	private Integer id;
	private Integer year;
	private String college;
	
	//default constructor
		
		public Certificate() {
		super();
		// TODO Auto-generated constructor stub
		}
		
		//parameterized constructor
		public Certificate(Integer id,Integer year, String college) {
			super();
			this.id = id;
			this.year = year;
			this.college = college;
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public Integer getYear() {
			return year;
		}

		public void setYear(Integer year) {
			this.year = year;
		}

		public String getCollege() {
			return college;
		}

		public void setCollege(String college) {
			this.college = college;
		}
		@Override
		public String toString() {
			return "Certificate [id=" + id + ", year=" + year + ", college=" + college+ "]";
		}
		
		
		
		

	
}
