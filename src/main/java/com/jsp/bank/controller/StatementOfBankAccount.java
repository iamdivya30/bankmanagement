package com.jsp.bank.controller;

import java.util.Scanner;

import com.jsp.bank.service.CustomerService;

public class StatementOfBankAccount {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter your bank id");
	int bankId = sc.nextInt();
	
	CustomerService customerService=new CustomerService();
	customerService.bankAccountStatement(bankId);
}
}
