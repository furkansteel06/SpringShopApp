package tr.com.furkancelik.shop.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tr.com.furkancelik.shop.dal.IProductDal;
import tr.com.furkancelik.shop.entities.Product;

@Service
public class ProductManager implements IProductService {

	private IProductDal productDal;

	@Autowired
	public ProductManager(IProductDal productDal) {
		this.productDal = productDal;
	}

	@Override
	@Transactional
	public List<Product> getAll() {
		return productDal.getAll();
	}

	@Override
	public void add(Product product) {
		productDal.add(product);
		
	}

	@Override
	public void insert(Product product) {
		productDal.insert(product);
		
	}

	@Override
	public void update(Product product) {
		productDal.update(product);
		
	}

	@Override
	public Product getById(int id) {
		return productDal.getById(id);
	}

}
