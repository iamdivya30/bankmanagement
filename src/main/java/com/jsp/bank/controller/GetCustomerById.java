package com.jsp.bank.controller;

import java.util.Scanner;

import com.jsp.bank.dto.Customers;
import com.jsp.bank.service.CustomerService;

public class GetCustomerById {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your id");
		int id = sc.nextInt();
		CustomerService customerService = new CustomerService();
		Customers customers=customerService.getCustomersById(id);
		if(customers!=null) {
			System.out.println("================================================");
			System.out.print(customers.getId()+"\t");
			System.out.print(customers.getName()+"\t");
			System.out.print(customers.getGender()+"\t");
			System.out.print(customers.getDob()+"\t");
			System.out.print(customers.getStatus()+"\t");
//			System.out.print(customers.getBankaccount());
		}
	}
}
