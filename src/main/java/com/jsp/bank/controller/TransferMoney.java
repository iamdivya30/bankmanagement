package com.jsp.bank.controller;

import java.util.Scanner;

import com.jsp.bank.dto.BankAccount;
import com.jsp.bank.service.CustomerService;

public class TransferMoney {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Customers Id");
		int customerId = sc.nextInt();
		System.out.println("Enter your bank Id");
		int customerBankId = sc.nextInt();
		System.out.println("Enter receiver Bank id");
		int receiverBankId = sc.nextInt();
		System.out.println("Enter transfer Amount");
		double transferAmount = sc.nextDouble();
		if (transferAmount > 0) {

			CustomerService customerService = new CustomerService();
			BankAccount bankAccount = customerService.transferAmount(customerId, customerBankId, receiverBankId,
					transferAmount);
			if (bankAccount != null) {
				System.out.println("transaction Complete");
			} else {
				System.out.println("transaction failed");
			}
		} else {
			System.out.println("Invalid amount");
		}
	}
}
