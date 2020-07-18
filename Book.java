package com.montran.pojo;

public class Book {
private int book_no;
private String book_title;
private double price;


private double total_cost(int n) {
	return n* price;
	
}

public void input(int book_no, String book_title, double price) {
	this.book_no=book_no;
	this.book_title= book_title;
	this.price = price;
			
}
public double purchase(int n) {
	return total_cost(n);
}

@Override
public String toString() {
	return "Book [book_no=" + book_no + ", book_title=" + book_title + ", price=" + price + "]";
}
}
