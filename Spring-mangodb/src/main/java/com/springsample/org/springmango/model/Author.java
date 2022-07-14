package com.springsample.org.springmango.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
 

@Document(collection="Author")
public class Author {
    @Id
	private int Authorid;
	private String Authorname;
	private int Authorage;
	private int Authoraddress;
	
	public int getAuthorid() {
		return Authorid;
	}
	public void setAuthorid(int authorid) {
		Authorid = authorid;
	}
	public String getAuthorname() {
		return Authorname;
	}
	public void setAuthorname(String authorname) {
		Authorname = authorname;
	}
	public int getAuthorage() {
		return Authorage;
	}
	public void setAuthorage(int authorage) {
		Authorage = authorage;
	}
	public int getAuthoraddress() {
		return Authoraddress;
	}
	public void setAuthoraddress(int authoraddress) {
		Authoraddress = authoraddress;
	}
	@Override
	public String toString() {
		return "Author [Authorid=" + Authorid + ", Authorname=" + Authorname + ", Authorage=" + Authorage
				+ ", Authoraddress=" + Authoraddress + "]";
	}
	
	
}
