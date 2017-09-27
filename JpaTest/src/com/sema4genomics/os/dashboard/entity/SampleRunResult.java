package com.sema4genomics.os.dashboard.entity;
// Generated 1 Sep, 2017 12:41:39 PM by Hibernate Tools 5.2.5.Final

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SampleRunResult generated by hbm2java
 */
@Entity
@Table(name = "sample_run_result", catalog = "osdashboard")
public class SampleRunResult implements java.io.Serializable {

	private int sampleRunResultId;
	private SampleRun sampleRun;
	private Target target;
	private User user;
	private String details;
	private Integer meanDepth;
	private Date created;
	private Date lastModified;
	private Set<SampleRunResultLog> sampleRunResultLogs = new HashSet<SampleRunResultLog>(0);

	public SampleRunResult() {
	}

	public SampleRunResult(int sampleRunResultId, SampleRun sampleRun, Target target, User user) {
		this.sampleRunResultId = sampleRunResultId;
		this.sampleRun = sampleRun;
		this.target = target;
		this.user = user;
	}

	public SampleRunResult(int sampleRunResultId, SampleRun sampleRun, Target target, User user, String details,
			Integer meanDepth, Date created, Date lastModified, Set<SampleRunResultLog> sampleRunResultLogs) {
		this.sampleRunResultId = sampleRunResultId;
		this.sampleRun = sampleRun;
		this.target = target;
		this.user = user;
		this.details = details;
		this.meanDepth = meanDepth;
		this.created = created;
		this.lastModified = lastModified;
		this.sampleRunResultLogs = sampleRunResultLogs;
	}

	@Id

	@Column(name = "sample_run_result_id", unique = true, nullable = false)
	public int getSampleRunResultId() {
		return this.sampleRunResultId;
	}

	public void setSampleRunResultId(int sampleRunResultId) {
		this.sampleRunResultId = sampleRunResultId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sample_run_id", nullable = false)
	public SampleRun getSampleRun() {
		return this.sampleRun;
	}

	public void setSampleRun(SampleRun sampleRun) {
		this.sampleRun = sampleRun;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "target_id", nullable = false)
	public Target getTarget() {
		return this.target;
	}

	public void setTarget(Target target) {
		this.target = target;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "modified_by", nullable = false)
	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Column(name = "details", length = 200)
	public String getDetails() {
		return this.details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Column(name = "mean_depth")
	public Integer getMeanDepth() {
		return this.meanDepth;
	}

	public void setMeanDepth(Integer meanDepth) {
		this.meanDepth = meanDepth;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "created", length = 19)
	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "last_modified", length = 19)
	public Date getLastModified() {
		return this.lastModified;
	}

	public void setLastModified(Date lastModified) {
		this.lastModified = lastModified;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sampleRunResult")
	public Set<SampleRunResultLog> getSampleRunResultLogs() {
		return this.sampleRunResultLogs;
	}

	public void setSampleRunResultLogs(Set<SampleRunResultLog> sampleRunResultLogs) {
		this.sampleRunResultLogs = sampleRunResultLogs;
	}

}
