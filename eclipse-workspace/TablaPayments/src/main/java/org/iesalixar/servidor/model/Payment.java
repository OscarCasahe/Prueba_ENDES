package org.iesalixar.servidor.model;

public class Payment {

	private int customerNumber;
	private int checkNumber;
	private String paymentDate;
	private int amount;
	
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(int customerNumber, int checkNumber, String paymentDate, int amount) {
		super();
		this.customerNumber = customerNumber;
		this.checkNumber = checkNumber;
		this.paymentDate = paymentDate;
		this.amount = amount;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(int i) {
		this.customerNumber = i;
	}

	public int getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(int checkNumber) {
		this.checkNumber = checkNumber;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	
	
	
	
}
