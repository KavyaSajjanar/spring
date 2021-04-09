package com.xworkz.food.entity;

import com.xworkz.food.constants.FoodType;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "fooditem")
public class FoodIteamEntity {
	@Id
	@Column(name = "ID")
	private int id;

	@Column(name = "NAME")
	@NonNull
	private String name;

	@Column(name = "PRICE")
	@NonNull
	private double price;

	@Column(name = "FOODTYPE")
	@NonNull
	private FoodType foodType;

	@Column(name = "QUANTITY")
	@NonNull
	private int quantity;

	@Column(name = "DISCOUNT")
	@NonNull
	private double discount;

}
