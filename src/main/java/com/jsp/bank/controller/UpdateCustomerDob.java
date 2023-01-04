package com.jsp.bank.controller;

import java.util.Scanner;

import com.jsp.bank.service.CustomerService;

public class UpdateCustomerDob {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your id");
		int id = sc.nextInt();
		System.out.println("Enter your Dob");
		String dob = sc.next();

		CustomerService customerService = new CustomerService();
		customerService.updateCustomersGenderById(id, dob);
	}
}
