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
 * FileRefLog generated by hbm2java
 */
@Entity
@Table(name = "file_ref_log", catalog = "osdashboard")
public class FileRefLog implements java.io.Serializable {

	private int id;
	private FileRef fileRef;
	private User user;
	private String columnName;
	private String previousValue;
	private String currentValue;
	private Date lastModified;

	public FileRefLog() {
	}

	public FileRefLog(int id, FileRef fileRef, User user) {
		this.id = id;
		this.fileRef = fileRef;
		this.user = user;
	}

	public FileRefLog(int id, FileRef fileRef, User user, String columnName, String previousValue, String currentValue,
			Date lastModified) {
		this.id = id;
		this.fileRef = fileRef;
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
	@JoinColumn(name = "file_ref_id", nullable = false)
	public FileRef getFileRef() {
		return this.fileRef;
	}

	public void setFileRef(FileRef fileRef) {
		this.fileRef = fileRef;
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
