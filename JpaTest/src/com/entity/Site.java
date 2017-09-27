package com.entity;
// Generated 4 Aug, 2017 4:03:24 PM by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Site generated by hbm2java
 */
@Entity
@Table(name = "site", catalog = "osdashboard")
public class Site implements java.io.Serializable {

	private int id;
	private String name;
	private Set<Order> orders = new HashSet<Order>(0);

	public Site() {
	}

	public Site(int id) {
		this.id = id;
	}

	public Site(int id, String name, Set<Order> orders) {
		this.id = id;
		this.name = name;
		this.orders = orders;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name", length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "site")
	public Set<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

}