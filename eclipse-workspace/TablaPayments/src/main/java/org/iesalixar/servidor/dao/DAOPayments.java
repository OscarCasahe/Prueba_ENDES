package org.iesalixar.servidor.dao;

import java.util.ArrayList;

import org.iesalixar.servidor.model.Payment;

public interface DAOPayments {


		public Payment getPayment(int customerNumber, int checkNumber);
		public ArrayList<Payment> getAllPayment();
		
		


	
}
