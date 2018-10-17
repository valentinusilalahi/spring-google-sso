package com.silalahi.valentinus.sso.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "s_user")
@Data
public class User {

	@Id
	private String id;
	private String username;
	@ManyToOne
	@JoinColumn(name = "id_role")
	private Role role;

}
