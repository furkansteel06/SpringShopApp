package tr.com.furkancelik.shop.business;

import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.AllArgsConstructor;
import tr.com.furkancelik.shop.dal.IProductDal;
import tr.com.furkancelik.shop.entities.Product;

@Service
@AllArgsConstructor
public class ProductManager implements IProductService {

	private final IProductDal productDal;

	@Override
	@Transactional
	public List<Product> getAll() {
		return productDal.getAll();
	}

	@Override
	@Transactional
	public void add(Product product) {
		productDal.add(product);

	}

	@Override
	@Transactional
	public void update(Product product) {
		productDal.update(product);

	}

	@Override
	@Transactional
	public void delete(Product product) {
		productDal.delete(product);

	}

	@Override
	@Transactional
	public Product getById(int id) {
		return productDal.getById(id);
	}

}
