package com.latest;
// Generated 31 Aug, 2017 7:26:20 PM by Hibernate Tools 5.2.5.Final

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
 * SampleRunResultLog generated by hbm2java
 */
@Entity
@Table(name = "sample_run_result_log", catalog = "osdashboard")
public class SampleRunResultLog implements java.io.Serializable {

	private int id;
	private SampleRunResult sampleRunResult;
	private User user;
	private String columnName;
	private String previousValue;
	private String currentValue;
	private Date lastModified;

	public SampleRunResultLog() {
	}

	public SampleRunResultLog(int id, SampleRunResult sampleRunResult, User user) {
		this.id = id;
		this.sampleRunResult = sampleRunResult;
		this.user = user;
	}

	public SampleRunResultLog(int id, SampleRunResult sampleRunResult, User user, String columnName,
			String previousValue, String currentValue, Date lastModified) {
		this.id = id;
		this.sampleRunResult = sampleRunResult;
		this.user = user;
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
	@JoinColumn(name = "sample_run_result_sample_run_result_id", nullable = false)
	public SampleRunResult getSampleRunResult() {
		return this.sampleRunResult;
	}

	public void setSampleRunResult(SampleRunResult sampleRunResult) {
		this.sampleRunResult = sampleRunResult;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "modified_by", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
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
	@Column(name = "last_modified", length = 19)
	public Date getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

}
