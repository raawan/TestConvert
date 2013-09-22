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
		else if(inputNumber >20 && inputNumber < 100)
		{
			converter = new TensConverter();
		}
		else if(inputNumber>=100 && inputNumber < 1000)
		{
			converter = new HundredsConverter();
		}
		else
		{
			converter = new MainConverter();
		}
		return converter.convert(inputNumber);
	}

}
