package com.aimia.converter.main;

public enum Unit 
{
	THOUSAND("thousand",1),MILLION("million",2),DEFAULT("",0);
	private String text;
	private int power;//total zeroes
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

	Unit(String text,int power)
	{
		this.text=text;
		this.power = power;
	}
	
	
}
