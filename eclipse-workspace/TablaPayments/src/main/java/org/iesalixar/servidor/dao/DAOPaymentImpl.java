package org.iesalixar.servidor.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.iesalixar.servidor.bd.ConexionBD;
import org.iesalixar.servidor.model.Payment;

public class DAOPaymentImpl implements DAOPayments{

	public DAOPaymentImpl() {
		// TODO Auto-generated constructor stub
	}



	
	@Override
	public ArrayList<Payment> getAllPayment() {
		
		ArrayList<Payment> paymentsList = new ArrayList<>();
		Payment payment;
		
		try {
			
			String sql = "select * from payments";
			PreparedStatement statement = ConexionBD.getConnection().prepareStatement(sql);			
			
			ResultSet rs = statement.executeQuery();
			
			 
			while (rs.next() ) {
				
				payment = new Payment();
				
				payment.setCustomerNumber(rs.getInt("customerNumber"));
				payment.setCheckNumber(rs.getInt("checkNumber"));
				payment.setPaymentDate(rs.getString("paymentDate"));
				payment.setAmount(rs.getInt("amount"));

				paymentsList.add(payment);
				
			}
			
			ConexionBD.close();
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}		
		
		return paymentsList;
		
		
	}




	@Override
	public Payment getPayment(int customerNumber, int checkNumber) {
		Payment payment = null;
		
		try {
			
			String sql = "select * from payments where customerNumber= ?";
			PreparedStatement statement = ConexionBD.getConnection().prepareStatement(sql);
			statement.setInt(1, customerNumber);
			
			ResultSet rs = statement.executeQuery();
			
			//Como el campo de búsqueda es la clave solo debería obtener un resultado
			//si no es así estaremos machacando cada vez el valor de customer y 
			while (rs.next() ) {
				

				 payment = new Payment();
				
				payment.setCustomerNumber(rs.getInt("customerNumber"));
				payment.setCheckNumber(rs.getInt("checkNumber"));
				payment.setPaymentDate(rs.getString("paymentDate"));
				payment.setAmount(rs.getInt("amount"));
				
			}
			
			ConexionBD.close();
			
		} catch (SQLException ex) {
			System.out.println(ex.getMessage());
		}
		
		
		
		return payment;
		
	}

	

	
}
