package com.liuhuan.senior1.week1.pojo;

public class Brand {

	//品牌编号
	private Integer bid;
	//品牌名称
	private String bname;
	//所属种类
	private Kind kind;

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Kind getKind() {
		return kind;
	}

	public void setKind(Kind kind) {
		this.kind = kind;
	}

	@Override
	public String toString() {
		return "Brand [bid=" + bid + ", bname=" + bname + ", kind=" + kind + "]";
	}

	public Brand(Integer bid, String bname, Kind kind) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.kind = kind;
	}

	public Brand() {
		super();
		// TODO Auto-generated constructor stub
	}

}
