package com.capgemini;

import java.util.*;
import java.util.regex.*;

public class EmailPattern {
	public static void main(String[] args) {
		System.out.println("Welcome to Email pattern check.");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Email for pattern checking: ");
		String mail = sc.nextLine();
		Pattern p = Pattern.compile("^abc+[.a-zA-Z0-9]*@bridgelabz.co+");
		Matcher m = p.matcher(mail);
		if (m.find()) {
			System.out.println("Valid Email.");
		} else {
			System.out.println("ERROR ! Not a valid Email. Please enter the correct pattern.");
		}
	}
}