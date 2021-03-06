package com.sema4genomics.os.dashboard.entity2;
// Generated 23 Aug, 2017 11:44:23 AM by Hibernate Tools 5.0.6.Final

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
@Table(name = "sample_run_qc_log", catalog = "gong")
public class SampleRunQcLog implements java.io.Serializable {

	private int id;
	private SampleRunQc sampleRunQc;
	private User user;
	private String columnName;
	private String previousValue;
	private String currentValue;
	private Date lastModified;

	public SampleRunQcLog() {
	}

	public SampleRunQcLog(int id, SampleRunQc sampleRunQc, User user) {
		this.id = id;
		this.sampleRunQc = sampleRunQc;
		this.user = user;
	}

	public SampleRunQcLog(int id, SampleRunQc sampleRunQc, User user, String columnName, String previousValue,
			String currentValue, Date lastModified) {
		this.id = id;
		this.sampleRunQc = sampleRunQc;
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
	@JoinColumn(name = "sample_run_qc_sample_run_qc_id", nullable = false)
	public SampleRunQc getSampleRunQc() {
		return this.sampleRunQc;
	}

	public void setSampleRunQc(SampleRunQc sampleRunQc) {
		this.sampleRunQc = sampleRunQc;
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
