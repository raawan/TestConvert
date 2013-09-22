package com.aimia.converter.main;

public class MainConverter implements IConverter 
{
	private static String thousandsText = "thousand";
	
	@Override
	public String convert(int numberToConvert) 
	{
		int  lastThreeDigits = numberToConvert%1000;
		int  thousandthDigit = numberToConvert/1000;
		
		StringBuilder finalText = new StringBuilder();
		
		finalText.append(new UnitConverter().convert(thousandthDigit))
		.append(textSeparator)
		.append(thousandsText);
		
		if(lastThreeDigits!=0)
		{
			finalText.append(textSeparator)
					.append(new HundredsConverter().convert(lastThreeDigits));
		}
		return finalText.toString();
	}

}
