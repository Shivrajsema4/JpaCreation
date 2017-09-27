package com.v1.entity;
// Generated 22 Aug, 2017 5:45:39 PM by Hibernate Tools 3.5.0.Final

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Order generated by hbm2java
 */
@Entity
@Table(name = "order", catalog = "gong")
public class Order implements java.io.Serializable {

	private int id;
	private Site site;
	private Patient patient;
	private Date created;
	private Set<OrderTest> orderTests = new HashSet<OrderTest>(0);
	private Set<Sample> samples = new HashSet<Sample>(0);

	public Order() {
	}

	public Order(int id, Site site, Patient patient) {
		this.id = id;
		this.site = site;
		this.patient = patient;
	}

	public Order(int id, Site site, Patient patient, Date created, Set<OrderTest> orderTests, Set<Sample> samples) {
		this.id = id;
		this.site = site;
		this.patient = patient;
		this.created = created;
		this.orderTests = orderTests;
		this.samples = samples;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "site_id", nullable = false)
	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "patient_id", nullable = false)
	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created", length = 19)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
	public Set<OrderTest> getOrderTests() {
		return this.orderTests;
	}

	public void setOrderTests(Set<OrderTest> orderTests) {
		this.orderTests = orderTests;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
	public Set<Sample> getSamples() {
		return this.samples;
	}

	public void setSamples(Set<Sample> samples) {
		this.samples = samples;
	}

}