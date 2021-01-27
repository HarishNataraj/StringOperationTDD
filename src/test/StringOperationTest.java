package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.StringOperation;

public class StringOperationTest {
	

	StringOperation stringOperation = new StringOperation();
	
	@Test
	public void forEmptyString() {
		assertEquals("",stringOperation.convertToDigits(""));
	}
	
	@Test
	public void forSingleDigit() {
		assertEquals("1",stringOperation.convertToDigits("1"));
	}
	
	@Test
	public void forDoubleDigits() {
		assertEquals("1,0",stringOperation.convertToDigits("10"));
	}
	
	@Test
	public void forMultipleDigits() {
		assertEquals("1,0,0",stringOperation.convertToDigits("100"));
	}
	
	@Test
	public void forSequenceOfNumbers() {
		assertEquals("1,0,2,0",stringOperation.convertToDigits("10,20"));
	}
	
	@Test
	public void fortest() {
		assertEquals("1,0,2,0,3,0",stringOperation.convertToDigits("?10,20,30..."));
	}
	

}
