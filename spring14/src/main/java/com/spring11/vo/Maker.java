package com.spring11.vo;

public class Maker {
	private String part;
	private Integer partNum;
	
	public Maker(){}

	public Maker(String part, Integer partNum) {
		super();
		this.part = part;
		this.partNum = partNum;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public Integer getPartNum() {
		return partNum;
	}

	public void setPartNum(Integer partNum) {
		this.partNum = partNum;
	}

	@Override
	public String toString() {
		return "Maker [part=" + part + ", partNum=" + partNum + "]";
	}
	
	
	
}
