package com.example.day3.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.day3.Model.CarModel;
import com.example.day3.repository.CarRepo;

@Service
public class CarService {
	@Autowired
	public CarRepo crepo;
	public CarModel saveinfo(CarModel c) 
	{
		//TODO Auto-generated method stub
		return crepo.save(c);
	}
	public void deletedetails(int id) {
		//TODO Auto-generated method stub
		crepo.deleteById(id);
	}
	public Optional<CarModel>getdetails(int id){
		//TODO Auto-generated method stub
		return crepo.findById(id);
		
	}
	public CarModel updatedetails(CarModel id) {
		//TODO Auto-generated method stub
		return crepo.saveAndFlush(id);
	}

}
