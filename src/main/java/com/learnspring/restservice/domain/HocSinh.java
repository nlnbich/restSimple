package com.learnspring.restservice.domain;

public class HocSinh {
	
	private String maHocSinh;
	private String hoHocSinh;
	private String tenHocSinh;
	
	
	public String getMaHocSinh() {
		return maHocSinh;
	}
	public void setMaHocSinh(String maHocSinh) {
		this.maHocSinh = maHocSinh;
	}
	public String getHoHocSinh() {
		return hoHocSinh;
	}
	public void setHoHocSinh(String hoHocSinh) {
		this.hoHocSinh = hoHocSinh;
	}
	public String getTenHocSinh() {
		return tenHocSinh;
	}
	public void setTenHocSinh(String tenHocSinh) {
		this.tenHocSinh = tenHocSinh;
	}
	
	@Override
	public String toString() {
		return "Hoc Sinh: " + maHocSinh + hoHocSinh + tenHocSinh;
		
	}
	
	
	
	
	

}
