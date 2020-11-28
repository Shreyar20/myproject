package com.cognizant.menu.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@AllArgsConstructor
@ToString
@Entity
@Table(name="laundryservice")
@EntityListeners(AuditingEntityListener.class)
public class LaundryModel{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="serviceid")
	private long serviceId;
	
	@Column(name="productname")
	private String productName;
	@Column(name="servicetype")
	private String serviceType;
	@Column(name="price")
	private int price;
}
