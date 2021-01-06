package com.devsuperior.dsdslivery.dto;

import java.io.Serializable;

import com.devsuperior.dsdslivery.entities.Product;

public class ProductDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private Double price;
	private String name;
	private String description;
	private String imageUri;
	
	public ProductDTO() {
	}

	public ProductDTO(Long id, Double price, String name, String description, String imageUri) {
		this.id = id;
		this.price = price;
		this.name = name;
		this.description = description;
		this.imageUri = imageUri;
	}
	
	public ProductDTO(Product entity) {
		id = entity.getId();
		price = entity.getPrice();
		name = entity.getName();
		description = entity.getDescription();
		imageUri = entity.getImageUri();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}
	
	
	
}
