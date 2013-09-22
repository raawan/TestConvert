package com.aimia.converter.logic;

import static com.aimia.converter.constants.TensConverterConstants.*;

public class TensConverter implements IConverter
{
			
	@Override
	public String convert(int numberToConvert) 
	{
		if(numberToConvert<20)
		{
			return new UnitsConverter().convert(numberToConvert);
		}
		
		int  units = numberToConvert % 10;
		int  tens  = numberToConvert - units;
		StringBuilder finalText = new StringBuilder();
		
		if(tens!=0)
		{
			finalText.append(geTTensText(tens)).append(IConverter.textSeparator);
		}
		finalText.append(new UnitsConverter().convert(units));
		return finalText.toString().trim();
	}
	
	private String geTTensText(int tens) 
	{
		switch(tens)
		{
			case 20: return twenty.toString();
			case 30: return thirty.toString();
			case 40: return forty.toString();
			case 50: return fifty.toString();
			case 60: return sixty.toString();
			case 70: return seventy.toString();
			case 80: return eighty.toString();
			case 90: return ninety.toString();
		}
		return "";
	}
	
}
