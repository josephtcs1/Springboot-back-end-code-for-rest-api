package com.example.JavaBAckEndone.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name="joseph")
public class JosephDetails {
	@javax.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
	@Column(name="First_name")
	private String FirstName;
	@Column(name="Last_Name")
	private String LastName;
	@Column(name="age")
	private int age;
	@Column(name="salary")
	private long salary;
	@Column(name="Email_Id")
	private String EmailId;
	
	public JosephDetails() {
		
	}
	public JosephDetails( String FirstName,String LastName,int age,long salary,String EmailId) {
		this.FirstName=FirstName;
		this.LastName =LastName;
		this.age = age;
		this.salary=salary;
		this.EmailId=EmailId;
			
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		this.Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	

}
