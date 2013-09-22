package com.aimia.converter.constants;

public enum ScaleUnit 
{
	THOUSAND("thousand",1),MILLION("million",2),DEFAULT("",0);
	private String text;
	private int power;
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	ScaleUnit(String text,int power)
	{
		this.text=text;
		this.power = power;
	}
	
	
}
