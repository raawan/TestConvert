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
		List<ThreeDigit> threeDigitNumbers = null;
		
		if(numberToConvert>999)
		{
			threeDigitNumbers = new ArrayList<ThreeDigit>();
			StringBuilder str= new StringBuilder(Integer.toString(numberToConvert));
			int startIndex = str.length() -3;
			int endIndex = str.length();
			int power =0;
			while(endIndex>0)
			{
				if(startIndex<0)
					startIndex=0;
				addInList(threeDigitNumbers,Integer.parseInt(str.subSequence(startIndex, endIndex).toString()),power);
				endIndex = startIndex;
				startIndex = startIndex-3;
				power++;
			}
			return convertNumberedListIntoWords(threeDigitNumbers);
		}
		else
		{
			return convertUnit(numberToConvert);
		}
		
	}
	
	private String convertNumberedListIntoWords(
			List<ThreeDigit> threeDigitNumbers) 
	{
		ThreeDigit threeDigitNumber = null;
		StringBuilder  result = new StringBuilder();
		for (int i = threeDigitNumbers.size()-1;i>=0;i--)
		{
			threeDigitNumber = threeDigitNumbers.get(i);
			result.append(convertUnit(threeDigitNumber.getNumber()));
			result.append(textSeparator);
			result.append(threeDigitNumber.getUnit().getText());
			result.append(textSeparator);
		}
		return result.toString().trim();
	}

	private void addInList(List<ThreeDigit> threeDigitNumbers, int numberToAddInList, int power) 
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
