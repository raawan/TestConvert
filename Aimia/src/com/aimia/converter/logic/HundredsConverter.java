package com.aimia.converter.logic;

import com.aimia.converter.constants.HundredsConverterConstants;

public class HundredsConverter implements IConverter 
{
	@Override
	public String convert(int numberToConvert) 
	{
		int  lastTwoDigits = numberToConvert%100;
		int  hundredthDigit = numberToConvert/100;
		
		StringBuilder finalText = new StringBuilder();
		
		finalText.append(new UnitConverter().convert(hundredthDigit))
		.append(textSeparator)
		.append(HundredsConverterConstants.hundred.toString());
		
		if(lastTwoDigits!=0)
		{
			finalText.append(textSeparator)
					.append(HundredsConverterConstants.and.toString())
					.append(textSeparator)
					.append(new TensConverter().convert(lastTwoDigits));
		}
		return finalText.toString().trim();
	}

}
