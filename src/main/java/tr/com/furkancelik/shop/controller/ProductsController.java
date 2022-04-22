package tr.com.furkancelik.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tr.com.furkancelik.shop.business.IProductService;
import tr.com.furkancelik.shop.entities.Product;

@RestController
@RequestMapping("/api")
public class ProductsController {

	private IProductService productService;

	@Autowired
	public ProductsController(IProductService productService) {
		this.productService = productService;
	}
	
	@GetMapping("/product")
	public List<Product> getAll() {
		return productService.getAll();
	}
}
