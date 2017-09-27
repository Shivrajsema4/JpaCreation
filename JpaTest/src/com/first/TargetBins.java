package com.first;
// Generated 31 Aug, 2017 6:35:12 PM by Hibernate Tools 5.2.5.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * TargetBins generated by hbm2java
 */
@Entity
@Table(name = "target_bins", catalog = "osdashboard")
public class TargetBins implements java.io.Serializable {

	private int id;
	private RunCombination runCombination;
	private String displayName;
	private Integer startDepth;
	private Integer endDepth;

	public TargetBins() {
	}

	public TargetBins(int id, RunCombination runCombination) {
		this.id = id;
		this.runCombination = runCombination;
	}

	public TargetBins(int id, RunCombination runCombination, String displayName, Integer startDepth, Integer endDepth) {
		this.id = id;
		this.runCombination = runCombination;
		this.displayName = displayName;
		this.startDepth = startDepth;
		this.endDepth = endDepth;
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

	@Column(name = "display_name", length = 200)
	public String getDisplayName() {
		return this.displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@Column(name = "start_depth")
	public Integer getStartDepth() {
		return this.startDepth;
	}

	public void setStartDepth(Integer startDepth) {
		this.startDepth = startDepth;
	}

	@Column(name = "end_depth")
	public Integer getEndDepth() {
		return this.endDepth;
	}

	public void setEndDepth(Integer endDepth) {
		this.endDepth = endDepth;
	}

}
