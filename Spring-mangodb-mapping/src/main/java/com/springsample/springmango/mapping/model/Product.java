package com.springsample.springmango.mapping.model;

import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data

public class Product {
	@Id
	//private int proid;
	private String proname;
	private int quantity;
	private int price;
	
	public String getProname() {
		return proname;
	}
	public void setProname(String proname) {
		this.proname = proname;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [proname=" + proname + ", quantity=" + quantity + ", price=" + price + "]";
	}
	public Product(String proname, int quantity, int price) {
		super();
		this.proname = proname;
		this.quantity = quantity;
		this.price = price;
	}
	
    
	
}
