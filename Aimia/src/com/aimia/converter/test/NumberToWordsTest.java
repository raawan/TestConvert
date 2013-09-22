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
	
	//givenResourceDoesNotExist_whenResourceIsRetrieved_thenNoResourceIsReceived()
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
}
