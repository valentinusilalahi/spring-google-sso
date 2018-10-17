package com.silalahi.valentinus.sso.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "s_role")
@Data
public class Role {

	@Id
	private String id;
	private String name;
	private String description;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
			name = "s_role_permission", 
			joinColumns = @JoinColumn(name = "id_role"), 
			inverseJoinColumns = @JoinColumn(name = "id_permission"))
	private Set<Permission> permission = new HashSet<>();

}
