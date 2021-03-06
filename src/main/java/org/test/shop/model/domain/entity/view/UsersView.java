/* #LAST_VIEW_OBJECT */
/* #UPDATED */
package org.test.shop.model.domain.entity.view;

// Generated 30.08.2015 21:00:08 by Hibernate Tools 4.3.1

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.voodoodyne.jackson.jsog.JSOGGenerator;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.FetchType;

import java.util.List;
import java.util.LinkedList;
import java.util.Date;

import javax.persistence.Column;

import org.test.shop.model.domain.SView;


/**
 * UsersView generated by hbm2java, updated by voovee
 */
@JsonIdentityInfo(generator = JSOGGenerator.class)
@JsonIgnoreProperties({
			 
			  "firmid"
			, "firm"
			, "serieskey"
			, "createon"
			, "modifyon"
			, "popularity"
			, "tmimageid" 
})
@Entity
@Table(name="users_view")
public class UsersView extends SView  {

	private static final long serialVersionUID = 3172519156215475L;

	@JsonProperty("id") private Integer id;
	@JsonProperty("version") private Integer version;
	@JsonProperty("createdby") private String createdby;
	@JsonProperty("createon") private Date createon;
	@JsonProperty("firm") private Integer firm;
	@JsonProperty("lastmodifiedby") private String lastmodifiedby;
	@JsonProperty("modifyon") private Date modifyon;
	@JsonProperty("serieskey") private String serieskey;
	@JsonProperty("activated") private Boolean activated;
	@JsonProperty("activationkey") private String activationkey;
	@JsonProperty("email") private String email;
	@JsonProperty("enabled") private Boolean enabled;
	@JsonProperty("firstname") private String firstname;
	@JsonProperty("landingpage") private String landingpage;
	@JsonProperty("langkey") private String langkey;
	@JsonProperty("lastname") private String lastname;
	@JsonProperty("password") private String password;
	@JsonProperty("username") private String username;
	@JsonProperty("token") private String token;
	@JsonProperty("phonenumber") private String phonenumber;
	@JsonProperty("usercolor") private String usercolor;
	@JsonProperty("popularity") private Integer popularity;
	@JsonProperty("shopuser") private Boolean shopuser;
	@JsonProperty("physicalperson") private Boolean physicalperson;
	@JsonProperty("legalentity") private Boolean legalentity;
	@JsonProperty("image") private String tmimage;
	@JsonProperty("tmimage") private Integer tmimageid;

	private List<ReqServHotelView> reqServHotelsForRequestUserId = new LinkedList<ReqServHotelView>();
	private List<UserRolesView> userRoleses = new LinkedList<UserRolesView>();
	private List<RelUserDetailsView> relUserDetailses = new LinkedList<RelUserDetailsView>();
	private List<ReqServHotelView> reqServHotelsForResponseUserId = new LinkedList<ReqServHotelView>();
	
	public UsersView() {
	}

	public UsersView(Integer id, Integer version, String createdby,
			Date createon, Integer firm, String lastmodifiedby, Date modifyon,
			String serieskey, Boolean activated, String activationkey,
			String email, Boolean enabled, String firstname,
			String landingpage, String langkey, String lastname,
			String password, String username, String token, String phonenumber,
			String usercolor, Integer popularity, Boolean shopuser,
			Boolean physicalperson, Boolean legalentity, String tmimage,
			Integer tmimageid) {
		this.id = id;
		this.version = version;
		this.createdby = createdby;
		this.createon = createon;
		this.firm = firm;
		this.lastmodifiedby = lastmodifiedby;
		this.modifyon = modifyon;
		this.serieskey = serieskey;
		this.activated = activated;
		this.activationkey = activationkey;
		this.email = email;
		this.enabled = enabled;
		this.firstname=firstname;
		this.landingpage = landingpage;
		this.langkey = langkey;
		this.lastname=lastname;
		this.password = password;
		this.username=username;
		this.token = token;
		this.phonenumber = phonenumber;
		this.usercolor = usercolor;
		this.popularity = popularity;
		this.shopuser = shopuser;
		this.physicalperson = physicalperson;
		this.legalentity = legalentity;
		this.tmimage = tmimage;
		this.tmimageid = tmimageid;
	}

