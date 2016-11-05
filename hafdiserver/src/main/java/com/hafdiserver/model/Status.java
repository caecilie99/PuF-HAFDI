package com.hafdiserver.model;


import javax.persistence.*;

@Entity
@Table(name = "status")
public class Status {

	@Id
	@GeneratedValue
	@Column(name = "STATUS_ID")
	private String id;

	@Column(name = "STATUS_WERT")
	private String status_wert;

	@Column(name = "CODE_ZAHL_STS")
	private String code_zahl_sts;

	@Column(name = "BESCHREIBUNG")
	private String beschreibung;

	public Status() {
	}

	public Status(String status_wert, String code_zahl_sts, String beschreibung) {
		this.status_wert = status_wert;
		this.code_zahl_sts = code_zahl_sts;
		this.beschreibung = beschreibung;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus_wert() {
		return status_wert;
	}

	public void setStatus_wert(String status_wert) {
		this.status_wert = status_wert;
	}

	public String getCode_zahl_sts() {
		return code_zahl_sts;
	}

	public void setCode_zahl_sts(String code_zahl_sts) {
		this.code_zahl_sts = code_zahl_sts;
	}

	public String getBeschreibung() {
		return beschreibung;
	}

	public void setBeschreibung(String beschreibung) {
		this.beschreibung = beschreibung;
	}
}
