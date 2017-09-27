package com.first;
// Generated 31 Aug, 2017 6:35:12 PM by Hibernate Tools 5.2.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Patient generated by hbm2java
 */
@Entity
@Table(name = "patient", catalog = "osdashboard")
public class Patient implements java.io.Serializable {

	private int id;
	private String gender;
	private Integer age;
	private Set<Order> orders = new HashSet<Order>(0);
	private Set<Order> orders_1 = new HashSet<Order>(0);
	private Set<BenchPatient> benchPatients = new HashSet<BenchPatient>(0);
	private Set<BenchPatient> benchPatients_1 = new HashSet<BenchPatient>(0);

	public Patient() {
	}

	public Patient(int id) {
		this.id = id;
	}

	public Patient(int id, String gender, Integer age, Set<Order> orders, Set<Order> orders_1,
			Set<BenchPatient> benchPatients, Set<BenchPatient> benchPatients_1) {
		this.id = id;
		this.gender = gender;
		this.age = age;
		this.orders = orders;
		this.orders_1 = orders_1;
		this.benchPatients = benchPatients;
		this.benchPatients_1 = benchPatients_1;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "gender", length = 10)
	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Column(name = "age")
	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patient")
	public Set<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patient")
	public Set<Order> getOrders_1() {
		return this.orders_1;
	}

	public void setOrders_1(Set<Order> orders_1) {
		this.orders_1 = orders_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patient")
	public Set<BenchPatient> getBenchPatients() {
		return this.benchPatients;
	}

	public void setBenchPatients(Set<BenchPatient> benchPatients) {
		this.benchPatients = benchPatients;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "patient")
	public Set<BenchPatient> getBenchPatients_1() {
		return this.benchPatients_1;
	}

	public void setBenchPatients_1(Set<BenchPatient> benchPatients_1) {
		this.benchPatients_1 = benchPatients_1;
	}

}
