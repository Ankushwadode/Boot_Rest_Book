package com.api.main.entities;


public class Book {
	private int Pid;
	private String Ptitle;
	private String Pauthor;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(int pid, String ptitle, String pauthor) {
		super();
		Pid = pid;
		Ptitle = ptitle;
		Pauthor = pauthor;
	}

	public int getPid() {
		return Pid;
	}

	public void setPid(int pid) {
		Pid = pid;
	}

	public String getPtitle() {
		return Ptitle;
	}

	public void setPtitle(String ptitle) {
		Ptitle = ptitle;
	}

	public String getPauthor() {
		return Pauthor;
	}

	public void setPauthor(String pauthor) {
		Pauthor = pauthor;
	}

	@Override
	public String toString() {
		return "Book [Pid=" + Pid + ", Ptitle=" + Ptitle + ", Pauthor=" + Pauthor + "]";
	}
	
}
