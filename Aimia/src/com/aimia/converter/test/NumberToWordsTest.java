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
	public void testConvert_onInputAny2DigitNUmber_getOutputInWord() 
	{
		assertEquals("47", numberToWords.convert("forty seven"));
	}
}
