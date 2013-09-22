package com.aimia.converter.main;

public class TensConverter implements IConverter
{
			
	@Override
	public String convert(int numberToConvert) 
	{
		int  units = numberToConvert % 10;
		int  tens  = numberToConvert - units;
		return geTTensText(tens)+ IConverter.textSeparator + new UnitConverter().convert(units);
	}
	
	private String geTTensText(int tens) 
	{
		switch(tens)
		{
			case 20: return "twenty";
			case 30: return "thirty";
			case 40: return "forty";
			case 50: return "fifty";
			case 60: return "sixty";
			case 70: return "seventy";
			case 80: return "eighty";
			case 90: return "ninty";
		}
		return "";
	}
	
}