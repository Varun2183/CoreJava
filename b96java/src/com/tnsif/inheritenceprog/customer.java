//
package com.tnsif.inheritenceprog;

public class customer {

	private String name;
	private int id;
	private long aadharno;
	private long phoneno;
	
	//default constructor
	public customer() {
		super();
	}

	public customer(String name, int id, long aadharno, long phoneno) {
		super();
		this.name = name;
		this.id = id;
		this.aadharno = aadharno;
		this.phoneno = phoneno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getAadharno() {
		return aadharno;
	}

	public void setAadharno(long aadharno) {
		this.aadharno = aadharno;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	@Override
	public String toString() {
		return "customer [name=" + name + ", id=" + id + ", aadharno=" + aadharno + ", phoneno=" + phoneno + "]";
	}
	
	
}
