package com.cognizant.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "customer")

public class BookingModel {
	@Id
	@Column(name = "bookingid")
	private int bookingId;
	@Column(name="userid")
	private int userId;
	@Column(name="serviceid")
	private int serviceId;
	@Column(name="productname")
	private String productName;
	@Column(name="servicetype")
	private String serviceType;
	@Column(name="quantity")
	private int quantity;
	@Column(name="totalprice")
	private double totalPrice;

	
	
	
	
}
