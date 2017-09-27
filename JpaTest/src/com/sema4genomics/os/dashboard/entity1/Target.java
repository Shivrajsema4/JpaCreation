package com.sema4genomics.os.dashboard.entity1;
// Generated 4 Aug, 2017 4:19:25 PM by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Target generated by hbm2java
 */
@Entity
@Table(name = "target", catalog = "osdashboard")
public class Target implements java.io.Serializable {

	private int id;
	private String name;
	private String type;
	private Set<SampleRunQc> sampleRunQcs = new HashSet<SampleRunQc>(0);

	public Target() {
	}

	public Target(int id) {
		this.id = id;
	}

	public Target(int id, String name, String type, Set<SampleRunQc> sampleRunQcs) {
		this.id = id;
		this.name = name;
		this.type = type;
		this.sampleRunQcs = sampleRunQcs;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "name", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "type", length = 45)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "target")
	public Set<SampleRunQc> getSampleRunQcs() {
		return this.sampleRunQcs;
	}

	public void setSampleRunQcs(Set<SampleRunQc> sampleRunQcs) {
		this.sampleRunQcs = sampleRunQcs;
	}

}