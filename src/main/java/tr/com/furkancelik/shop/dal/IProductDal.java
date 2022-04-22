package tr.com.furkancelik.shop.dal;

import java.util.List;
import tr.com.furkancelik.shop.entities.Product;

public interface IProductDal {
	List<Product> getAll();
}
