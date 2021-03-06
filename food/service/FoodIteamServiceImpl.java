package com.xworkz.food.service;

import com.xworkz.food.entity.FoodIteamEntity;
import com.xworkz.food.repository.FoodIteamRepository;

public class FoodIteamServiceImpl implements FoodIteamService{
private FoodIteamRepository itemRepository;
	
	public FoodIteamServiceImpl(FoodIteamRepository iteamRepository) {
		System.out.println("created"+this.getClass().getSimpleName());
		this.itemRepository=iteamRepository;
		
	}
	@Override
	public boolean validateAndSave(FoodIteamEntity entity) {
		
		System.out.println("invoked validateAndSave"+entity);
		if(entity!=null) {
			System.out.println("entity is valid");
			itemRepository.save(entity);
		}else {
			System.out.println("entity is invalid");
		}
		return false;
	}

	}

