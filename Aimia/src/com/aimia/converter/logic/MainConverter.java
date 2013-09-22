package com.aimia.converter.logic;

import java.util.List;
import java.util.ArrayList;

import com.aimia.converter.beans.ThreeDigit;
import com.aimia.converter.beans.Unit;

public class MainConverter implements IConverter 
{
	@Override
	public String convert(int numberToConvert) 
	{
		assert(numberToConvert<1);
		String result = (numberToConvert>999)?
							formatHighOrderNumber(numberToConvert):
									formatLowOrderNumber(numberToConvert);
		return result;
	}
	
	private String formatLowOrderNumber(int inputNumber) 
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
	
	private String formatHighOrderNumber(int numberToConvert) 
	{
		List<ThreeDigit> threeDigitNumbers = new ArrayList<ThreeDigit>();
		StringBuilder stringRepresentation= new StringBuilder(Integer.toString(numberToConvert));
		int startIndex = stringRepresentation.length() -3;
		int endIndex = stringRepresentation.length();
		int power =0;
		while(endIndex>0)
		{
			if(startIndex<0)
			{
				startIndex=0;
			}
			createListOfThreeDigits(threeDigitNumbers,
									Integer.parseInt(stringRepresentation.subSequence(startIndex, endIndex).toString()),
									power);
			endIndex = startIndex;
			startIndex = startIndex-3;
			power++;
		}
		return formatThreeDigitNumbersList(threeDigitNumbers);
	}
	
	private String formatThreeDigitNumbersList(
			List<ThreeDigit> threeDigitNumbers) 
	{
		ThreeDigit threeDigitNumber = null;
		StringBuilder  result = new StringBuilder();
		for (int i = threeDigitNumbers.size()-1;i>=0;i--)
		{
			threeDigitNumber = threeDigitNumbers.get(i);
			result.append(formatLowOrderNumber(threeDigitNumber.getNumber()));
			result.append(textSeparator);
			result.append(threeDigitNumber.getUnit().getText());
			result.append(textSeparator);
		}
		return result.toString().trim();
	}

	private void createListOfThreeDigits(List<ThreeDigit> threeDigitNumbers, int numberToAddInList, int power) 
	{
		 ThreeDigit threeDigitNumber = 
				 	new ThreeDigit(numberToAddInList,getUnit(power));
		 threeDigitNumbers.add(threeDigitNumber);
	}
	
	private Unit getUnit(int power)
	{
		switch(power)
		{
			case 0 : return Unit.DEFAULT;
			case 1: return Unit.THOUSAND;
			case 2: return Unit.MILLION;
		}
		return Unit.DEFAULT;
	}
	

}
