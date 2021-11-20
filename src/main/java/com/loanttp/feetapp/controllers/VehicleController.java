package com.loanttp.feetapp.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.loanttp.feetapp.models.Vehicle;
import com.loanttp.feetapp.services.EmployeeService;
import com.loanttp.feetapp.services.LocationService;
import com.loanttp.feetapp.services.VehicleMakeService;
import com.loanttp.feetapp.services.VehicleModelService;
import com.loanttp.feetapp.services.VehicleService;
import com.loanttp.feetapp.services.VehicleStatusService;
import com.loanttp.feetapp.services.VehicleTypeService;

@Controller
public class VehicleController {
	
	@GetMapping("/vehicles")
	public String getCountries() {
		return "Vehicle";
	}
}
