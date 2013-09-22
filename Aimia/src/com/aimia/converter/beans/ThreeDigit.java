package com.aimia.converter.beans;

import com.aimia.converter.constants.ScaleUnit;

public class ThreeDigit 
{
	private Integer number;
	private ScaleUnit	scaleUnit;
	
	public ThreeDigit(Integer number, ScaleUnit scaleUnit)
	{
		this.number = number;
		this.scaleUnit = scaleUnit;
	}
	
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public ScaleUnit getUnit() {
		return scaleUnit;
	}
	public void setUnit(ScaleUnit scaleUnit) {
		this.scaleUnit = scaleUnit;
	}
	
}
