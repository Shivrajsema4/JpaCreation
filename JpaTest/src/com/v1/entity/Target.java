package com.v1.entity;
// Generated 22 Aug, 2017 5:45:39 PM by Hibernate Tools 3.5.0.Final

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

/**
 * Target generated by hbm2java
 */
@Entity
@Table(name = "target", catalog = "gong")
public class Target implements java.io.Serializable {

	private int id;
	private Panel panel;
	private String name;
	private String gene;
	private Set<SampleRunQc> sampleRunQcs = new HashSet<SampleRunQc>(0);

	public Target() {
	}

	public Target(int id, Panel panel) {
		this.id = id;
		this.panel = panel;
	}

	public Target(int id, Panel panel, String name, String gene, Set<SampleRunQc> sampleRunQcs) {
		this.id = id;
		this.panel = panel;
		this.name = name;
		this.gene = gene;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "panel_id", nullable = false)
	public Panel getPanel() {
		return this.panel;
	}

	public void setPanel(Panel panel) {
		this.panel = panel;
	}

	@Column(name = "name", length = 200)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "gene", length = 100)
	public String getGene() {
		return this.gene;
	}

	public void setGene(String gene) {
		this.gene = gene;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "target")
	public Set<SampleRunQc> getSampleRunQcs() {
		return this.sampleRunQcs;
	}

	public void setSampleRunQcs(Set<SampleRunQc> sampleRunQcs) {
		this.sampleRunQcs = sampleRunQcs;
	}

}
