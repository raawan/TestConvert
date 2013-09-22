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
					.append(convertUnit(lastThreeDigits));
		}
		return finalText.toString();
	}
	
	private String convertUnit(int inputNumber) 
	{
		IConverter converter = null;
		if(inputNumber<20)
		{
			converter = new UnitConverter();
		}
		else if(inputNumber >20 && inputNumber < 100)
		{
			converter = new TensConverter();
		}
		else if(inputNumber>=100 && inputNumber < 1000)
		{
			converter = new HundredsConverter();
		}
		return converter.convert(inputNumber);
	}

}
