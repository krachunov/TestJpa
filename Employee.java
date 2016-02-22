package com.levins.my.contact;

import javax.persistence.*;

@Entity
@Table(name = "levins_centrala")
public class Employee {

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "employees")
	private String employees;

	@Column(name = "post")
	private String post;

	@Column(name = "director")
	private String director;

	@Column(name = "department")
	private String department;

	@Column(name = "sector")
	private String sector;

	@Column(name = "floor")
	private String floor;

	@Column(name = "internal")
	private String internal;

	@Column(name = "phone")
	private String phone;

	@Column(name = "GSM")
	private String GSM;

	@Column(name = "Fax")
	private String Fax;

	@Column(name = "email")
	private String email;

	@Column(name = "user")
	private String user;

	@Column(name = "city")
	private String city;

	@Column(name = "internel")
	private String internel;

	@Column(name = "userName")
	private String userName;

	public Employee() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmployees() {
		return employees;
	}

	public void setEmployees(String employees) {
		this.employees = employees;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public String getFloor() {
		return floor;
	}

	public void setFloor(String floor) {
		this.floor = floor;
	}

	public String getInternal() {
		return internal;
	}

	public void setInternal(String internal) {
		this.internal = internal;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getGSM() {
		return GSM;
	}

	public void setGSM(String gSM) {
		GSM = gSM;
	}

	public String getFax() {
		return Fax;
	}

	public void setFax(String fax) {
		Fax = fax;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getInternel() {
		return internel;
	}

	public void setInternel(String internel) {
		this.internel = internel;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}
