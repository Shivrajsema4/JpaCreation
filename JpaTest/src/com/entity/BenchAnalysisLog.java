package com.entity;
// Generated 4 Aug, 2017 4:03:24 PM by Hibernate Tools 3.5.0.Final

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * BenchAnalysisLog generated by hbm2java
 */
@Entity
@Table(name = "bench_analysis_log", catalog = "osdashboard")
public class BenchAnalysisLog implements java.io.Serializable {

	private int id;
	private User user;
	private BenchAnalysis benchAnalysis;
	private String columnName;
	private String previousValue;
	private String currentValue;
	private Date lastModified;

	public BenchAnalysisLog() {
	}

	public BenchAnalysisLog(int id, User user, BenchAnalysis benchAnalysis) {
		this.id = id;
		this.user = user;
		this.benchAnalysis = benchAnalysis;
	}

	public BenchAnalysisLog(int id, User user, BenchAnalysis benchAnalysis, String columnName, String previousValue,
			String currentValue, Date lastModified) {
		this.id = id;
		this.user = user;
		this.benchAnalysis = benchAnalysis;
		this.columnName = columnName;
		this.previousValue = previousValue;
		this.currentValue = currentValue;
		this.lastModified = lastModified;
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
	@JoinColumn(name = "modified_by", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bench_analysis_id", nullable = false)
	public BenchAnalysis getBenchAnalysis() {
		return this.benchAnalysis;
	}

	public void setBenchAnalysis(BenchAnalysis benchAnalysis) {
		this.benchAnalysis = benchAnalysis;
	}

	@Column(name = "column_name", length = 100)
	public String getColumnName() {
		return this.columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	@Column(name = "previous_value", length = 500)
	public String getPreviousValue() {
		return this.previousValue;
	}

	public void setPreviousValue(String previousValue) {
		this.previousValue = previousValue;
	}

	@Column(name = "current_value", length = 500)
	public String getCurrentValue() {
		return this.currentValue;
	}

	public void setCurrentValue(String currentValue) {
		this.currentValue = currentValue;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_modified", length = 0)
	public Date getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

}
