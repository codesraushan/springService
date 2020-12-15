package com.springrest.springrest.Nutrients;
import java.lang.String;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Nutrients{
   
	public int nutrientId;
    public String nutrientName;
    public String nutrientNumber;
    public String unitName;
    public double value;
    public String derivationCode;
    public String derivationDescription;
    
    public Nutrients(int nutrientId, String nutrientName, String nutrientNumber, String unitName, double value, String derivationCode, String derivationDescription) {
    	super();
    	this.nutrientId = nutrientId;
    	this.nutrientName = nutrientName;
    	this.nutrientNumber = nutrientNumber;
    	this.unitName = unitName;
    	this.value = value;
    	this.derivationCode = derivationCode;
    	this.derivationDescription = derivationDescription;
    	// TODO Auto-generated constructor stub
    }
    
    public int getNutrientId() {
		return nutrientId;
	}

	public void setNutrientId(int nutrientId) {
		this.nutrientId = nutrientId;
	}

	public String getNutrientName() {
		return nutrientName;
	}

	public void setNutrientName(String nutrientName) {
		this.nutrientName = nutrientName;
	}

	public String getNutrientNumber() {
		return nutrientNumber;
	}

	public void setNutrientNumber(String nutrientNumber) {
		this.nutrientNumber = nutrientNumber;
	}

	public String getUnitName() {
		return unitName;
	}

	public void setUnitName(String unitName) {
		this.unitName = unitName;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getDerivationCode() {
		return derivationCode;
	}

	public void setDerivationCode(String derivationCode) {
		this.derivationCode = derivationCode;
	}

	public String getDerivationDescription() {
		return derivationDescription;
	}

	public void setDerivationDescription(String derivationDescription) {
		this.derivationDescription = derivationDescription;
	}
	

}

