package com.lh.pojo;

public class Sort {
	private Integer sid;
	private String sname;

	public Integer getSid() {
		return sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Sort [sid=" + sid + ", sname=" + sname + "]";
	}

	public Sort(Integer sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}

	public Sort() {
		super();
	}

}
