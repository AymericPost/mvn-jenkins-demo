package fr.inetum.web.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.inetum.web.models.Product;
import fr.inetum.web.models.ProductRepository;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class ProductController {

	@Autowired
	ProductRepository productRepository;
	
	@PostMapping("/product")
	Product createProduct(@RequestBody Product newProduct) {
		return productRepository.save(newProduct);
	}

	@GetMapping("/products")
	List<Product> allProducts() {
		return productRepository.findAll();
	}

}
