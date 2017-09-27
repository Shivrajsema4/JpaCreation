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
 * Site generated by hbm2java
 */
@Entity
@Table(name = "site", catalog = "osdashboard")
public class Site implements java.io.Serializable {

	private int id;
	private String name;
	private Set<Instrument> instruments = new HashSet<Instrument>(0);
	private Set<Instrument> instruments_1 = new HashSet<Instrument>(0);
	private Set<Order> orders = new HashSet<Order>(0);
	private Set<Order> orders_1 = new HashSet<Order>(0);

	public Site() {
	}

	public Site(int id) {
		this.id = id;
	}

	public Site(int id, String name, Set<Instrument> instruments, Set<Instrument> instruments_1, Set<Order> orders,
			Set<Order> orders_1) {
		this.id = id;
		this.name = name;
		this.instruments = instruments;
		this.instruments_1 = instruments_1;
		this.orders = orders;
		this.orders_1 = orders_1;
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
	public Set<Instrument> getInstruments() {
		return this.instruments;
	}

	public void setInstruments(Set<Instrument> instruments) {
		this.instruments = instruments;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "site")
	public Set<Instrument> getInstruments_1() {
		return this.instruments_1;
	}

	public void setInstruments_1(Set<Instrument> instruments_1) {
		this.instruments_1 = instruments_1;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "site")
	public Set<Order> getOrders() {
		return this.orders;
	}

	public void setOrders(Set<Order> orders) {
		this.orders = orders;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "site")
	public Set<Order> getOrders_1() {
		return this.orders_1;
	}

	public void setOrders_1(Set<Order> orders_1) {
		this.orders_1 = orders_1;
	}

}
