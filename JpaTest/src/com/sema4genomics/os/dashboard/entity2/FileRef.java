package com.sema4genomics.os.dashboard.entity2;
// Generated 23 Aug, 2017 11:44:23 AM by Hibernate Tools 5.0.6.Final

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
 * FileRef generated by hbm2java
 */
@Entity
@Table(name = "file_ref", catalog = "gong")
public class FileRef implements java.io.Serializable {

	private int id;
	private User user;
	private String fileName;
	private String type;
	private String url;
	private Date created;
	private Date lastModified;
	private Set<SampleRun> sampleRunsForTbiIndexFileId = new HashSet<SampleRun>(0);
	private Set<FileRefLog> fileRefLogs = new HashSet<FileRefLog>(0);
	private Set<SampleRun> sampleRunsForVcfFileId = new HashSet<SampleRun>(0);
	private Set<SampleRun> sampleRunsForBamFileId = new HashSet<SampleRun>(0);

	public FileRef() {
	}

	public FileRef(int id, User user) {
		this.id = id;
		this.user = user;
	}

	public FileRef(int id, User user, String fileName, String type, String url, Date created, Date lastModified,
			Set<SampleRun> sampleRunsForTbiIndexFileId, Set<FileRefLog> fileRefLogs,
			Set<SampleRun> sampleRunsForVcfFileId, Set<SampleRun> sampleRunsForBamFileId) {
		this.id = id;
		this.user = user;
		this.fileName = fileName;
		this.type = type;
		this.url = url;
		this.created = created;
		this.lastModified = lastModified;
		this.sampleRunsForTbiIndexFileId = sampleRunsForTbiIndexFileId;
		this.fileRefLogs = fileRefLogs;
		this.sampleRunsForVcfFileId = sampleRunsForVcfFileId;
		this.sampleRunsForBamFileId = sampleRunsForBamFileId;
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

	@Column(name = "file_name", length = 45)
	public String getFileName() {
		return this.fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	@Column(name = "type", length = 45)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "url", length = 45)
	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fileRefByTbiIndexFileId")
	public Set<SampleRun> getSampleRunsForTbiIndexFileId() {
		return this.sampleRunsForTbiIndexFileId;
	}

	public void setSampleRunsForTbiIndexFileId(Set<SampleRun> sampleRunsForTbiIndexFileId) {
		this.sampleRunsForTbiIndexFileId = sampleRunsForTbiIndexFileId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fileRef")
	public Set<FileRefLog> getFileRefLogs() {
		return this.fileRefLogs;
	}

	public void setFileRefLogs(Set<FileRefLog> fileRefLogs) {
		this.fileRefLogs = fileRefLogs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fileRefByVcfFileId")
	public Set<SampleRun> getSampleRunsForVcfFileId() {
		return this.sampleRunsForVcfFileId;
	}

	public void setSampleRunsForVcfFileId(Set<SampleRun> sampleRunsForVcfFileId) {
		this.sampleRunsForVcfFileId = sampleRunsForVcfFileId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "fileRefByBamFileId")
	public Set<SampleRun> getSampleRunsForBamFileId() {
		return this.sampleRunsForBamFileId;
	}

	public void setSampleRunsForBamFileId(Set<SampleRun> sampleRunsForBamFileId) {
		this.sampleRunsForBamFileId = sampleRunsForBamFileId;
	}

}
