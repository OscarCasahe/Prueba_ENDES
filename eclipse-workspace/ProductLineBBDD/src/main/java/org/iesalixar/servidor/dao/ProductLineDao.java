package org.iesalixar.servidor.dao;

import java.util.List;

import org.iesalixar.servidor.model.ProductLine;

public interface ProductLineDao {

	
	public List<ProductLine> getAllProductLine();
	public ProductLine getProductLine(String productLine);
	public boolean removeProductLine(String productLine);
	public boolean updateProductLine(ProductLine productLine);
	public boolean insertProductLine(String productLine, String textDescription, String HtmlDescription);

	
}
