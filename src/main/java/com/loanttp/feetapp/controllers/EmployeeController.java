package com.loanttp.feetapp.controllers;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.Principal;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.loanttp.feetapp.models.Employee;
import com.loanttp.feetapp.services.CountryService;
import com.loanttp.feetapp.services.EmployeeService;
import com.loanttp.feetapp.services.EmployeeTypeService;
import com.loanttp.feetapp.services.JobTitleService;
import com.loanttp.feetapp.services.StateService;

@Controller
public class EmployeeController {
	
	@GetMapping("/employees")
	public String getCountries() {
		return "employee";
	}
}
