/* #UPDATED */
/* #CLEARED */
package org.test.shop.model.domain.entity;

// Generated 30.08.2015 21:00:08 by Hibernate Tools 4.3.1

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.PreRemove;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.SequenceGenerator;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.OptimisticLockType;
import org.hibernate.annotations.OptimisticLocking;
import org.hibernate.annotations.SelectBeforeUpdate;
import org.test.shop.model.domain.SRel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * UserRoles generated by hbm2java, updated by voovee
 */
@DynamicInsert(true)
@DynamicUpdate(true)
@SelectBeforeUpdate(false)
@OptimisticLocking(type = OptimisticLockType.VERSION)
@JsonIdentityInfo(generator = JSOGGenerator.class)
@JsonIgnoreProperties({
			 
			  "firmid"
			, "firm"
			, "serieskey"
			, "createon"
			, "modifyon"
			, "popularity" 
})
@Entity
@Table(name="user_roles")
public class UserRoles extends SRel  {

	private static final long serialVersionUID = 9955551243859991L;

	@JsonProperty("id") private Integer id;
	@JsonProperty("users") private Users users;
	@JsonProperty("role") private String role;

	public UserRoles() {
	}

	public UserRoles(int id) {
		this.id = id;
	}

	public UserRoles(int id, Users users, String role) {
		this.id = id;
		this.users = users;
		this.role = role;
	}

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_USERROLES")
	@SequenceGenerator(name = "SQ_USERROLES", sequenceName = "SQ_USERROLES", initialValue = 10, allocationSize = 1)
	@Id
	@Column(name="id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_id")
	public Users getUsers() {
		return this.users;
	}

	public void setUsers(Users users) {
		this.users = users;
	}

	@Column(name="role")
	public String getRole() {
		return this.role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	
// ------------------ Logic part ------------------
	
	@PreRemove
	public void preRemove() {
		users = null;

	}
	
	public UserRoles specialInit() {
	
		
		return this;
	}
	
	public UserRoles init() {
		initList();
		initDicts();
		
		return this;
	}
	
	public UserRoles preInitList() {

		return this;
	}
	
	public UserRoles initList() {

		return this;
	}
	
	public UserRoles initDicts() {
		initSentity(getUsers());

		return this;
	}
	
	
}