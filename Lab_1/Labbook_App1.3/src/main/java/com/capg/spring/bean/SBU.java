package com.capg.spring.bean;

import java.util.List;

public class SBU {
private int sbuId;
private String sbuName;
private String sbuHead;
public List<Employee> getEmpList(){
	return empList;
}
public void setEmpList(List<Employee> empList) {
	this.empList = empList;
}
private List<Employee> empList;

public int getSbuId() {
	return sbuId;
}
public void setSbuId(int sbuId) {
	this.sbuId = sbuId;
}
public String getSbuName() {
	return sbuName;
}
public void setSbuName(String sbuName) {
	this.sbuName = sbuName;
}
public String getSbuHead() {
	return sbuHead;
}
public void setSbuHead(String sbuHead) {
	this.sbuHead = sbuHead;
}
@Override
public String toString() {
	return "SBU [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
}
}
