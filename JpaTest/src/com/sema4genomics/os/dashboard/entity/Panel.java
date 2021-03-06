package com.sema4genomics.os.dashboard.entity;
// Generated 1 Sep, 2017 12:41:39 PM by Hibernate Tools 5.2.5.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Panel generated by hbm2java
 */
@Entity
@Table(name = "panel", catalog = "osdashboard")
public class Panel implements java.io.Serializable {

	private int id;
	private String displayName;
	private String uniqueName;
	private Set<RunCombination> runCombinations = new HashSet<RunCombination>(0);

	public Panel() {
	}

	public Panel(int id) {
		this.id = id;
	}

	public Panel(int id, String displayName, String uniqueName, Set<RunCombination> runCombinations) {
		this.id = id;
		this.displayName = displayName;
		this.uniqueName = uniqueName;
		this.runCombinations = runCombinations;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "display_name", length = 45)
	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@Column(name = "unique_name", length = 200)
	public String getUniqueName() {
		return this.uniqueName;
	}

	public void setUniqueName(String uniqueName) {
		this.uniqueName = uniqueName;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "panel")
	public Set<RunCombination> getRunCombinations() {
		return this.runCombinations;
	}

	public void setRunCombinations(Set<RunCombination> runCombinations) {
		this.runCombinations = runCombinations;
	}

}
