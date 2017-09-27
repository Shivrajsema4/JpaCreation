package com.v1.entity;
// Generated 22 Aug, 2017 5:45:39 PM by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "gong")
public class User implements java.io.Serializable {

	private int id;
	private String username;
	private String firstName;
	private String lastName;
	private String email;
	private Set<RunResultLog> runResultLogs = new HashSet<RunResultLog>(0);
	private Set<UserRoleMapping> userRoleMappings = new HashSet<UserRoleMapping>(0);
	private Set<SampleRun> sampleRuns = new HashSet<SampleRun>(0);
	private Set<SampleRunLog> sampleRunLogs = new HashSet<SampleRunLog>(0);
	private Set<UserLoginLog> userLoginLogs = new HashSet<UserLoginLog>(0);
	private Set<BenchAnalysis> benchAnalysises = new HashSet<BenchAnalysis>(0);
	private Set<Run> runs = new HashSet<Run>(0);
	private Set<BenchAnalysisLog> benchAnalysisLogs = new HashSet<BenchAnalysisLog>(0);
	private Set<RunLog> runLogs = new HashSet<RunLog>(0);
	private Set<FileRefLog> fileRefLogs = new HashSet<FileRefLog>(0);
	private Set<SampleRunQcLog> sampleRunQcLogs = new HashSet<SampleRunQcLog>(0);
	private Set<RunResult> runResults = new HashSet<RunResult>(0);
	private Set<SampleRunQc> sampleRunQcs = new HashSet<SampleRunQc>(0);
	private Set<FileRef> fileRefs = new HashSet<FileRef>(0);

	public User() {
	}

	public User(int id) {
		this.id = id;
	}

	public User(int id, String username, String firstName, String lastName, String email,
			Set<RunResultLog> runResultLogs, Set<UserRoleMapping> userRoleMappings, Set<SampleRun> sampleRuns,
			Set<SampleRunLog> sampleRunLogs, Set<UserLoginLog> userLoginLogs, Set<BenchAnalysis> benchAnalysises,
			Set<Run> runs, Set<BenchAnalysisLog> benchAnalysisLogs, Set<RunLog> runLogs, Set<FileRefLog> fileRefLogs,
			Set<SampleRunQcLog> sampleRunQcLogs, Set<RunResult> runResults, Set<SampleRunQc> sampleRunQcs,
			Set<FileRef> fileRefs) {
		this.id = id;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.runResultLogs = runResultLogs;
		this.userRoleMappings = userRoleMappings;
		this.sampleRuns = sampleRuns;
		this.sampleRunLogs = sampleRunLogs;
		this.userLoginLogs = userLoginLogs;
		this.benchAnalysises = benchAnalysises;
		this.runs = runs;
		this.benchAnalysisLogs = benchAnalysisLogs;
		this.runLogs = runLogs;
		this.fileRefLogs = fileRefLogs;
		this.sampleRunQcLogs = sampleRunQcLogs;
		this.runResults = runResults;
		this.sampleRunQcs = sampleRunQcs;
		this.fileRefs = fileRefs;
	}

	@Id

	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "username", length = 45)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "first_name", length = 45)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Column(name = "last_name", length = 45)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Column(name = "email", length = 200)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<RunResultLog> getRunResultLogs() {
		return this.runResultLogs;
	}

	public void setRunResultLogs(Set<RunResultLog> runResultLogs) {
		this.runResultLogs = runResultLogs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<UserRoleMapping> getUserRoleMappings() {
		return this.userRoleMappings;
	}

	public void setUserRoleMappings(Set<UserRoleMapping> userRoleMappings) {
		this.userRoleMappings = userRoleMappings;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<SampleRun> getSampleRuns() {
		return this.sampleRuns;
	}

	public void setSampleRuns(Set<SampleRun> sampleRuns) {
		this.sampleRuns = sampleRuns;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<SampleRunLog> getSampleRunLogs() {
		return this.sampleRunLogs;
	}

	public void setSampleRunLogs(Set<SampleRunLog> sampleRunLogs) {
		this.sampleRunLogs = sampleRunLogs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<UserLoginLog> getUserLoginLogs() {
		return this.userLoginLogs;
	}

	public void setUserLoginLogs(Set<UserLoginLog> userLoginLogs) {
		this.userLoginLogs = userLoginLogs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<BenchAnalysis> getBenchAnalysises() {
		return this.benchAnalysises;
	}

	public void setBenchAnalysises(Set<BenchAnalysis> benchAnalysises) {
		this.benchAnalysises = benchAnalysises;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<Run> getRuns() {
		return this.runs;
	}

	public void setRuns(Set<Run> runs) {
		this.runs = runs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<BenchAnalysisLog> getBenchAnalysisLogs() {
		return this.benchAnalysisLogs;
	}

	public void setBenchAnalysisLogs(Set<BenchAnalysisLog> benchAnalysisLogs) {
		this.benchAnalysisLogs = benchAnalysisLogs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<RunLog> getRunLogs() {
		return this.runLogs;
	}

	public void setRunLogs(Set<RunLog> runLogs) {
		this.runLogs = runLogs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<FileRefLog> getFileRefLogs() {
		return this.fileRefLogs;
	}

	public void setFileRefLogs(Set<FileRefLog> fileRefLogs) {
		this.fileRefLogs = fileRefLogs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<SampleRunQcLog> getSampleRunQcLogs() {
		return this.sampleRunQcLogs;
	}

	public void setSampleRunQcLogs(Set<SampleRunQcLog> sampleRunQcLogs) {
		this.sampleRunQcLogs = sampleRunQcLogs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<RunResult> getRunResults() {
		return this.runResults;
	}

	public void setRunResults(Set<RunResult> runResults) {
		this.runResults = runResults;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<SampleRunQc> getSampleRunQcs() {
		return this.sampleRunQcs;
	}

	public void setSampleRunQcs(Set<SampleRunQc> sampleRunQcs) {
		this.sampleRunQcs = sampleRunQcs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
	public Set<FileRef> getFileRefs() {
		return this.fileRefs;
	}

	public void setFileRefs(Set<FileRef> fileRefs) {
		this.fileRefs = fileRefs;
	}

}
