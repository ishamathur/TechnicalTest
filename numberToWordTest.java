package conversiontest;

import org.junit.Test;

import conversion.numberToWord;

import static org.junit.Assert.*;



public class numberToWordTest {
	
	@Test
	public void numToWordTest()
	{
		assertEquals("zero", numberToWord.numToWord(0));
		assertEquals("one", numberToWord.numToWord(1));
		assertEquals("twenty five", numberToWord.numToWord(25));
		assertEquals("one hundred ", numberToWord.numToWord(100));
		assertEquals("one hundred five", numberToWord.numToWord(105));
		assertEquals("fifty six million nine hundred forty five thousand seven hundred eighty one", numberToWord.numToWord(56945781));
		assertEquals("Please enter number within the range of 999999999", numberToWord.numToWord(9999999999L));
		assertEquals("minus one hundred five", numberToWord.numToWord(-105));
	}

}
