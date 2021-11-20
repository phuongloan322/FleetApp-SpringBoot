package com.loanttp.feetapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.loanttp.feetapp.models.Country;
import com.loanttp.feetapp.models.State;
import com.loanttp.feetapp.services.CountryService;
import com.loanttp.feetapp.services.StateService;

@Controller
public class StateController {
	
	@Autowired
	private StateService stateService;
	
	@Autowired
	private CountryService countryService;
	
	//Get all state
	@GetMapping("/states")
	public String getStates(Model model) {
		List<State> stateList = stateService.getStates();
		model.addAttribute("states", stateList);
		
		List<Country> countryList = countryService.getCountries();
		model.addAttribute("countries", countryList);
		
		return "State";
	}
	
	@PostMapping("/states/addNew")
	public String addState(State state) {
		stateService.save(state);
		return "redirect:/states";
	}
	
	@RequestMapping("states/findById")
	@ResponseBody
	public Optional<State> findById(int id) {
		return stateService.findById(id);
	}
	
	@RequestMapping(value="/states/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String updateState(State state) {
		stateService.save(state);
		return "redirect:/states";
	}
	
	@RequestMapping(value="/states/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String deleteState(int id) {
		stateService.delete(id);
		return "redirect:/states";
	}
	
}
