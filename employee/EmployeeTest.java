package com.employee;

import java.util.HashMap;

public class EmployeeTest {
public static void main(String[] args) {
		
		HashMap<Employee,MSavingAccount> hashMap=new HashMap<Employee,MSavingAccount>();
		
		MSavingAccount account1=new MSavingAccount(1234, "Divya", 1000.00, true);
		MSavingAccount account2=new MSavingAccount(1235, "Abhi", 10000.00, true);
		
		Employee employee1=new Employee(12356, "Ratan", "Analyst A4", 20_000.00, "865472647");
		Employee employee2=new Employee(12376, "Ram", "Analyst B1", 50_000.00, "8697427645");
	
		//creating relation 
		hashMap.put(employee1,account1);
		hashMap.put(employee2,account2);
	
		//printing the relations
		
		System.out.println("Employee 1 account details\n"+hashMap.get(employee1));
		System.out.println("Employee 1 account details\n"+hashMap.get(employee2));
		
	}

}
