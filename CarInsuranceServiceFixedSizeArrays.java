package com.hdfc.ergo.businees;

import com.hdfc.ergo.data.Customer;

public class CarInsuranceServiceFixedSizeArrays {

	public static void main(String[] args) {
		
		Customer [] customers=new Customer[1000000];
		System.out.println("No of Customer issued car polocies----->"+customers.length);
		
		for (int i = 0; i <= 1000000; ++i) {
		
			Customer customer1 = new Customer();
			customer1.setName("abc");
			customer1.setEmail("abc@gmail.com");
			customer1.setMobileNumber("123456");
			customer1.setCoverageType("Thirdparty");
			customers[i]=new Customer();
		    
		}
		
	}

}
