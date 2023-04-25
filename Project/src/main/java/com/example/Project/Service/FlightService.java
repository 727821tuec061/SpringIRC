package com.example.Project.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Project.Model.FlightModel;
import com.example.Project.Repository.FlightRepository;

@Service
public class FlightService {
	@Autowired
	public FlightRepository frepo;
	public FlightModel saveinfo(FlightModel fr)
	{
		//TODO Auto-generated method stub
		return frepo.save(fr);
	}
	public void deletedetails(int FlightNo) {
		//TODO Auto-generated method stub
		frepo.deleteById(FlightNo);
	}
	public Optional<FlightModel>getdetails(int FlightNo){
		//TODO Auto-generated method stub
		return frepo.findById(FlightNo);
	}
	public FlightModel updatedetails(FlightModel FlightNo) {
		//TODO Auto-generated method stub
		return frepo.saveAndFlush(FlightNo);
		
	}
	

}
