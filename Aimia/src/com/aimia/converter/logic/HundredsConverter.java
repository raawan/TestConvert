package com.aimia.converter.logic;

import static com.aimia.converter.constants.HundredsConverterConstants.*;

public class HundredsConverter implements IConverter 
{
	@Override
	public String convert(int numberToConvert) 
	{
		int  lastTwoDigits = numberToConvert%100;
		int  hundredthDigit = numberToConvert/100;
		
		StringBuilder finalText = new StringBuilder();
		
		finalText.append(new UnitsConverter().convert(hundredthDigit))
		.append(textSeparator)
		.append(hundred.toString());
		
		if(lastTwoDigits!=0)
		{
			finalText.append(textSeparator)
					.append(and.toString())
					.append(textSeparator)
					.append(new TensConverter().convert(lastTwoDigits));
		}
		return finalText.toString().trim();
	}

}
