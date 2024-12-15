package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.model.Product;
import com.services.ProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {
	@Autowired
	private ProductService prodService;
	
	@GetMapping
	public Page<Product> getAllProducts(@RequestParam(defaultValue ="0")int page,@RequestParam(defaultValue = "5") int size){
		return prodService.getAllProducts(page,size);
	}
	
	@PostMapping
	public Product createProduct(@RequestBody Product prod) {
		return prodService.createProduct(prod);
	}
	
	@GetMapping("/{pId}")
	public ResponseEntity<Product> getProductById(@PathVariable("pId") int pId){
		return prodService.getProductById(pId).map(prod -> {
			prod.getCategory();
			return ResponseEntity.ok(prod);
		}).orElse(ResponseEntity.notFound().build());
	}
	
    @PutMapping("/{pId}")
    public ResponseEntity<Product> updateProduct(@PathVariable("pId") int pId, @RequestBody Product prod){
    	return ResponseEntity.ok(prodService.updateProduct(pId, prod));
    }
    
    @DeleteMapping("/{pId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable("pId") int pId){
    	prodService.deleteProduct(pId);
    	return ResponseEntity.noContent().build();
    }
}
