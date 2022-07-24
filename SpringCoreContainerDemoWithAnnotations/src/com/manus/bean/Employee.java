package com.manus.bean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emp") // Default name is |ClassName.lower()|
@Scope("prototype")
public class Employee {

	private int empid;
	private String empName;
	private int empSal;
	
	@Autowired
	private Address add;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSal() {
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}

	public Employee() {
		System.out.println("setter injection");
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empName=" + empName + ", empSal=" + empSal + ", empAdd=" + add + "]";
	}

	public Employee(int empid, String empName, int empSal, Address add) {
		super();
		System.out.println("param constructor");
		this.empid = empid;
		this.empName = empName;
		this.empSal = empSal;
		this.add = add;
	}

}
