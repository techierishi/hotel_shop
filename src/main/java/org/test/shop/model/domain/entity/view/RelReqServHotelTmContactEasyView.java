/* #LAST_VIEW_OBJECT */
/* #UPDATED */
package org.test.shop.model.domain.entity.view;

// Generated 19.07.2015 11:22:34 by Hibernate Tools 4.3.1

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Table;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

import org.test.shop.model.domain.SView;


/**
 * RelReqServHotelTmContactEasyView generated by hbm2java, updated by voovee
 */
@JsonIgnoreProperties({
			 
			  "firmid"
			, "firm"
			, "serieskey"
			, "reqservhotelid"
			, "tmcontacteasyid" 
})
@Entity
@Table(name="rel_req_serv_hotel_tm_contact_easy_view")
public class RelReqServHotelTmContactEasyView extends SView  {

	private static final long serialVersionUID = 9225751577388155L;

	private Integer id;
	private String reqservhotel;
	private Integer reqservhotelid;
	private String tmcontacteasy;
	private Integer tmcontacteasyid;

	public RelReqServHotelTmContactEasyView() {
	}

	public RelReqServHotelTmContactEasyView(Integer id, String reqservhotel,
			Integer reqservhotelid, String tmcontacteasy,
			Integer tmcontacteasyid) {
		this.id = id;
		this.reqservhotel = reqservhotel;
		this.reqservhotelid = reqservhotelid;
		this.tmcontacteasy = tmcontacteasy;
		this.tmcontacteasyid = tmcontacteasyid;
	}

	@Id
	@Column(name="id")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name="reqservhotel")
	public String getReqservhotel() {
		return this.reqservhotel;
	}

	public void setReqservhotel(String reqservhotel) {
		this.reqservhotel = reqservhotel;
	}

	@Column(name="reqservhotelid")
	public Integer getReqservhotelid() {
		return this.reqservhotelid;
	}

	public void setReqservhotelid(Integer reqservhotelid) {
		this.reqservhotelid = reqservhotelid;
	}

	@Column(name="tmcontacteasy")
	public String getTmcontacteasy() {
		return this.tmcontacteasy;
	}

	public void setTmcontacteasy(String tmcontacteasy) {
		this.tmcontacteasy = tmcontacteasy;
	}

	@Column(name="tmcontacteasyid")
	public Integer getTmcontacteasyid() {
		return this.tmcontacteasyid;
	}

	public void setTmcontacteasyid(Integer tmcontacteasyid) {
		this.tmcontacteasyid = tmcontacteasyid;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof RelReqServHotelTmContactEasyView))
			return false;
		RelReqServHotelTmContactEasyView castOther = (RelReqServHotelTmContactEasyView) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getReqservhotel() == castOther.getReqservhotel()) || (this
						.getReqservhotel() != null
						&& castOther.getReqservhotel() != null && this
						.getReqservhotel().equals(castOther.getReqservhotel())))
				&& ((this.getReqservhotelid() == castOther.getReqservhotelid()) || (this
						.getReqservhotelid() != null
						&& castOther.getReqservhotelid() != null && this
						.getReqservhotelid().equals(
								castOther.getReqservhotelid())))
				&& ((this.getTmcontacteasy() == castOther.getTmcontacteasy()) || (this
						.getTmcontacteasy() != null
						&& castOther.getTmcontacteasy() != null && this
						.getTmcontacteasy()
						.equals(castOther.getTmcontacteasy())))
				&& ((this.getTmcontacteasyid() == castOther
						.getTmcontacteasyid()) || (this.getTmcontacteasyid() != null
						&& castOther.getTmcontacteasyid() != null && this
						.getTmcontacteasyid().equals(
								castOther.getTmcontacteasyid())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37
				* result
				+ (getReqservhotel() == null ? 0 : this.getReqservhotel()
						.hashCode());
		result = 37
				* result
				+ (getReqservhotelid() == null ? 0 : this.getReqservhotelid()
						.hashCode());
		result = 37
				* result
				+ (getTmcontacteasy() == null ? 0 : this.getTmcontacteasy()
						.hashCode());
		result = 37
				* result
				+ (getTmcontacteasyid() == null ? 0 : this.getTmcontacteasyid()
						.hashCode());
		return result;
	}

	
// ------------------ Logic part ------------------
	
	public RelReqServHotelTmContactEasyView init() {
		initList();
		initDicts();
		
		return this;
	}
	
	public RelReqServHotelTmContactEasyView customInitList(List<String> list) {
		
		return this;
	}
	
	public RelReqServHotelTmContactEasyView initList() {

		return this;
	}
	
	public RelReqServHotelTmContactEasyView initDicts() {
		return this;
	}
	
	
}