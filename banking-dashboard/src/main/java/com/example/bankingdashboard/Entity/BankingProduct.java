package com.example.bankingdashboard.Entity;


public class BankingProduct {

	private int id;
    private String productName;
    private String category;
    private String status;
    private String metricOne;
    private String metricTwo;
	
    
    
    
    
    
    public BankingProduct(int id, String productName, String category, String status, String metricOne,
			String metricTwo) {
		super();
		this.id = id;
		this.productName = productName;
		this.category = category;
		this.status = status;
		this.metricOne = metricOne;
		this.metricTwo = metricTwo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMetricOne() {
		return metricOne;
	}
	public void setMetricOne(String metricOne) {
		this.metricOne = metricOne;
	}
	public String getMetricTwo() {
		return metricTwo;
	}
	public void setMetricTwo(String metricTwo) {
		this.metricTwo = metricTwo;
	}

    
    
	
	
	
	
	
	
}
