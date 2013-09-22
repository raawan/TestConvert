package com.aimia.converter.logic;

import com.aimia.converter.constants.UnitConverterConstants;

public class UnitConverter implements IConverter 
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
			case 1 : return UnitConverterConstants.one.toString();
			case 2 : return UnitConverterConstants.two.toString();
			case 3 : return UnitConverterConstants.three.toString();
			case 4 : return UnitConverterConstants.four.toString();
			case 5 : return UnitConverterConstants.five.toString();
			case 6 : return UnitConverterConstants.six.toString();
			case 7 : return UnitConverterConstants.seven.toString();
			case 8 : return UnitConverterConstants.eight.toString();
			case 9 : return UnitConverterConstants.nine.toString();
			case 10 : return UnitConverterConstants.ten.toString();
			case 11 : return UnitConverterConstants.eleven.toString();
			case 12 : return UnitConverterConstants.twelve.toString();
			case 13 : return UnitConverterConstants.thirteen.toString();
			case 14 : return UnitConverterConstants.fourteen.toString();
			case 15 : return UnitConverterConstants.fifteen.toString();
			case 16 : return UnitConverterConstants.sixteen.toString();
			case 17 : return UnitConverterConstants.seventeen.toString();
			case 18 : return UnitConverterConstants.eighteen.toString();
			case 19 : return UnitConverterConstants.nineteen.toString();
		}
		return "";
	}
}
