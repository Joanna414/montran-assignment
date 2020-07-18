package com.montran.main;

import java.util.Scanner;

import com.montran.pojo.Book;

public class BookMain {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		Book b = new Book();
		//entering the value in input function
		b.input(1234,"Joannaa",300);
		System.out.println(b);
		System.out.println("Enter the number of copies to be purchased: ");
		int n = scanner.nextInt();
		if (n>0)
			System.out.println("Total Bill is" + b.purchase(n));
		else
			System.out.println("Invalid Number");
	}
}
