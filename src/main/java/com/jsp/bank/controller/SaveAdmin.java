package com.jsp.bank.controller;

import java.util.Scanner;

import com.jsp.bank.dto.Admin;

import com.jsp.bank.service.AdminService;


public final class SaveAdmin {
public static void main(String[] args) {
	
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter your name :");
	String name=sc.next();
	System.out.println("Enter your email :");
	String email=sc.next();
	System.out.println("Enter your Password :");
	String password=sc.next();
	Admin admin=new Admin();
	admin.setName(name);
	admin.setEmail(email);
	admin.setPassword(password);
	
	AdminService adminService = new AdminService();
	Admin admin2 = adminService.saveAdmin(admin);
	
	
}
}
