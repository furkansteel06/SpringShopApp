package tr.com.furkancelik.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tr.com.furkancelik.shop.business.IProductService;
import tr.com.furkancelik.shop.entities.Product;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ProductController {

	private IProductService productService;

	@Autowired
	public ProductController(IProductService productService) {
		this.productService = productService;
	}

	@GetMapping("/products")
	public List<Product> getAll() {
		return productService.getAll();
	}

	@GetMapping("/products/{id}")
	public Product getById(@PathVariable int id) {
		return productService.getById(id);
	}

	@PostMapping("/add")
	public void add(@RequestBody Product product) {
		productService.add(product);
	}

	@PostMapping("/update")
	public void update(@RequestBody Product product) {
		productService.update(product);
	}

	@DeleteMapping("/delete")
	public void delete(@RequestBody Product product) {
		productService.delete(product);
	}
}
