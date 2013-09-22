package com.aimia.converter.main;

public class NumberToWords implements INumberToWords 
{
	@Override
	public String convert(String number) 
	{
		StringBuilder text = new StringBuilder();
		int inputNumber = Integer.valueOf(number, 10);
		if(inputNumber<20)
		{
			return getUnitText(inputNumber);
		}
		else
		{
			return getTextForTwoDigitNumbers(inputNumber);
		}
	}

	private String getTextForTwoDigitNumbers(int inputNumber) 
	{
		int  units = inputNumber % 10;
		int  tens  = inputNumber - units;
		return geTTensText(tens)+ " " + getUnitText(units);
	}

	private String geTTensText(int tens) 
	{
		switch(tens)
		{
			case 20: return "twenty";
			case 30: return "thirty";
			case 40: return "forty";
			case 50: return "fifty";
			case 60: return "sixty";
			case 70: return "seventy";
			case 80: return "eighty";
			case 90: return "ninty";
		}
		return "";
	}

	private String getUnitText(int inputNumber) 
	{
		switch(inputNumber)
		{
			case 1 : return "one";
			case 2 : return "two";
			case 3 : return "three";
			case 4 : return "four";
			case 5 : return "five";
			case 6 : return "six";
			case 7 : return "seven";
			case 8 : return "eight";
			case 9 : return "nine";
			case 10 : return "ten";
			case 11 : return "eleven";
			case 12 : return "twelve";
			case 13 : return "thirteen";
			case 14 : return "fourteen";
			case 15 : return "fifteen";
			case 16 : return "sixteen";
			case 17 : return "seventeen";
			case 18 : return "eighteen";
			case 19 : return "nineteen";
		}
		return "";
	}
}
