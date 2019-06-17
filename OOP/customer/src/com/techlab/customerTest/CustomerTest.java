package com.techlab.customerTest;

import com.techlab.customer.Customer;

public class CustomerTest {

	public static void main(String[] args) {
		Customer vivek=new Customer("vivek","jivani");
		Customer darshan=new Customer("darshan","dhameliya");
		Customer hiren=new Customer("hiren","more");
		vivek.displayCustomerDetail();
		darshan.displayCustomerDetail();
		hiren.displayCustomerDetail();
	}

}
