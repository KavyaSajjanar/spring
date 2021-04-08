package com.xworkz.food.repository;

import com.xworkz.food.entity.FoodIteamEntity;

public class FoodIteamRepositoryImpl implements FoodIteamRepository{

	@Override
	public void save(FoodIteamEntity entity) {
		System.out.println("invoked save"+entity);
		
		

		
	}

}
