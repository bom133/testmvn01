package th.go.rd.rdepaymentservice.entity;
// Generated Jul 17, 2018 10:14:52 AM by Hibernate Tools 4.3.5.Final

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * MasterStatus generated by hbm2java
 */
@Entity
@Table(name = "MASTER_STATUS")
public class MasterStatus implements java.io.Serializable {

	private String status;
	private String statusNameTh;
	private String statusNameEn;
	private List<MasterPaymentLine> masterPaymentLines = new ArrayList<>();
	private List<EpayTaxPaymentOutbound> epayTaxPaymentOutbounds = new ArrayList<>();
	private List<EpayReceiverPaymentLine> epayReceiverPaymentLines = new ArrayList<>();
	private List<EpayTaxPaymentInfo> epayTaxPaymentInfos = new ArrayList<>();
	private List<MasterReceiverUnit> masterReceiverUnits = new ArrayList<>();
	private List<EpayAuthorization> epayAuthorizations = new ArrayList<>();

	public MasterStatus() {
	}

	public MasterStatus(String status) {
		this.status = status;
	}

	public MasterStatus(String status, String statusNameTh, String statusNameEn,
			List<MasterPaymentLine> masterPaymentLines, List<EpayReceiverPaymentLine> epayReceiverPaymentLines,List<EpayTaxPaymentOutbound> epayTaxPaymentOutbounds,
			List<EpayRolePermission> epayRolePermissions, List<EpayTaxPaymentInfo> epayTaxPaymentInfos,
			List<MasterReceiverUnit> masterReceiverUnits, List<EpayAuthorization> epayAuthorizations) {
		this.status = status;
		this.statusNameTh = statusNameTh;
		this.statusNameEn = statusNameEn;
		this.masterPaymentLines = masterPaymentLines;
		this.epayTaxPaymentOutbounds = epayTaxPaymentOutbounds;
		this.epayReceiverPaymentLines = epayReceiverPaymentLines;
		this.epayTaxPaymentInfos = epayTaxPaymentInfos;
		this.masterReceiverUnits = masterReceiverUnits;
		this.epayAuthorizations = epayAuthorizations;
	}

	@Id

	@Column(name = "STATUS", unique = true, nullable = false, length = 1)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Column(name = "STATUS_NAME_TH", length = 200)
	public String getStatusNameTh() {
		return this.statusNameTh;
	}

	public void setStatusNameTh(String statusNameTh) {
		this.statusNameTh = statusNameTh;
	}

	@Column(name = "STATUS_NAME_EN", length = 200)
	public String getStatusNameEn() {
		return this.statusNameEn;
	}

	public void setStatusNameEn(String statusNameEn) {
		this.statusNameEn = statusNameEn;
	}

	@JsonManagedReference
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "masterStatus", cascade = CascadeType.ALL)
	public List<MasterPaymentLine> getMasterPaymentLines() {
		return this.masterPaymentLines;
	}

	public void setMasterPaymentLines(List<MasterPaymentLine> masterPaymentLines) {
		this.masterPaymentLines = masterPaymentLines;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "masterStatus",cascade = CascadeType.ALL)
	public List<EpayTaxPaymentOutbound> getEpayTaxPaymentOutbounds() {
		return this.epayTaxPaymentOutbounds;
	}

	public void setEpayTaxPaymentOutbounds(List<EpayTaxPaymentOutbound> epayTaxPaymentOutbounds) {
		this.epayTaxPaymentOutbounds = epayTaxPaymentOutbounds;
	}

	@JsonManagedReference
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "masterStatus", cascade = CascadeType.ALL)
	public List<EpayReceiverPaymentLine> getEpayReceiverPaymentLines() {
		return this.epayReceiverPaymentLines;
	}

	public void setEpayReceiverPaymentLines(List<EpayReceiverPaymentLine> epayReceiverPaymentLines) {
		this.epayReceiverPaymentLines = epayReceiverPaymentLines;
	}
	
	@JsonManagedReference
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "masterStatus", cascade = CascadeType.ALL)
	public List<EpayTaxPaymentInfo> getEpayTaxPaymentInfos() {
		return this.epayTaxPaymentInfos;
	}

	public void setEpayTaxPaymentInfos(List<EpayTaxPaymentInfo> epayTaxPaymentInfos) {
		this.epayTaxPaymentInfos = epayTaxPaymentInfos;
	}

	@JsonManagedReference
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "masterStatus", cascade = CascadeType.ALL)
	public List<MasterReceiverUnit> getMasterReceiverUnits() {
		return this.masterReceiverUnits;
	}

	public void setMasterReceiverUnits(List<MasterReceiverUnit> masterReceiverUnits) {
		this.masterReceiverUnits = masterReceiverUnits;
	}

	@JsonManagedReference
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "masterStatus", cascade = CascadeType.ALL)
	public List<EpayAuthorization> getEpayAuthorizations() {
		return this.epayAuthorizations;
	}

	public void setEpayAuthorizations(List<EpayAuthorization> epayAuthorizations) {
		this.epayAuthorizations = epayAuthorizations;
	}

}
