package com.xworkz.food;

import com.xworkz.food.constants.FoodType;
import com.xworkz.food.entity.FoodIteamEntity;
import com.xworkz.food.repository.FoodIteamRepository;
import com.xworkz.food.repository.FoodIteamRepositoryImpl;
import com.xworkz.food.service.FoodIteamService;
import com.xworkz.food.service.FoodIteamServiceImpl;

public class FoodIteamTester {

	public static void main(String[] args) {
	FoodIteamEntity entity=new FoodIteamEntity();
	entity.setId(1);
	entity.setDiscount(20);
	entity.setName("gobi");
	entity.setFoodType(FoodType.CHINES);
	entity.setPrice(100);
	entity.setQuantity(1);
		FoodIteamRepository foodIteamRepository=new FoodIteamRepositoryImpl();
		FoodIteamService foodItemService=new FoodIteamServiceImpl(foodIteamRepository);
		foodItemService.validateAndSave(entity);

	}

	}


