package com.cognizant.FinalCheck_AbstractFactory;


public abstract class Order {

	private ProductType product =null;
	private Channel channel = null;
	
	abstract void processOrder();


	
	public Order(ProductType product, Channel channel) {
		super();
		this.product = product;
		this.channel = channel;
	}

	public ProductType getProduct() {
		return product;
	}

	public void setProduct(ProductType product) {
		this.product = product;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}
	
	
	
	
	
}
