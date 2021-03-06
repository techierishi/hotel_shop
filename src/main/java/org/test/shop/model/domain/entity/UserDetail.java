/* #UPDATED */
/* #CLEARED */
package org.test.shop.model.domain.entity;

// Generated 30.08.2015 21:00:08 by Hibernate Tools 4.3.1

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.PreRemove;
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
import javax.persistence.CascadeType;
import org.test.shop.model.domain.SEntity;

import java.util.LinkedList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



/**
 * UserDetail generated by hbm2java, updated by voovee
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
@Table(name="user_detail")
public class UserDetail extends SEntity  {

	private static final long serialVersionUID = 2423134348284983L;

	@JsonProperty("id") private Integer id;
	@JsonProperty("companyname") private String companyName;
	@JsonProperty("companysite") private String companySite;
	private List<RelUserDetails> relUserDetailses = new LinkedList<RelUserDetails>();

	public UserDetail() {
	}

	public UserDetail(int id) {
		this.id = id;
	}

	public UserDetail(int id, String companyName, String companySite,


 List<RelUserDetails> relUserDetailses) {
		this.id = id;
		this.companyName = companyName;
		this.companySite = companySite;
		this.relUserDetailses = relUserDetailses;
	}

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_USERDETAIL")
	@SequenceGenerator(name = "SQ_USERDETAIL", sequenceName = "SQ_USERDETAIL", initialValue = 10, allocationSize = 1)
	@Id
	@Column(name="id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	@Column(name="company_name")
	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Column(name="company_site")
	public String getCompanySite() {
		return this.companySite;
	}

	public void setCompanySite(String companySite) {
		this.companySite = companySite;
	}

	

	

	

	

	

	

	@OneToMany(fetch=FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy="userDetail")
	public List<RelUserDetails> getRelUserDetailses() {
		return this.relUserDetailses;
	}

	public void setRelUserDetailses(List<RelUserDetails> relUserDetailses) {
		this.relUserDetailses = relUserDetailses;
	}
// #SETTER_AND_GETTER
	
// ------------------ Logic part ------------------
	
	@PreRemove
	public void preRemove() {

	}
	
	public UserDetail specialInit() {
	
		
		return this;
	}
	
	public UserDetail init() {
		initList();
		initDicts();
		
		return this;
	}
	
	public UserDetail preInitList() {
		if(getRelUserDetailses() == null) setRelUserDetailses(new LinkedList());
		getRelUserDetailses().parallelStream().forEach(it -> it.setUserDetail(this));

		return this;
	}
	
	public UserDetail initList() {
		initLists(relUserDetailses);

		return this;
	}
	
	public UserDetail initDicts() {

		return this;
	}
	
	
}