package EmployeeDetails.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="employeeDitails")
public class EmployeDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer  EmpId;
	private String FirstName;
	private String LastName;
	private Integer Age;
	private Long Salary;
	private String EmailId;
	
	public EmployeDetails() {
		
	}
	
	public EmployeDetails(Integer empId, String firstName, String lastName, Integer age, Long salary, String emailId) {
		super();
		EmpId = empId;
		FirstName = firstName;
		LastName = lastName;
		Age = age;
		Salary = salary;
		EmailId = emailId;
	}
	public Integer getEmpId() {
		return EmpId;
	}
	public void setEmpId(Integer empId) {
		EmpId = empId;
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
	public Integer getAge() {
		return Age;
	}
	public void setAge(Integer age) {
		Age = age;
	}
	public Long getSalary() {
		return Salary;
	}
	public void setSalary(Long salary) {
		Salary = salary;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	
	
	

}
