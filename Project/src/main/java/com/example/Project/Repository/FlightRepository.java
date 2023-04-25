package com.example.Project.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Project.Model.FlightModel;

@Repository
public interface FlightRepository extends JpaRepository<FlightModel, Integer>{

}
