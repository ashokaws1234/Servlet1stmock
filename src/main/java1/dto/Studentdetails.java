package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
public class Studentdetails {
	@Id
	int empid;
	String name;
	long mobile;
	
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
}