package com.adj.oexam;


public class Exam {
	private int id;
	private String ename;
	private String heldBy;
	private String state;
	public Exam(int id, String ename, String heldBy, String state) {
		super();
		this.id = id;
		this.ename = ename;
		this.heldBy = heldBy;
		this.state = state;
	}
	public Exam(String ename2, String heldBy2, String state2) {
		this.ename = ename2;
		this.heldBy = heldBy2;
		this.state = state2;
	}
	@Override
	public String toString() {
		return "Exam [id=" + id + ", ename=" + ename + ", heldBy=" + heldBy + ", state=" + state + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getHeldBy() {
		return heldBy;
	}
	public void setHeldBy(String heldBy) {
		this.heldBy = heldBy;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}

	

}
