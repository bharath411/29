package com.slokam.common.dto;

public class ProductDTO {

	private String productName;
	private String description;
	private String metaTagTitle;
	private String model;

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

	public String toString() {
		return " ProductName : " + productName + ", Description : " +description + ", MetaTagTitle :" + metaTagTitle + ", Model : " + model ;
	}
}
