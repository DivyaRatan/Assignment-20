
package com.savingaccount;

import java.util.List;
import java.util.ArrayList;

public class SavingAccountTest {
    public static void main(String[] args) {
    	List<SavingAccount> list=new ArrayList<>();
    	SavingAccount saving1=new SavingAccount(1000,44,"Divya",true);
    	SavingAccount saving2=new SavingAccount(5000,25,"Jayant",false);
    	SavingAccount saving3=new SavingAccount(8000,50,"Joti",true);
    	SavingAccount saving4=new SavingAccount(40000,100,"Triphathi",true);
    	SavingAccount saving5=new SavingAccount(10000,80,"Pragya",false);
    	
    	list.add(saving1);
    	list.add(saving2);
    	list.add(saving3);
    	list.add(saving4);
    	list.add(saving5);
    	
    	list.stream().forEach(System.out::println);
    	System.out.println("****************************************************************");
    	saving1.deposit(5000);
    	saving2.deposit(60000);
    	saving3.deposit(8000);
    	saving4.deposit(10000);
    	saving5.deposit(500);
    	
    	list.stream().forEach(System.out::println);
    	System.out.println("****************************************************************");
    	saving1.withdraw(5000);
    	saving2.withdraw(600);
    	saving3.withdraw(800);
    	saving4.withdraw(1000);
    	saving5.withdraw(500);
    	
    	list.stream().forEach(System.out::println);
    }
}
