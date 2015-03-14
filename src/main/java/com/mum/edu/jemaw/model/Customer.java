package com.mum.edu.jemaw.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.validation.Valid;
@Entity
public class Customer extends Person implements Serializable {
private ShoppingCart shoppingCart;
@Valid
private PaymentInfo paymentInfo;
public ShoppingCart getShoppingCart() {
	return shoppingCart;
}
public void setShoppingCart(ShoppingCart shoppingCart) {
	this.shoppingCart = shoppingCart;
}
public PaymentInfo getPaymentInfo() {
	return paymentInfo;
}
public void setPaymentInfo(PaymentInfo paymentInfo) {
	this.paymentInfo = paymentInfo;
}



}
