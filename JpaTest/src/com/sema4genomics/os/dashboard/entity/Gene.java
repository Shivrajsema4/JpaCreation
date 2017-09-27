package com.sema4genomics.os.dashboard.entity;
// Generated 1 Sep, 2017 12:41:39 PM by Hibernate Tools 5.2.5.Final

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
 * Gene generated by hbm2java
 */
@Entity
@Table(name = "gene", catalog = "osdashboard")
public class Gene implements java.io.Serializable {

	private int id;
	private RunCombination runCombination;
	private String name;
	private Set<Target> targets = new HashSet<Target>(0);

	public Gene() {
	}

	public Gene(int id, RunCombination runCombination) {
		this.id = id;
		this.runCombination = runCombination;
	}

	public Gene(int id, RunCombination runCombination, String name, Set<Target> targets) {
		this.id = id;
		this.runCombination = runCombination;
		this.name = name;
		this.targets = targets;
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
	@JoinColumn(name = "run_combination_id", nullable = false)
	public RunCombination getRunCombination() {
		return this.runCombination;
	}

	public void setRunCombination(RunCombination runCombination) {
		this.runCombination = runCombination;
	}

	@Column(name = "name", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "gene")
	public Set<Target> getTargets() {
		return this.targets;
	}

	public void setTargets(Set<Target> targets) {
		this.targets = targets;
	}

}
