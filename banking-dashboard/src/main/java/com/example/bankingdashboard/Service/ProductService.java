package com.example.bankingdashboard.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.bankingdashboard.Entity.BankingProduct;
@Service
public class ProductService {
	  private List<BankingProduct> products = new ArrayList<>();

	    public ProductService() {

	        products.add(new BankingProduct(
	            1, "Savings Account", "SAVINGS",
	            "ACTIVE", "Balance: ₹1,50,000",
	            "Interest: 3.5%"));

	        products.add(new BankingProduct(
	            2, "Credit Card", "CREDIT_CARD",
	            "ACTIVE", "Limit: ₹1,00,000",
	            "Available: ₹75,000"));

	        products.add(new BankingProduct(
	            3, "Personal Loan", "LOAN",
	            "PENDING", "Amount: ₹5,00,000",
	            "Interest: 10.5%"));

	        products.add(new BankingProduct(
	            4, "Mutual Fund", "WEALTH",
	            "ACTIVE", "Investment: ₹2,50,000",
	            "Returns: 8.2%"));
	    }

	    public List<BankingProduct> getAllProducts() {
	        return products;
	    }

	    public BankingProduct getProductById(int id) {

	        for (BankingProduct product : products) {

	            if (product.getId() == id) {
	                return product;
	            }
	        }

	        return null;
	    }
	}