package com.aimia.converter.logic;

import static com.aimia.converter.constants.UnitConverterConstants.*;

public class UnitsConverter implements IConverter 
{
	@Override
	public String convert(int inputUnitNumber) 
	{
		return getUnitText(inputUnitNumber);
	}
	
	private String getUnitText(int inputNumber) 
	{
		switch(inputNumber)
		{
			case 1 : return one.toString();
			case 2 : return two.toString();
			case 3 : return three.toString();
			case 4 : return four.toString();
			case 5 : return five.toString();
			case 6 : return six.toString();
			case 7 : return seven.toString();
			case 8 : return eight.toString();
			case 9 : return nine.toString();
			case 10 : return ten.toString();
			case 11 : return eleven.toString();
			case 12 : return twelve.toString();
			case 13 : return thirteen.toString();
			case 14 : return fourteen.toString();
			case 15 : return fifteen.toString();
			case 16 : return sixteen.toString();
			case 17 : return seventeen.toString();
			case 18 : return eighteen.toString();
			case 19 : return nineteen.toString();
		}
		return "";
	}
}
