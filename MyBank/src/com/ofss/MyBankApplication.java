package com.ofss;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.ofss.model.Account;
import com.ofss.model.AccountDetails;
import com.ofss.model.Customer;
import com.ofss.service.CustomerService;

public class MyBankApplication {

	public static void main(String[] args) throws Exception {
		 	// Step 1: Create customer object and populate with required details
				Customer customer=new Customer();
				CustomerService cs=new CustomerService();
				customer.setFirstName("Bill");
				customer.setLastName("Gates");
				customer.setGender('M');
				customer.setAddress("12, Main Street, Bangalore");
				customer.setAge(23);
				DateFormat df=new SimpleDateFormat("yyyy-MM-dd"); // decide the date format
				String myDOB="2000-05-07"; // 7th May 2000
				Date dob=df.parse(myDOB);
				customer.setDateOfBirth(dob);
				customer.setAadharId(123456789012L);
				customer.setPanCardId("ABCDEF1234");
				customer.setEmailId("java.guru@yahoo.com");
				customer.setPhoneNumber(1234567890L);
				
				// Now, customer is a FULLY POPULATED OBJECT
				System.out.println("before account creation");
				cs.displayCustomerDetails(customer);
		// Step 2: Create an object of CustomerService class
				CustomerService customerService=new CustomerService();
				String accountType="Current";
				double initialAmount=5000.0;
				AccountDetails accountDetails=customerService.applyForAccount(customer, accountType, initialAmount);
				if (accountDetails!=null)
				{
					System.out.println("After account creation");
					System.out.println("Below is the account details...");
					System.out.println(accountDetails);
					
				}
				
				
				

	}

}