	@Id
	@Column(name="id")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="version")
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name="createdby")
	public String getCreatedby() {
		return this.createdby;
	}

	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}

	@Column(name="createon", length = 29)
	public Date getCreateon() {
		return this.createon;
	}

	public void setCreateon(Date createon) {
		this.createon = createon;
	}

	@Column(name="firm")
	public Integer getFirm() {
		return this.firm;
	}

	public void setFirm(Integer firm) {
		this.firm = firm;
	}

	@Column(name="lastmodifiedby")
	public String getLastmodifiedby() {
		return this.lastmodifiedby;
	}

	public void setLastmodifiedby(String lastmodifiedby) {
		this.lastmodifiedby = lastmodifiedby;
	}

	@Column(name="modifyon", length = 29)
	public Date getModifyon() {
		return this.modifyon;
	}

	public void setModifyon(Date modifyon) {
		this.modifyon = modifyon;
	}

	@Column(name="serieskey")
	public String getSerieskey() {
		return this.serieskey;
	}

	public void setSerieskey(String serieskey) {
		this.serieskey = serieskey;
	}

	@Column(name="activated")
	public Boolean getActivated() {
		return this.activated;
	}

	public void setActivated(Boolean activated) {
		this.activated = activated;
	}

	@Column(name="activationkey")
	public String getActivationkey() {
		return this.activationkey;
	}

	public void setActivationkey(String activationkey) {
		this.activationkey = activationkey;
	}

	@Column(name="email")
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name="enabled")
	public Boolean getEnabled() {
		return this.enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	@Column(name="firstname")
	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname=firstname;
	}

	@Column(name="landingpage")
	public String getLandingpage() {
		return this.landingpage;
	}

	public void setLandingpage(String landingpage) {
		this.landingpage = landingpage;
	}

	@Column(name="langkey")
	public String getLangkey() {
		return this.langkey;
	}

	public void setLangkey(String langkey) {
		this.langkey = langkey;
	}

	@Column(name="lastname")
	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname=lastname;
	}

	@Column(name="password")
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name="username")
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username=username;
	}

	@Column(name="token")
	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	@Column(name="phonenumber")
	public String getPhonenumber() {
		return this.phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	@Column(name="usercolor")
	public String getUsercolor() {
		return this.usercolor;
	}

	public void setUsercolor(String usercolor) {
		this.usercolor = usercolor;
	}

	@Column(name="popularity")
	public Integer getPopularity() {
		return this.popularity;
	}

	public void setPopularity(Integer popularity) {
		this.popularity = popularity;
	}

	@Column(name="shopuser")
	public Boolean getShopuser() {
		return this.shopuser;
	}

	public void setShopuser(Boolean shopuser) {
		this.shopuser = shopuser;
	}

	@Column(name="physicalperson")
	public Boolean getPhysicalperson() {
		return this.physicalperson;
	}

	public void setPhysicalperson(Boolean physicalperson) {
		this.physicalperson = physicalperson;
	}

	@Column(name="legalentity")
	public Boolean getLegalentity() {
		return this.legalentity;
	}

	public void setLegalentity(Boolean legalentity) {
		this.legalentity = legalentity;
	}

	@Column(name="tmimage")
	public String getTmimage() {
		return this.tmimage;
	}

	public void setTmimage(String tmimage) {
		this.tmimage = tmimage;
	}

	@Column(name="tmimageid")
	public Integer getTmimageid() {
		return this.tmimageid;
	}

	public void setTmimageid(Integer tmimageid) {
		this.tmimageid = tmimageid;
	}

	 	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="usersbyrequestuserid")
	public List<ReqServHotelView> getReqServHotelsForRequestUserId() {
		return this.reqServHotelsForRequestUserId;
	}

	public void setReqServHotelsForRequestUserId(List<ReqServHotelView> reqServHotelsForRequestUserId) {
		this.reqServHotelsForRequestUserId = reqServHotelsForRequestUserId;
	}

	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="usersid")
	public List<UserRolesView> getUserRoleses() {
		return this.userRoleses;
	}

	public void setUserRoleses(List<UserRolesView> userRoleses) {
		this.userRoleses = userRoleses;
	}

	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="usersid")
	public List<RelUserDetailsView> getRelUserDetailses() {
		return this.relUserDetailses;
	}

	public void setRelUserDetailses(List<RelUserDetailsView> relUserDetailses) {
		this.relUserDetailses = relUserDetailses;
	}

	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="usersbyresponseuserid")
	public List<ReqServHotelView> getReqServHotelsForResponseUserId() {
		return this.reqServHotelsForResponseUserId;
	}

	public void setReqServHotelsForResponseUserId(List<ReqServHotelView> reqServHotelsForResponseUserId) {
		this.reqServHotelsForResponseUserId = reqServHotelsForResponseUserId;
	}

	
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UsersView))
			return false;
		UsersView castOther = (UsersView) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getVersion() == castOther.getVersion()) || (this
						.getVersion() != null && castOther.getVersion() != null && this
						.getVersion().equals(castOther.getVersion())))
				&& ((this.getCreatedby() == castOther.getCreatedby()) || (this
						.getCreatedby() != null
						&& castOther.getCreatedby() != null && this
						.getCreatedby().equals(castOther.getCreatedby())))
				&& ((this.getCreateon() == castOther.getCreateon()) || (this
						.getCreateon() != null
						&& castOther.getCreateon() != null && this
						.getCreateon().equals(castOther.getCreateon())))
				&& ((this.getFirm() == castOther.getFirm()) || (this.getFirm() != null
						&& castOther.getFirm() != null && this.getFirm()
						.equals(castOther.getFirm())))
				&& ((this.getLastmodifiedby() == castOther.getLastmodifiedby()) || (this
						.getLastmodifiedby() != null
						&& castOther.getLastmodifiedby() != null && this
						.getLastmodifiedby().equals(
								castOther.getLastmodifiedby())))
				&& ((this.getModifyon() == castOther.getModifyon()) || (this
						.getModifyon() != null
						&& castOther.getModifyon() != null && this
						.getModifyon().equals(castOther.getModifyon())))
				&& ((this.getSerieskey() == castOther.getSerieskey()) || (this
						.getSerieskey() != null
						&& castOther.getSerieskey() != null && this
						.getSerieskey().equals(castOther.getSerieskey())))
				&& ((this.getActivated() == castOther.getActivated()) || (this
						.getActivated() != null
						&& castOther.getActivated() != null && this
						.getActivated().equals(castOther.getActivated())))
				&& ((this.getActivationkey() == castOther.getActivationkey()) || (this
						.getActivationkey() != null
						&& castOther.getActivationkey() != null && this
						.getActivationkey()
						.equals(castOther.getActivationkey())))
				&& ((this.getEmail() == castOther.getEmail()) || (this
						.getEmail() != null && castOther.getEmail() != null && this
						.getEmail().equals(castOther.getEmail())))
				&& ((this.getEnabled() == castOther.getEnabled()) || (this
						.getEnabled() != null && castOther.getEnabled() != null && this
						.getEnabled().equals(castOther.getEnabled())))
				&& ((this.getFirstname() == castOther.getFirstname()) || (this
						.getFirstname() != null
						&& castOther.getFirstname() != null && this
						.getFirstname().equals(castOther.getFirstname())))
				&& ((this.getLandingpage() == castOther.getLandingpage()) || (this
						.getLandingpage() != null
						&& castOther.getLandingpage() != null && this
						.getLandingpage().equals(castOther.getLandingpage())))
				&& ((this.getLangkey() == castOther.getLangkey()) || (this
						.getLangkey() != null && castOther.getLangkey() != null && this
						.getLangkey().equals(castOther.getLangkey())))
				&& ((this.getLastname() == castOther.getLastname()) || (this
						.getLastname() != null
						&& castOther.getLastname() != null && this
						.getLastname().equals(castOther.getLastname())))
				&& ((this.getPassword() == castOther.getPassword()) || (this
						.getPassword() != null
						&& castOther.getPassword() != null && this
						.getPassword().equals(castOther.getPassword())))
				&& ((this.getUsername() == castOther.getUsername()) || (this
						.getUsername() != null
						&& castOther.getUsername() != null && this
						.getUsername().equals(castOther.getUsername())))
				&& ((this.getToken() == castOther.getToken()) || (this
						.getToken() != null && castOther.getToken() != null && this
						.getToken().equals(castOther.getToken())))
				&& ((this.getPhonenumber() == castOther.getPhonenumber()) || (this
						.getPhonenumber() != null
						&& castOther.getPhonenumber() != null && this
						.getPhonenumber().equals(castOther.getPhonenumber())))
				&& ((this.getUsercolor() == castOther.getUsercolor()) || (this
						.getUsercolor() != null
						&& castOther.getUsercolor() != null && this
						.getUsercolor().equals(castOther.getUsercolor())))
				&& ((this.getPopularity() == castOther.getPopularity()) || (this
						.getPopularity() != null
						&& castOther.getPopularity() != null && this
						.getPopularity().equals(castOther.getPopularity())))
				&& ((this.getShopuser() == castOther.getShopuser()) || (this
						.getShopuser() != null
						&& castOther.getShopuser() != null && this
						.getShopuser().equals(castOther.getShopuser())))
				&& ((this.getPhysicalperson() == castOther.getPhysicalperson()) || (this
						.getPhysicalperson() != null
						&& castOther.getPhysicalperson() != null && this
						.getPhysicalperson().equals(
								castOther.getPhysicalperson())))
				&& ((this.getLegalentity() == castOther.getLegalentity()) || (this
						.getLegalentity() != null
						&& castOther.getLegalentity() != null && this
						.getLegalentity().equals(castOther.getLegalentity())))
				&& ((this.getTmimage() == castOther.getTmimage()) || (this
						.getTmimage() != null && castOther.getTmimage() != null && this
						.getTmimage().equals(castOther.getTmimage())))
				&& ((this.getTmimageid() == castOther.getTmimageid()) || (this
						.getTmimageid() != null
						&& castOther.getTmimageid() != null && this
						.getTmimageid().equals(castOther.getTmimageid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getVersion() == null ? 0 : this.getVersion().hashCode());
		result = 37 * result
				+ (getCreatedby() == null ? 0 : this.getCreatedby().hashCode());
		result = 37 * result
				+ (getCreateon() == null ? 0 : this.getCreateon().hashCode());
		result = 37 * result
				+ (getFirm() == null ? 0 : this.getFirm().hashCode());
		result = 37
				* result
				+ (getLastmodifiedby() == null ? 0 : this.getLastmodifiedby()
						.hashCode());
		result = 37 * result
				+ (getModifyon() == null ? 0 : this.getModifyon().hashCode());
		result = 37 * result
				+ (getSerieskey() == null ? 0 : this.getSerieskey().hashCode());
		result = 37 * result
				+ (getActivated() == null ? 0 : this.getActivated().hashCode());
		result = 37
				* result
				+ (getActivationkey() == null ? 0 : this.getActivationkey()
						.hashCode());
		result = 37 * result
				+ (getEmail() == null ? 0 : this.getEmail().hashCode());
		result = 37 * result
				+ (getEnabled() == null ? 0 : this.getEnabled().hashCode());
		result = 37 * result
				+ (getFirstname() == null ? 0 : this.getFirstname().hashCode());
		result = 37
				* result
				+ (getLandingpage() == null ? 0 : this.getLandingpage()
						.hashCode());
		result = 37 * result
				+ (getLangkey() == null ? 0 : this.getLangkey().hashCode());
		result = 37 * result
				+ (getLastname() == null ? 0 : this.getLastname().hashCode());
		result = 37 * result
				+ (getPassword() == null ? 0 : this.getPassword().hashCode());
		result = 37 * result
				+ (getUsername() == null ? 0 : this.getUsername().hashCode());
		result = 37 * result
				+ (getToken() == null ? 0 : this.getToken().hashCode());
		result = 37
				* result
				+ (getPhonenumber() == null ? 0 : this.getPhonenumber()
						.hashCode());
		result = 37 * result
				+ (getUsercolor() == null ? 0 : this.getUsercolor().hashCode());
		result = 37
				* result
				+ (getPopularity() == null ? 0 : this.getPopularity()
						.hashCode());
		result = 37 * result
				+ (getShopuser() == null ? 0 : this.getShopuser().hashCode());
		result = 37
				* result
				+ (getPhysicalperson() == null ? 0 : this.getPhysicalperson()
						.hashCode());
		result = 37
				* result
				+ (getLegalentity() == null ? 0 : this.getLegalentity()
						.hashCode());
		result = 37 * result
				+ (getTmimage() == null ? 0 : this.getTmimage().hashCode());
		result = 37 * result
				+ (getTmimageid() == null ? 0 : this.getTmimageid().hashCode());
		return result;
	}
// #SETTER_AND_GETTER

	@Transient
	public String getLabel() {
		return lastname + " " + firstname; 
	}

	public void setLabel(String label) {
		
	}
	
	@JsonProperty("apitoken") private String apitoken;
	
	@Transient
	public String getApitoken() {
		return apitoken; 
	}

	public void setApitoken(String apitoken) {
		this.apitoken = apitoken;
	}
	
	@JsonProperty("hashkey") private String hashkey;
	
	@Transient
	public String getHashkey() {
		return hashkey; 
	}

	public void setHashkey(String hashkey) {
		this.hashkey = hashkey;
	}
	
	
// ------------------ Logic part ------------------
	
	public UsersView specialInit() {
	
		
		return this;
	}
	public UsersView init() {
		initList();
		initDicts();
		
		return this;
	}
	
	public UsersView customInitList(List<String> list) {
		if (list.contains("reqServHotelsForRequestUserId")) {
			initLists(reqServHotelsForRequestUserId);
		}
		if (list.contains("userRoleses")) {
			initLists(userRoleses);
		}
		if (list.contains("relUserDetailses")) {
			initLists(relUserDetailses);
		}
		if (list.contains("reqServHotelsForResponseUserId")) {
			initLists(reqServHotelsForResponseUserId);
		}
		return this;
	}
	
	public UsersView initList() {
		initLists(reqServHotelsForRequestUserId);
		initLists(userRoleses);
		initLists(relUserDetailses);
		initLists(reqServHotelsForResponseUserId);

		return this;
	}
	
	public UsersView initDicts() {
		return this;
	}
	
	
}