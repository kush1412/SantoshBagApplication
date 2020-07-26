package com.spring.SantoshBagApplication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Stock")
public class Stock {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="category")
	private String category;
	
	@Column(name="model_number")
	private String modelNumber;
	
	@Column(name="color")
	private String color;
	
	@Column(name="size")
	private String size;
	
	@Column(name="brand_name")
	private String brandName;
	
	@Column(name="available_quantity")
	private String availableQuantity;
	
	@Column(name="total_quantity")
	private String totalQuantity;
	
	@Column(name="price")
	private String price;
	
	@Column(name="total_price")
	private String totalPrice;
	
	@Column(name="vendor_name")
	private String vendorName;
	
	@Column(name="discount")
	private String discount;	
	
	public Stock() {
		
	}
	

	public Stock(int id, String category, String modelNumber, String color, String size, String brandName,
			String availableQuantity, String totalQuantity, String price, String totalPrice, String vendorName,
			String discount) {
		super();
		this.id = id;
		this.category = category;
		this.modelNumber = modelNumber;
		this.color = color;
		this.size = size;
		this.brandName = brandName;
		this.availableQuantity = availableQuantity;
		this.totalQuantity = totalQuantity;
		this.price = price;
		this.totalPrice = totalPrice;
		this.vendorName = vendorName;
		this.discount = discount;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getModelNumber() {
		return modelNumber;
	}

	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	

	public String getAvailableQuantity() {
		return availableQuantity;
	}


	public void setAvailableQuantity(String availableQuantity) {
		this.availableQuantity = availableQuantity;
	}


	public String getTotalQuantity() {
		return totalQuantity;
	}


	public void setTotalQuantity(String totalQuantity) {
		this.totalQuantity = totalQuantity;
	}


	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getDiscount() {
		return discount;
	}

	public void setDiscount(String discount) {
		this.discount = discount;
	}


	@Override
	public String toString() {
		return "Stock [id=" + id + ", category=" + category + ", modelNumber=" + modelNumber + ", color=" + color
				+ ", size=" + size + ", brandName=" + brandName + ", availableQuantity=" + availableQuantity
				+ ", totalQuantity=" + totalQuantity + ", price=" + price + ", totalPrice=" + totalPrice
				+ ", vendorName=" + vendorName + ", discount=" + discount + "]";
	}

}
