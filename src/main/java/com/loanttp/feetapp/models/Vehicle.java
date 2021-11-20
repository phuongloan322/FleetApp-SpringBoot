package com.loanttp.feetapp.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")

public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	private String name;
	
	@ManyToOne
	@JoinColumn(name="vehicletypeid", insertable = false, updatable = false)
	private VehicleType vehicleType;
	private int vehicletypeid;
	
	private String vehicleNumber;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date registrationDate;
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date acquisitionDate;
	private String description;
	
	@ManyToOne
	@JoinColumn(name="vehiclemakeid", insertable = false, updatable = false)
	private VehicleMake vehicleMake;
	private int vehiclemakeid;
	
	private String power;
	private String purlCapacity;
	
	@ManyToOne
	@JoinColumn(name="vehiclestatusid", insertable = false, updatable = false)
	private VehicleStatus vehicleStatus;
	private int vehiclestatusid;
	
	private String netWeight;
	
	@ManyToOne
	@JoinColumn(name="employeeid", insertable = false, updatable = false)
	private Employee employee;
	private int employeeid;
	
	@ManyToOne
	@JoinColumn(name="vehiclemodelid", insertable = false, updatable = false)
	private VehicleModel vehicleModel;
	private int vehiclemodelid;
	
	@ManyToOne
	@JoinColumn(name="locationid", insertable = false, updatable = false)
	private Location location;
	private int locationid;
	
	private String remarks;
}
