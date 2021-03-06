package com.mum.edu.jemaw.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="person_id")
public class Customer extends Person implements Serializable {

	@OneToOne(cascade=CascadeType.ALL)
	private ShoppingCart shoppingCart;
	@OneToMany(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
	@JoinColumn(name="customer_id")
	private List<PaymentInfo> paymentDetails;
	@OneToMany
	@JoinColumn(name="customer_id")
	private List<Order> orders;
	
	public Customer() {
		paymentDetails = new ArrayList<PaymentInfo>();
		this.shoppingCart = new ShoppingCart();
	}

	public ShoppingCart getShoppingCart() {
		return shoppingCart;
	}

	public void setShoppingCart(ShoppingCart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	public List<PaymentInfo> getPaymentDetails() {
		return paymentDetails;
	}

	public void setPaymentDetails(List<PaymentInfo> paymentDetails) {
		this.paymentDetails = paymentDetails;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	
}
