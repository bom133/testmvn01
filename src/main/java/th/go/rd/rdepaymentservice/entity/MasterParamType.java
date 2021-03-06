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
 * MasterParamType generated by hbm2java
 */
@Entity
@Table(name = "MASTER_PARAM_TYPE")
public class MasterParamType implements java.io.Serializable {

	private String paramType;
	private String paramDescription;
	private List<EpayParameter> epayParameters = new ArrayList<>();

	public MasterParamType() {
	}

	public MasterParamType(String paramType) {
		this.paramType = paramType;
	}
	public MasterParamType(String paramType, String paramDescription, List<EpayParameter> epayParameters) {
		this.paramType = paramType;
		this.paramDescription = paramDescription;
		this.epayParameters = epayParameters;
	}

	@Id

	@Column(name = "PARAM_TYPE", unique = true, nullable = false, length = 20)
	public String getParamType() {
		return this.paramType;
	}

	public void setParamType(String paramType) {
		this.paramType = paramType;
	}

	@Column(name = "PARAM_DESCRIPTION", length = 200)
	public String getParamDescription() {
		return this.paramDescription;
	}

	public void setParamDescription(String paramDescription) {
		this.paramDescription = paramDescription;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "masterParamType",cascade=CascadeType.ALL)
	public List<EpayParameter> getEpayParameters() {
		return this.epayParameters;
	}

	public void setEpayParameters(List<EpayParameter> epayParameters) {
		this.epayParameters = epayParameters;
	}

}
