package com.v1.entity;
// Generated 22 Aug, 2017 5:45:39 PM by Hibernate Tools 3.5.0.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PermissionsActivities generated by hbm2java
 */
@Entity
@Table(name = "permissions_activities", catalog = "gong")
public class PermissionsActivities implements java.io.Serializable {

	private Integer id;
	private Permissions permissions;
	private Activities activities;
	private Boolean permissionValue;

	public PermissionsActivities() {
	}

	public PermissionsActivities(Permissions permissions, Activities activities) {
		this.permissions = permissions;
		this.activities = activities;
	}

	public PermissionsActivities(Permissions permissions, Activities activities, Boolean permissionValue) {
		this.permissions = permissions;
		this.activities = activities;
		this.permissionValue = permissionValue;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "permission_id", nullable = false)
	public Permissions getPermissions() {
		return this.permissions;
	}

	public void setPermissions(Permissions permissions) {
		this.permissions = permissions;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "activity_id", nullable = false)
	public Activities getActivities() {
		return this.activities;
	}

	public void setActivities(Activities activities) {
		this.activities = activities;
	}

	@Column(name = "permission_value")
	public Boolean getPermissionValue() {
		return this.permissionValue;
	}

	public void setPermissionValue(Boolean permissionValue) {
		this.permissionValue = permissionValue;
	}

}
