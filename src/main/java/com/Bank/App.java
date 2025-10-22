package com.Bank;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.Bank.container.JavaConfig;
import com.Bank.service.Account;
import com.Bank.service.Balance;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc = new Scanner(System.in);
        ApplicationContext container = new AnnotationConfigApplicationContext(JavaConfig.class);
        
        Account ac = container.getBean(Account.class);
        Balance bl = container.getBean(Balance.class);
        
        ac.openAccount();
        
        boolean flag=true;
        while(flag) {
        	//System.out.println("Welcome: "+ac.name+" Account no: "+ac.acc_no);
        	System.out.println("Choose your option");
        	System.out.println("1. Check the balance");
        	System.out.println("2. Deposit the money");
        	System.out.println("3. Withdraw the money");
        	System.out.println("4. Logout");
        	
        	int choice = sc.nextInt();
        	
        	switch(choice) {
        	case 1: bl.checkBalance();
        	break;
        	
        	case 2: bl.depositMoney();
        	break;
        	
        	case 3: bl.withDrawMoney();
        	break;
        	
        	case 4: System.out.println("Thanks for choosing us");
        	flag=false;
        	break;
        	
        	default: System.out.println("Wrong input");
        	}
        	
        }
    }
}
