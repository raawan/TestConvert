package com.aimia.converter.logic;

import com.aimia.converter.constants.TensConverterConstants;

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
			case 20: return TensConverterConstants.twenty.toString();
			case 30: return TensConverterConstants.thirty.toString();
			case 40: return TensConverterConstants.forty.toString();
			case 50: return TensConverterConstants.fifty.toString();
			case 60: return TensConverterConstants.sixty.toString();
			case 70: return TensConverterConstants.seventy.toString();
			case 80: return TensConverterConstants.eighty.toString();
			case 90: return TensConverterConstants.ninety.toString();
		}
		return "";
	}
	
}
