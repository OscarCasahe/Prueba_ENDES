package org.iesalixar.servidor.dao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.iesalixar.servidor.bd.ConexionBD;
import org.iesalixar.servidor.model.ProductLine;

public class ProductLineDaoImpl implements ProductLineDao{


		@Override
		public List<ProductLine> getAllProductLine() {
			ArrayList<ProductLine> productList = new ArrayList<>();

			try {

				String sql = "select * from productlines";
				PreparedStatement statement = ConexionBD.getConnection().prepareStatement(sql);

				ResultSet rs = statement.executeQuery();

				while (rs.next()) {

					ProductLine productLine = new ProductLine();

					productLine.setProductLine(rs.getString("productLine"));
					productLine.setHtmlDescription(rs.getString("htmlDescription"));
					productLine.setTextDescription(rs.getString("textDescription"));

					productList.add(productLine);

				}

				ConexionBD.close();
			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}

			return productList;
		}

		
		
		@Override
		public ProductLine getProductLine(String productLine) {
			
			ProductLine theOne = null;
			
			try {

				String sql = "select * from productlines where productLine= ?";
				PreparedStatement statement = ConexionBD.getConnection().prepareStatement(sql);
				statement.setString(1, productLine);


				ResultSet rs = statement.executeQuery();

				while (rs.next()) {



					theOne.setProductLine(rs.getString("productLine"));
					theOne.setHtmlDescription(rs.getString("htmlDescription"));
					theOne.setTextDescription(rs.getString("textDescription"));



				}
				ConexionBD.close();

			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}

			return theOne;
		}
		
		
		@Override
		public boolean removeProductLine(String productLine) {
			int resultado=0;
			
			try {

				String sql = "delete from productlines where productLine=?";
				PreparedStatement statement = ConexionBD.getConnection().prepareStatement(sql);
				statement.setString(1, productLine);

				resultado = statement.executeUpdate();

				ConexionBD.close();

			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}

			return (resultado==0?false:true);
		}
		
		
		

		@Override
		public boolean updateProductLine(ProductLine productLine) {
			
			int resultado=0;
			
			try {

				String sql = "update productlines set textDescription= ?, htmlDescription=? where productLine = ?";
				PreparedStatement statement = ConexionBD.getConnection().prepareStatement(sql);
				statement.setString(1,productLine.getTextDescription());
				statement.setString(2, productLine.getHtmlDescription());
		


				resultado = statement.executeUpdate();

				ConexionBD.close();

			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}

			return (resultado==0?false:true);
		}



		@Override
		public boolean insertProductLine(String productLine, String textDescription, String HtmlDescription) {
			
			int resultado=0;
			
			try {

				String sql = "insert into  productlines values productLine = ?, textDescription= ?, htmlDescription=?";
				PreparedStatement statement = ConexionBD.getConnection().prepareStatement(sql);
				statement.setString(1,productLine);
				statement.setString(2, textDescription);
				statement.setString(3, HtmlDescription);
		


				resultado = statement.executeUpdate();

				ConexionBD.close();

			} catch (SQLException ex) {
				System.out.println(ex.getMessage());
			}

			return (resultado==0?false:true);
		}

	}


