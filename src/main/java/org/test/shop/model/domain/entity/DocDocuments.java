/* #UPDATED */
/* #CLEARED */
package org.test.shop.model.domain.entity;

// Generated 30.08.2015 21:00:08 by Hibernate Tools 4.3.1

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.persistence.Transient;
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
 * DocDocuments generated by hbm2java, updated by voovee
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
})
@Entity
@Table(name="doc_documents")
public class DocDocuments extends SEntity  {

	private static final long serialVersionUID = 3334217555489675L;

	@JsonProperty("id") private Integer id;
	@JsonProperty("contenttype") private String contenttype;
	@JsonProperty("extension") private String extension;
	@JsonProperty("originalfilename") private String originalfilename;
	@JsonProperty("path") private String path;
	@JsonProperty("simpletype") private String simpletype;
	@JsonProperty("size") private String size;
	@JsonProperty("synopsis") private String synopsis;
	private List<TmFirmSettings> tmFirmSettingses = new LinkedList<TmFirmSettings>();
	private List<RelServHotelDocDocuments> relServHotelDocDocumentses = new LinkedList<RelServHotelDocDocuments>();
	private List<ReqServHotel> reqServHotelsForDocumentForUserId = new LinkedList<ReqServHotel>();
	private List<ReqServHotel> reqServHotelsForDocumentForHotelId = new LinkedList<ReqServHotel>();
	private List<InfoPermission> infoPermissions = new LinkedList<InfoPermission>();

	public DocDocuments() {
	}

	public DocDocuments(int id) {
		this.id = id;
	}

