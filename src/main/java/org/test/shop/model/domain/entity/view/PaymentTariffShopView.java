/* #LAST_VIEW_OBJECT */
/* #UPDATED */
package org.test.shop.model.domain.entity.view;

// Generated 30.08.2015 21:00:08 by Hibernate Tools 4.3.1

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
 * PaymentTariffShopView generated by hbm2java, updated by voovee
 */
@JsonIdentityInfo(generator = JSOGGenerator.class)
@JsonIgnoreProperties({
			 
			  "firmid"
			, "firm"
			, "serieskey" 
})
@Entity
@Table(name="payment_tariff_shop_view")
public class PaymentTariffShopView extends SView  {

	private static final long serialVersionUID = 6539185895358172L;

	private Integer id;
	private Integer version;
	private Integer percentageofallowances;
	private Boolean ispercentageofallowances;
	private String createdby;
	private Date createon;
	private Integer firm;
	private String lastmodifiedby;
	private Date modifyon;
	private Integer popularity;
	private String serieskey;

	private List<PaymentPriceShopView> paymentPriceShops = new LinkedList<PaymentPriceShopView>();
	private List<ServHotelRoomView> servHotelRooms = new LinkedList<ServHotelRoomView>();
	
	public PaymentTariffShopView() {
	}

	public PaymentTariffShopView(Integer id, Integer version,
			Integer percentageofallowances, Boolean ispercentageofallowances,
			String createdby, Date createon, Integer firm,
			String lastmodifiedby, Date modifyon, Integer popularity,
			String serieskey) {
		this.id = id;
		this.version = version;
		this.percentageofallowances = percentageofallowances;
		this.ispercentageofallowances = ispercentageofallowances;
		this.createdby = createdby;
		this.createon = createon;
		this.firm = firm;
		this.lastmodifiedby = lastmodifiedby;
		this.modifyon = modifyon;
		this.popularity = popularity;
		this.serieskey = serieskey;
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

	@Column(name="percentageofallowances")
	public Integer getPercentageofallowances() {
		return this.percentageofallowances;
	}

	public void setPercentageofallowances(Integer percentageofallowances) {
		this.percentageofallowances = percentageofallowances;
	}

	@Column(name="ispercentageofallowances")
	public Boolean getIspercentageofallowances() {
		return this.ispercentageofallowances;
	}

	public void setIspercentageofallowances(Boolean ispercentageofallowances) {
		this.ispercentageofallowances = ispercentageofallowances;
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

	@Column(name="popularity")
	public Integer getPopularity() {
		return this.popularity;
	}

	public void setPopularity(Integer popularity) {
		this.popularity = popularity;
	}

	@Column(name="serieskey")
	public String getSerieskey() {
		return this.serieskey;
	}

	public void setSerieskey(String serieskey) {
		this.serieskey = serieskey;
	}

	 	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="paymenttariffshopid")
	public List<PaymentPriceShopView> getPaymentPriceShops() {
		return this.paymentPriceShops;
	}

	public void setPaymentPriceShops(List<PaymentPriceShopView> paymentPriceShops) {
		this.paymentPriceShops = paymentPriceShops;
	}

	@OneToMany(fetch=FetchType.LAZY)
	@JoinColumn(name="paymenttariffshopid")
	public List<ServHotelRoomView> getServHotelRooms() {
		return this.servHotelRooms;
	}

	public void setServHotelRooms(List<ServHotelRoomView> servHotelRooms) {
		this.servHotelRooms = servHotelRooms;
	}

	
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof PaymentTariffShopView))
			return false;
		PaymentTariffShopView castOther = (PaymentTariffShopView) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getVersion() == castOther.getVersion()) || (this
						.getVersion() != null && castOther.getVersion() != null && this
						.getVersion().equals(castOther.getVersion())))
				&& ((this.getPercentageofallowances() == castOther
						.getPercentageofallowances()) || (this
						.getPercentageofallowances() != null
						&& castOther.getPercentageofallowances() != null && this
						.getPercentageofallowances().equals(
								castOther.getPercentageofallowances())))
				&& ((this.getIspercentageofallowances() == castOther
						.getIspercentageofallowances()) || (this
						.getIspercentageofallowances() != null
						&& castOther.getIspercentageofallowances() != null && this
						.getIspercentageofallowances().equals(
								castOther.getIspercentageofallowances())))
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
				&& ((this.getPopularity() == castOther.getPopularity()) || (this
						.getPopularity() != null
						&& castOther.getPopularity() != null && this
						.getPopularity().equals(castOther.getPopularity())))
				&& ((this.getSerieskey() == castOther.getSerieskey()) || (this
						.getSerieskey() != null
						&& castOther.getSerieskey() != null && this
						.getSerieskey().equals(castOther.getSerieskey())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getVersion() == null ? 0 : this.getVersion().hashCode());
		result = 37
				* result
				+ (getPercentageofallowances() == null ? 0 : this
						.getPercentageofallowances().hashCode());
		result = 37
				* result
				+ (getIspercentageofallowances() == null ? 0 : this
						.getIspercentageofallowances().hashCode());
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
		result = 37
				* result
				+ (getPopularity() == null ? 0 : this.getPopularity()
						.hashCode());
		result = 37 * result
				+ (getSerieskey() == null ? 0 : this.getSerieskey().hashCode());
		return result;
	}

	
// ------------------ Logic part ------------------
	
	public PaymentTariffShopView specialInit() {
	
		
		return this;
	}
	public PaymentTariffShopView init() {
		initList();
		initDicts();
		
		return this;
	}
	
	public PaymentTariffShopView customInitList(List<String> list) {
		if (list.contains("paymentPriceShops")) {
			initLists(paymentPriceShops);
		}
		if (list.contains("servHotelRooms")) {
			initLists(servHotelRooms);
		}
		return this;
	}
	
	public PaymentTariffShopView initList() {
		initLists(paymentPriceShops);
		initLists(servHotelRooms);

		return this;
	}
	
	public PaymentTariffShopView initDicts() {
		return this;
	}
	
	
}