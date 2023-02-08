package com.bridgelabz.UserCustomExceptions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class UserException {

	Scanner sc = new Scanner (System.in);
	// pattern for first name

	@Test
	public void fName() {

		System.out.println(" Enter the First Name: ");
		String fname = sc.next();

		Pattern p = Pattern.compile("^[A-Z][a-z]{2,}");	
		
		Matcher m = p.matcher(fname);
		
		try {
			if (m.find()) {
				System.out.println(" Name is Valid ");
			}else {
				throw new CustomException(" Exception: Name is Invalid ");
			}
		}catch(CustomException ce) {
			System.out.println(ce.getMessage());
		}
		
	}
	
	// pattern for last name

	@Test
	public void lName() {
		
		System.out.println("\n Enter the Last Name: ");
		String lname = sc.next();

		Pattern p = Pattern.compile("^[A-Z][a-z]{2,}");	
		
		Matcher m = p.matcher(lname);
		
		try {
			if (m.find()) {
				System.out.println(" Last name is Valid ");
			}else {
				throw new CustomException(" Exception: Last name is Invalid ");
			}
		}catch(CustomException ce) {
			System.out.println(ce.getMessage());
		}
		
	}
	
	// pattern for email
	
	@Test
	public void email() {
		
		System.out.println("\n Enter Email: ");
		String email = sc.next();

		Pattern p = Pattern.compile("^[abc][.a-z]*[@][bl][.][co][.a-z]*");	
		
		Matcher m = p.matcher(email);
		
		try {
			if (m.find()) {
				System.out.println(" Email is valid ");
			}else {
				throw new CustomException(" Exception: Email is Invalid ");
			}
		}catch(CustomException ce) {
			System.out.println(ce.getMessage());
		}
		
	}
	
	// pattern for mobile

	@Test
	public void mobile() {
		
		System.out.println("\n Enter Mobile number: ");
		String mobile = sc.next();
		
		Pattern p = Pattern.compile("^(91-)[6-9][0-9]{9}");	
		
		Matcher m = p.matcher(mobile);
		
		try {
			if (m.find()) {
				System.out.println(" Mobile number is valid ");
			}else {
				throw new CustomException(" Exception: Mobile number is Invalid ");
			}
		}catch(CustomException ce) {
			System.out.println(ce.getMessage());
		}
		
	}
	
	// patter for password rule 1 8 characters

	@Test
	public void password() {
		
		System.out.println("\n Enter Password: ");
		String password = sc.next();
		
		Pattern p = Pattern.compile("[[a-zA-z0-9]]{8,}");	
		
		Matcher m = p.matcher(password);
		
		try {
			if (m.find()) {
				System.out.println(" Password is Valid ");
			}else {
				throw new CustomException(" Exception: Password is Invalid ");
			}
		}catch(CustomException ce) {
			System.out.println(ce.getMessage());
		}
		
	}
	
	// pattern for password rule 2 upper case

	@Test
	public void upper_Case() {
		
		System.out.println("\n Enter the Password ");
		String upper = sc.next();
		
		Pattern p = Pattern.compile("[[a-z][0-9A-Z]+]{8,}");
		
		Matcher m = p.matcher(upper);
			
		try {
			if (m.find()) {
				System.out.println(" Upper case in paasword is Valid ");
			}else {
				throw new CustomException(" Exception: Upper case in password is Invalid ");
			}
		}catch(CustomException ce) {
			System.out.println(ce.getMessage());
		}
		
	}
		
	// pattern for password rule 3 numeric number

	@Test
	public void number() {
		
		System.out.println("\n Enter the Password ");
		String numeric = sc.next();
		
		Pattern p = Pattern.compile("[[a-z]([0-9]+)([A-Z]+)]{8,}");
		
		Matcher m = p.matcher(numeric);
			
		try {
			if (m.find()) {
				System.out.println(" Numeric number in password is Valid ");
			}else {
				throw new CustomException(" Exception: Numeric number in password is Invalid ");
			}
		}catch(CustomException ce) {
			System.out.println(ce.getMessage());
		}
		
	}
		
	// pattern for password rule 4 special character

	@Test
	public void special_Character() {
		
		System.out.println("\n Enter the Password ");
		String special = sc.next();
		
		Pattern p = Pattern.compile("[[a-z]([0-9]+)([A-Z]+)([!#*@$&]+)]{8,}");
		
		Matcher m = p.matcher(special);
					
		try {
			if (m.find()) {
				System.out.println(" Special character in password is Valid ");
			}else {
				throw new CustomException(" Exception: Special character in password is Invalid ");
			}
		}catch(CustomException ce) {
			System.out.println(ce.getMessage());
		}
		
	}
}
