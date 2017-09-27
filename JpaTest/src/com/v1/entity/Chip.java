package com.v1.entity;
// Generated 22 Aug, 2017 5:45:39 PM by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Chip generated by hbm2java
 */
@Entity
@Table(name = "chip", catalog = "gong")
public class Chip implements java.io.Serializable {

	private Integer id;
	private String name;
	private Set<Instrument> instruments = new HashSet<Instrument>(0);

	public Chip() {
	}

	public Chip(String name, Set<Instrument> instruments) {
		this.name = name;
		this.instruments = instruments;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "name", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "chip")
	public Set<Instrument> getInstruments() {
		return this.instruments;
	}

	public void setInstruments(Set<Instrument> instruments) {
		this.instruments = instruments;
	}

}
