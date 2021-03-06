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
 * RolePermissions generated by hbm2java
 */
@Entity
@Table(name = "role_permissions", catalog = "gong")
public class RolePermissions implements java.io.Serializable {

	private Integer id;
	private Permissions permissions;
	private Role role;

	public RolePermissions() {
	}

	public RolePermissions(Permissions permissions, Role role) {
		this.permissions = permissions;
		this.role = role;
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
	@JoinColumn(name = "role_id", nullable = false)
	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

}
