package com.latest;
// Generated 31 Aug, 2017 7:26:20 PM by Hibernate Tools 5.2.5.Final

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
 * InstrumentType generated by hbm2java
 */
@Entity
@Table(name = "instrument_type", catalog = "osdashboard")
public class InstrumentType implements java.io.Serializable {

	private Integer id;
	private String manufacturer;
	private String modelName;
	private Set<Instrument> instruments = new HashSet<Instrument>(0);

	public InstrumentType() {
	}

	public InstrumentType(String manufacturer, String modelName, Set<Instrument> instruments) {
		this.manufacturer = manufacturer;
		this.modelName = modelName;
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

	@Column(name = "manufacturer", length = 200)
	public String getManufacturer() {
		return this.manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	@Column(name = "model_name", length = 200)
	public String getModelName() {
		return this.modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "instrumentType")
	public Set<Instrument> getInstruments() {
		return this.instruments;
	}

	public void setInstruments(Set<Instrument> instruments) {
		this.instruments = instruments;
	}

}
