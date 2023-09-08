package com.ofss.service;

import com.ofss.model.Account;
import com.ofss.model.AccountDetails;
import com.ofss.model.Customer;

public class CustomerService {
	public AccountDetails applyForAccount(Customer customer, String accountType, double initialAmount)
	{
		System.out.println("applyForAccount called.....");
		
		// Step 2: Create Services object
		Services services=new Services();
		// Step 3: call openAccount by passing the customer object
		AccountDetails accountDetails=services.openAccount(customer, accountType, initialAmount);
		return accountDetails;
	}
	
	public void displayCustomerDetails(Customer customer)
	{
		System.out.println(customer);
	}
	
	
}
