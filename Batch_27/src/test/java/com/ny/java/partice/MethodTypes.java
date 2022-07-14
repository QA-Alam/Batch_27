package com.ny.java.partice;
public class MethodTypes {

//void method or non-return method	
	public void name() {
	}

//  AQA 
//return method or Non-Void Method + no parameterize method
	public String names() {
		return "Smart Tech";
	}

//parameterize method + void method
	public static void employeesInfo(String name, int salary) {
		System.out.println("Employee Name : " + name + "Employee Salary " + salary);
	}

//parameterize method + return method
	public int sal() {
		int num = 100;
		System.out.println(num);
		return num;
	}

	public static void main(String[] args) {
		MethodTypes obj = new MethodTypes();
		obj.employeesInfo("Tariqul ", 8000);
		obj.employeesInfo("Refat ", 9000);
		obj.employeesInfo("Hamidul ", 8000);
		obj.sal();

	}
}