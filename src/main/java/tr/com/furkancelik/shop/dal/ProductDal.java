package tr.com.furkancelik.shop.dal;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import tr.com.furkancelik.shop.entities.Product;

@Repository
public class ProductDal implements IProductDal {

	private EntityManager entityManager;

	@Autowired
	public ProductDal(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Transactional
	@Autowired
	public List<Product> getAll() {
		Session session = entityManager.unwrap(Session.class);
		List<Product> products = session.createQuery("from Product").getResultList();
		return products;
	}
}
