package com.wipro.microservices.s;

public class Invoice {
	Book book;
	int quantity;
	double taxRate;
	double total;
	double discountRate;
	
	public Invoice(Book book, int quantity, double discountRate ,double taxRate) {
		this.book=book;
		this.quantity=quantity;
		this.discountRate=discountRate;
		this.total=this.calculateTotal();
	}
	public double calculateTotal() {
		double price=((book.price-book.price*discountRate)*this.quantity);
		double pricewithTax=price*(1*taxRate);
		return pricewithTax;
	}
	public void printInvoice() {
		System.out.println();
	}

}
