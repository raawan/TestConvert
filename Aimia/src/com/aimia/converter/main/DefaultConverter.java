package com.aimia.converter.main;

public class DefaultConverter implements IConverter 
{
	@Override
	public String convert(int inputNumber) 
	{
		IConverter converter = null;
		if(inputNumber<20)
		{
			converter = new UnitConverter();
		}
		else
		{
			converter = new TensConverter();
		}
		return converter.convert(inputNumber);
	}

}
