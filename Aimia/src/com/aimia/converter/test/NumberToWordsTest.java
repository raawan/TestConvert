package com.aimia.converter.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.aimia.converter.main.INumberToWords;
import com.aimia.converter.main.NumberToWords;

public class NumberToWordsTest 
{
	private INumberToWords numberToWords;
	
	@Before
	public void setUp() throws Exception 
	{
		numberToWords = new NumberToWords();
	}

	@After
	public void tearDown() throws Exception 
	{
	}
	
	@Test
	public void testConvert_onInputOne_getOutputOne() 
	{
		assertEquals("one", numberToWords.convert("1"));
	}
	
	@Test
	public void testConvert_onInputTwo_getOutputTwo() 
	{
		assertEquals("two", numberToWords.convert("2"));
	}
	
	@Test
	public void testConvert_onInputAnyNumberBet1to19_getOutputInWord() 
	{
		assertEquals("sixteen", numberToWords.convert("16"));
		assertEquals("nine", numberToWords.convert("9"));
	}
	
	@Test
	public void testConvert1_onInputAny2DigitNUmber_getOutputInWord() 
	{
		assertEquals("forty seven", numberToWords.convert("47"));
	}
	
	@Test
	public void testConvert2_onInputAny2DigitNUmber_getOutputInWord() 
	{
		assertEquals("ninety nine", numberToWords.convert("99"));
	}
	
	@Test
	public void testConvert3_onInputAny2DigitNUmber_getOutputInWord() 
	{
		assertEquals("twenty one", numberToWords.convert("21"));
	}
	
	@Test
	public void testConvert1_onInputAny3DigitNUmber_getOutputInWord() 
	{
		assertEquals("one hundred and twenty one", numberToWords.convert("121"));
	}
	
	@Test
	public void testConvert2_onInputAny3DigitNUmber_getOutputInWord() 
	{
		assertEquals("one hundred and seven", numberToWords.convert("107"));
	}
	
	@Test
	public void testConvert3_onInputAny3DigitNUmber_getOutputInWord() 
	{
		assertEquals("nine hundred and ninety nine", numberToWords.convert("999"));
	}
	
	@Test
	public void testConvert4_boundary_onInputAny3DigitNUmber_getOutputInWord() 
	{
		assertEquals("one hundred", numberToWords.convert("100"));
	}
	
	@Test
	public void testConvert1_onInputAny4DigitNUmber_getOutputInWord() 
	{
		assertEquals("one thousand one hundred and twelve", numberToWords.convert("1112"));
	}
	
	@Test
	public void testConvert2_onInputAny4DigitNUmber_getOutputInWord() 
	{
		assertEquals("one thousand", numberToWords.convert("1000"));
	}
	
	@Test
	public void testConvert3_onInputAny4DigitNUmber_getOutputInWord() 
	{
		assertEquals("one thousand one", numberToWords.convert("1001"));
	}
	

	@Test
	public void testConvert4_onInputAny4DigitNUmber_getOutputInWord() 
	{
		assertEquals("one thousand twenty three", numberToWords.convert("1023"));
	}
	
	@Test
	public void testConvert5_onInputAny4DigitNUmber_getOutputInWord() 
	{
		assertEquals("nine thousand nine hundred and ninety nine", numberToWords.convert("9999"));
	}
	
	@Test
	public void testConvert1_onInputAny5DigitNUmber_getOutputInWord() 
	{
		assertEquals("ninety nine thousand nine hundred and ninety nine", numberToWords.convert("99999"));
	}
	
	@Test
	public void testConvert2_onInputAny5DigitNUmber_getOutputInWord() 
	{
		assertEquals("ninety nine thousand ninety nine", numberToWords.convert("99099"));
	}
	
	@Test
	public void testConvert3_onInputAny5DigitNUmber_getOutputInWord() 
	{
		assertEquals("ninety nine thousand nine", numberToWords.convert("99009"));
	}
	
	@Test
	public void testConvert4_onInputAny5DigitNUmber_getOutputInWord() 
	{
		assertEquals("ninety thousand nine", numberToWords.convert("90009"));
	}
	
	@Test
	public void testConvert5_onInputAny5DigitNUmber_getOutputInWord() 
	{
		assertEquals("ninety thousand", numberToWords.convert("90000"));
	}
	
	
	@Test
	public void testConvert1_onInputAnyDigitNUmber_getOutputInWord() 
	{
		assertEquals("fifty six million nine hundred and forty five thousand seven hundred and eighty one", 
				numberToWords.convert("56945781"));
	}
	
	@Test
	public void testConvert2_onInputAnyDigitNUmber_getOutputInWord() 
	{
		assertEquals("one hundred and five", 
				numberToWords.convert("105"));
	}
	
}
