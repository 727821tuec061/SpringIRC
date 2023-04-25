package com.example.Project.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.Project.Model.FlightModel;
import com.example.Project.Service.FlightService;

@RestController
public class FlightController {
	@Autowired
	public FlightService flight;
	//post the details
	@PostMapping("/flight")
	public FlightModel addDetails(@RequestBody FlightModel fr)
	{
		return flight.saveinfo(fr);
	}
	
	
	//Delete
	@DeleteMapping("/flight/{id}")
	public String deletedetails(@PathVariable int FlightNo)
	{
		flight.deletedetails(FlightNo);
		return "Deletion is Successful";
	}
	
	
	//get the details
	@GetMapping("/flight/{id} ")
	public Optional<FlightModel>getdetails(@PathVariable("FlightNo")int FlightNo)
	{
		return flight.getdetails(FlightNo);
	}
	
	
	//update the given details
	@PutMapping("/update")
	public FlightModel updatedetails(@RequestBody FlightModel FlightNo)
	{
		return flight.updatedetails(FlightNo);
	}

}
