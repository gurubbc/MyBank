package com.ofss.service;

import java.util.Random;

import com.ofss.model.Account;
import com.ofss.model.AccountDetails;
import com.ofss.model.CurrentAccount;
import com.ofss.model.Customer;
import com.ofss.model.SalaryAccount;
import com.ofss.model.SavingsAccount;

import jdk.internal.org.objectweb.asm.tree.IntInsnNode;

public class Services {
	public AccountDetails openAccount(Customer customer, String accountType, double initialAmount)
	{
		System.out.println("openAccount is called...");
		// validate if the length of the phone number is of 10 digits
		// If the length is 10 digits, let's open account and retrun true, else false
		// Let me convert phoneNumber to String type
		boolean mobileNumber = false;
		boolean aadharId = false;
		boolean panId = false;
		boolean emailId= false;
		Account acc=null; // initialization 
		AccountDetails acDetails=null;// initializtion
		
		String mob=String.valueOf(customer.getPhoneNumber()); // mob is just a local variable
		String aad=String.valueOf(customer.getAadharId());
		
		if (mob.length()==10)
			mobileNumber=true;
		
		if (!customer.getEmailId().isBlank())
			emailId=true;
		
		if (!aad.isBlank() && aad.length()==12)
			aadharId=true;
		
			
		if (!customer.getPanCardId().isBlank() && customer.getPanCardId().length()==10)
			panId=true;
		
		if (mobileNumber && aadharId && panId && emailId)
		{
			// I need to generate an account number, for this I can utilize Random class
			Random r=new Random();
			customer.setId(r.nextInt(100)); // this.id is a property of this class
			if (accountType.equals("Savings"))
			{
				acc=new SavingsAccount(customer.getId(), initialAmount, "hdfc123", "HDFC", accountType, 1000);
			}
			else 
				if (accountType.equals("Current"))
				{
					acc=new CurrentAccount(customer.getId(), initialAmount, "hdfc123", "HDFC", accountType, 5000);
				}
				else 
					if (accountType.equals("Salary"))
					{
						acc=new SalaryAccount(customer.getId(), initialAmount, "hdfc123", "HDFC", accountType,0);
					}
			
			
			if (acc!=null)
			{
				System.out.println("Account of type "+accountType+" created....this is the account id "+customer.getId());
				
				acDetails=sendWelcomeKit(customer, acc);
			}
			
			return acDetails;
		}
		else
		{
			System.out.println("Issues with KYC document....try again");
			return acDetails; // it is null
		}
		
	}
	
	
	public AccountDetails sendWelcomeKit(Customer c, Account acc)
	{
		System.out.println("Sending the welcome kit");
		AccountDetails accountDetails=new AccountDetails(acc, c);
		// optional step: if you want to send username & initial password along with the welcomekit, you can also do that here
		return accountDetails;
	}
}
