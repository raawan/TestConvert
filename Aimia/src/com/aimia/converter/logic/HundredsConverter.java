package com.aimia.converter.logic;

public class HundredsConverter implements IConverter 
{
	private static String hundredsText = "hundred";
	
	@Override
	public String convert(int numberToConvert) 
	{
		int  lastTwoDigits = numberToConvert%100;
		int  hundredthDigit = numberToConvert/100;
		
		StringBuilder finalText = new StringBuilder();
		
		finalText.append(new UnitConverter().convert(hundredthDigit))
		.append(textSeparator)
		.append(hundredsText);
		
		if(lastTwoDigits!=0)
		{
			finalText.append(textSeparator)
					.append(hundredsSeparator)
					.append(textSeparator)
					.append(new TensConverter().convert(lastTwoDigits));
		}
		return finalText.toString().trim();
	}

}
