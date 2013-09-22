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
}
