package com.jsp.bank.controller;

import java.util.List;

import com.jsp.bank.dto.Customers;
import com.jsp.bank.service.CustomerService;

public class GetAllCustomers {

	public static void main(String[] args) {
		CustomerService customerService= new CustomerService();
		customerService.getAllCustomers();
	}
}
