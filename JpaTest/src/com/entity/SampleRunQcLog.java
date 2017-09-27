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
 * SampleRunQcLog generated by hbm2java
 */
@Entity
@Table(name = "sample_run_qc_log", catalog = "osdashboard")
public class SampleRunQcLog implements java.io.Serializable {

	private int id;
	private User user;
	private SampleRunQc sampleRunQc;
	private String columnName;
	private String previousValue;
	private String currentValue;
	private Date lastModified;

	public SampleRunQcLog() {
	}

	public SampleRunQcLog(int id, User user, SampleRunQc sampleRunQc) {
		this.id = id;
		this.user = user;
		this.sampleRunQc = sampleRunQc;
	}

	public SampleRunQcLog(int id, User user, SampleRunQc sampleRunQc, String columnName, String previousValue,
			String currentValue, Date lastModified) {
		this.id = id;
		this.user = user;
		this.sampleRunQc = sampleRunQc;
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
	@JoinColumn(name = "sample_run_qc_sample_run_qc_id", nullable = false)
	public SampleRunQc getSampleRunQc() {
		return this.sampleRunQc;
	}

	public void setSampleRunQc(SampleRunQc sampleRunQc) {
		this.sampleRunQc = sampleRunQc;
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
