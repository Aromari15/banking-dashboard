package com.example.bankingdashboard.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bankingdashboard.Entity.BankingProduct;
import com.example.bankingdashboard.Service.ProductService;


@RestController
@RequestMapping("/api/products")
public class ProductController 
{
	
	private final ProductService productService;

public ProductController(ProductService productService) {
    this.productService = productService;
}

// Get all banking products
@GetMapping("/all")
public ResponseEntity<List<BankingProduct>> getAllProducts() {

    List<BankingProduct> products =
            productService.getAllProducts();

    return ResponseEntity.ok(products);
}

// Get product by id
@GetMapping("/{id}")
public ResponseEntity<BankingProduct> getProductById(
        @PathVariable int id) {

    BankingProduct product =
            productService.getProductById(id);

    if (product == null) {
        return ResponseEntity.notFound().build();
    }

    return ResponseEntity.ok(product);
}
}