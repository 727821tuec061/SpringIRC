package com.example.Project.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
public class FlightModel {
	
	@Id
	private int id;
	private String PassangerName;
	private String Dob;
	private String Email;
	private String Address;
	private String From;
	private String To;
	private String DepartureDate;
	private String ArrivalDate;
	private String SeatClass;
	private int ContactNumber;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassangerName() {
		return PassangerName;
	}
	public void setPassangerName(String passangerName) {
		PassangerName = passangerName;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getFrom() {
		return From;
	}
	public void setFrom(String from) {
		From = from;
	}
	public String getTo() {
		return To;
	}
	public void setTo(String to) {
		To = to;
	}
	public String getDepartureDate() {
		return DepartureDate;
	}
	public void setDepartureDate(String departureDate) {
		DepartureDate = departureDate;
	}
	public String getArrivalDate() {
		return ArrivalDate;
	}
	public void setArrivalDate(String arrivalDate) {
		ArrivalDate = arrivalDate;
	}
	public String getSeatClass() {
		return SeatClass;
	}
	public void setSeatClass(String seatClass) {
		SeatClass = seatClass;
	}
	public int getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(int contactNumber) {
		ContactNumber = contactNumber;
	}
	
	
	
	
	
	
	

}
