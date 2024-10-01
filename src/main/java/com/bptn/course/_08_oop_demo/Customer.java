package com.bptn.course._08_oop_demo;

class Customer {
	private String customerId;
	private String customerName;
	private String customerEmail;
	private ShoppingCart cart;

	public Customer(String customerId, String customerName, String customerEmail) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerEmail = customerEmail;
		this.cart = new ShoppingCart();
	}

	// Getter for customerName
	public String getCustomerName() {
		return this.customerName;
	}

	// Getter for cart
	public ShoppingCart getCart() {
		return this.cart;
	}

	public void checkout() {
		System.out.println("Processing order for " + customerName + "...");
	}

}
