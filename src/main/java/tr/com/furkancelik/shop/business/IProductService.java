package tr.com.furkancelik.shop.business;

import java.util.List;

import tr.com.furkancelik.shop.entities.Product;

public interface IProductService {
	List<Product> getAll();

	void add(Product product);

	void update(Product product);

	void delete(Product product);

	Product getById(int id);
}
