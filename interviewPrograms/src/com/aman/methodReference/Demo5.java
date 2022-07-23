package com.aman.methodReference;

// Reference to a constructor

public class Demo5 {

	public static void main(String[] args) {
		
		// using anonymous class
		C c3 = new C() {
			@Override
			public Employee getEmployee() {
				return new Employee();
			}
		};
		c3.getEmployee().getInfo();
		
		D d3 = new D() {
			@Override
			public Employee getEmployee(String name, int age) {
				return new Employee(name, age);
			}
		};
		d3.getEmployee("ABC", 28).getInfo();
		
		
		
		//*** Using Lambda Expression ***//
		C c1 = () -> new Employee();
		c1.getEmployee().getInfo();
		
		D d1 = (name, age) -> new Employee(name, age);
		d1.getEmployee("ABC", 28).getInfo();
		
		
		//*** Using Method Reference ***//
		C c2 = Employee::new;
		c2.getEmployee().getInfo();
		
		D d2 = Employee::new;
		d2.getEmployee("XYZ",30).getInfo();
		
		

	}

}

interface C{
	public Employee getEmployee();
}

interface D{
	public Employee getEmployee(String name, int age);
}

class Employee{
	
	String eName;
	int eAge;
	
	public Employee() {
	}

	public Employee(String eName, int eAge) {
		this.eName = eName;
		this.eAge = eAge;
	}
	
	public void getInfo() {
		System.out.println("method in Employee class " + eName+ " "+ eAge);
	}
	
	
}