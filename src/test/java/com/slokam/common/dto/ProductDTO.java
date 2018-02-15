package com.slokam.common.dto;

public class ProductDTO {

	private String productName;
	private String description;
	private String metaTagTitle;
	private String productTags;
	private String model;
	private String price;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getProductTags() {
		return productTags;
	}

	public void setProductTags(String productTags) {
		this.productTags = productTags;
	}

	public String getMetaTagTitle() {
		return metaTagTitle;
	}

	public void setMetaTagTitle(String metaTagTitle) {
		this.metaTagTitle = metaTagTitle;
	}
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	public String getPrice() {
		
		return price;
	}
	public void setPrice(String price) {
		
		this.price = price;
	}

	public String toString() {
		return " ProductName : " + productName + ", Description : " +description + ", MetaTagTitle :" + metaTagTitle + ", Model : " + model+",ProductTags:"+productTags+",Price:"+price ;
	}

	
}
