package com.ibm;




public class Employee {
	
private Integer eno;
private String name;
private Integer salary;
public Employee(){
	
}

public Employee(Integer eno, String name, Integer salary) {
	super();
	this.eno = eno;
	this.name = name;
	this.salary = salary;
}
public Integer getEno() {
	return eno;
}
public void setEno(Integer eno) {
	this.eno = eno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Integer getSalary() {
	return salary;
}
public void setSalary(Integer salary) {
	this.salary = salary;
}
}