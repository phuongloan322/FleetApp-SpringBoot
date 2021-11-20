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

import com.loanttp.feetapp.models.VehicleHire;
import com.loanttp.feetapp.services.ClientService;
import com.loanttp.feetapp.services.LocationService;
import com.loanttp.feetapp.services.VehicleHireService;
import com.loanttp.feetapp.services.VehicleService;

@Controller
public class VehicleHireController {
	
	@GetMapping("/vehiclehires")
	public String getCountries() {
		return "VehicleHire";
	}
}
