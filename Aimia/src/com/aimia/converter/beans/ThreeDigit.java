package com.aimia.converter.beans;

public class ThreeDigit 
{
	private Integer number;
	private Unit	unit;
	
	public ThreeDigit(Integer number, Unit unit)
	{
		this.number = number;
		this.unit = unit;
	}
	
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Unit getUnit() {
		return unit;
	}
	public void setUnit(Unit unit) {
		this.unit = unit;
	}
	
}