	public DocDocuments(int id,

 String contenttype, String extension,
			String originalfilename, String path, String simpletype,
			String size,
			List<TmFirmSettings> tmFirmSettingses,
			List<RelServHotelDocDocuments> relServHotelDocDocumentses,
			List<ReqServHotel> reqServHotelsForDocumentForUserId,
			List<ReqServHotel> reqServHotelsForDocumentForHotelId,
			List<InfoPermission> infoPermissions) {
		this.id = id;
		this.contenttype = contenttype;
		this.extension = extension;
		this.originalfilename=originalfilename;
		this.path = path;
		this.simpletype = simpletype;
		this.size = size;
		this.synopsis = synopsis;
		this.tmFirmSettingses = tmFirmSettingses;
		this.relServHotelDocDocumentses = relServHotelDocDocumentses;
		this.reqServHotelsForDocumentForUserId = reqServHotelsForDocumentForUserId;
		this.reqServHotelsForDocumentForHotelId = reqServHotelsForDocumentForHotelId;
		this.infoPermissions = infoPermissions;
	}

	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SQ_DOCDOCUMENTS")
	@SequenceGenerator(name = "SQ_DOCDOCUMENTS", sequenceName = "SQ_DOCDOCUMENTS", initialValue = 10, allocationSize = 1)
	@Id
	@Column(name="id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}
	

	

	

	

	

	@Column(name="contenttype")
	public String getContenttype() {
		return this.contenttype;
	}

	public void setContenttype(String contenttype) {
		this.contenttype = contenttype;
	}

	@Column(name="extension")
	public String getExtension() {
		return this.extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	@Column(name="originalfilename")
	public String getOriginalfilename() {
		return this.originalfilename;
	}

	public void setOriginalfilename(String originalfilename) {
		this.originalfilename=originalfilename;
	}

	@Column(name="path")
	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	@Column(name="simpletype")
	public String getSimpletype() {
		return this.simpletype;
	}

	public void setSimpletype(String simpletype) {
		this.simpletype = simpletype;
	}

	@Column(name="size")
	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	@Column(name="synopsis", length = 500)
	public String getSynopsis() {
		return this.synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	

	@OneToMany(fetch=FetchType.LAZY, mappedBy="docDocuments")
	public List<TmFirmSettings> getTmFirmSettingses() {
		return this.tmFirmSettingses;
	}

	public void setTmFirmSettingses(List<TmFirmSettings> tmFirmSettingses) {
		this.tmFirmSettingses = tmFirmSettingses;
	}

	@OneToMany(fetch=FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE }, mappedBy="docDocuments")
	public List<RelServHotelDocDocuments> getRelServHotelDocDocumentses() {
		return this.relServHotelDocDocumentses;
	}

	public void setRelServHotelDocDocumentses(List<RelServHotelDocDocuments> relServHotelDocDocumentses) {
		this.relServHotelDocDocumentses = relServHotelDocDocumentses;
	}

	@OneToMany(fetch=FetchType.LAZY, mappedBy="docDocumentsByDocumentForUserId")
	public List<ReqServHotel> getReqServHotelsForDocumentForUserId() {
		return this.reqServHotelsForDocumentForUserId;
	}

	public void setReqServHotelsForDocumentForUserId(List<ReqServHotel> reqServHotelsForDocumentForUserId) {
		this.reqServHotelsForDocumentForUserId = reqServHotelsForDocumentForUserId;
	}

	@OneToMany(fetch=FetchType.LAZY, mappedBy="docDocumentsByDocumentForHotelId")
	public List<ReqServHotel> getReqServHotelsForDocumentForHotelId() {
		return this.reqServHotelsForDocumentForHotelId;
	}

	public void setReqServHotelsForDocumentForHotelId(List<ReqServHotel> reqServHotelsForDocumentForHotelId) {
		this.reqServHotelsForDocumentForHotelId = reqServHotelsForDocumentForHotelId;
	}

	@OneToMany(fetch=FetchType.LAZY, mappedBy="docDocuments")
	public List<InfoPermission> getInfoPermissions() {
		return this.infoPermissions;
	}

	public void setInfoPermissions(List<InfoPermission> infoPermissions) {
		this.infoPermissions = infoPermissions;
	}
// #SETTER_AND_GETTER

	@Transient
	public String getLabel() {
		return originalfilename;
	}

	public void setLabel(String label) {
//		setOriginalfilename(label);
	}
	
	
// ------------------ Logic part ------------------
	
	@PreRemove
	public void preRemove() {
		for (TmFirmSettings arg0 : getTmFirmSettingses()) {
			arg0.setDocDocuments(null);
		}

		for (ReqServHotel arg0 : getReqServHotelsForDocumentForUserId()) {
			arg0.setDocDocumentsByDocumentForUserId(null);
		}

		for (ReqServHotel arg0 : getReqServHotelsForDocumentForHotelId()) {
			arg0.setDocDocumentsByDocumentForHotelId(null);
		}

		for (InfoPermission arg0 : getInfoPermissions()) {
			arg0.setDocDocuments(null);
		}




	}
	
	public DocDocuments specialInit() {
	
		
		return this;
	}
	
	public DocDocuments init() {
		initList();
		initDicts();
		
		return this;
	}
	
	public DocDocuments preInitList() {
		if(getTmFirmSettingses() == null) setTmFirmSettingses(new LinkedList());
		getTmFirmSettingses().parallelStream().forEach(it -> it.setDocDocuments(this));
		if(getRelServHotelDocDocumentses() == null) setRelServHotelDocDocumentses(new LinkedList());
		getRelServHotelDocDocumentses().parallelStream().forEach(it -> it.setDocDocuments(this));
		if(getReqServHotelsForDocumentForUserId() == null) setReqServHotelsForDocumentForUserId(new LinkedList());
		getReqServHotelsForDocumentForUserId().parallelStream().forEach(it -> it.setDocDocumentsByDocumentForUserId(this));
		if(getReqServHotelsForDocumentForHotelId() == null) setReqServHotelsForDocumentForHotelId(new LinkedList());
		getReqServHotelsForDocumentForHotelId().parallelStream().forEach(it -> it.setDocDocumentsByDocumentForHotelId(this));
		if(getInfoPermissions() == null) setInfoPermissions(new LinkedList());
		getInfoPermissions().parallelStream().forEach(it -> it.setDocDocuments(this));

		return this;
	}
	
	public DocDocuments initList() {

		return this;
	}
	
	public DocDocuments initDicts() {

		return this;
	}
	
	
}