package com.hdfc.ergo.businees;

import java.util.ArrayList;
import java.util.List;

import com.hdfc.ergo.data.Customer;

public class CarInsuranceServiceCollection {
	
	
	public  static List<Customer[]> prepareCustomerData(int size){
		List<Customer[]> customerData = new ArrayList<>();
		for (int i = 1; i < size; ++i) {
			Customer customer1 = new Customer();
			customer1.setName("abc"+i);
			customer1.setEmail("abc@gmail.com"+i);
			customer1.setMobileNumber("123456"+i);
			customer1.setCoverageType("Thirdparty"+i);
			customerData.addAll(customer1);

		}
		
		return customerData;
	}

	public static void main(String[] args) {
		List<Customer[]> customerList=prepareCustomerData(10);
	}

}
