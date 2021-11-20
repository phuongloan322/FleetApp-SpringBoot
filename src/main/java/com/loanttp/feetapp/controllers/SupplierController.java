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

import com.loanttp.feetapp.models.Supplier;
import com.loanttp.feetapp.services.CountryService;
import com.loanttp.feetapp.services.StateService;
import com.loanttp.feetapp.services.SupplierService;

@Controller
public class SupplierController {
	
	@GetMapping("/suppliers")
	public String getCountries() {
		return "supplier";
	}
}
