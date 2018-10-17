package com.silalahi.valentinus.sso.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "s_permission")
@Data
public class Permission {

	@Id
	private String id;
	@Column(name = "permission_label")
	private String label;
	@Column(name = "permission_value")
	private String value;

}
