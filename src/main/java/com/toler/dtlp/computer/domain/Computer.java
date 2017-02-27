package com.toler.dtlp.computer.domain;

import javax.persistence.*;

@Entity
@Table
public class Computer {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private Double price;
	
	@Column
	private String description;
	
	@Column
	private String imageUrl;

	@Column
	private Long accountId;
	
	public Computer() { }

	public Computer(Long id, String name, Double price, String description, String imageUrl, Long accountId) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.description = description;
		this.imageUrl = imageUrl;
		this.accountId = accountId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public Long getAccountId() {
		return accountId;
	}

	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
}
