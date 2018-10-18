package com.internousdev.oden.dto;

public class OdenDTO {

	private int odenId;
	public int getOdenId() {
		return odenId;
	}
	public void setOdenId(int odenId) {
		this.odenId = odenId;
	}
	public String getOdenName() {
		return odenName;
	}
	public void setOdenName(String odenName) {
		this.odenName = odenName;
	}
	public String getOdenPrice() {
		return odenPrice;
	}
	public void setOdenPrice(String odenPrice) {
		this.odenPrice = odenPrice;
	}
	private String odenName;
	private String odenPrice;

}
