package com.aimia.converter.main;

public class NumberToWords implements INumberToWords 
{
	@Override
	public String convert(String number) 
	{
		if(number.equals("1"))
			return "one";
		else if (number.equals("2"))
			return "two";
		return "";
	}
}
