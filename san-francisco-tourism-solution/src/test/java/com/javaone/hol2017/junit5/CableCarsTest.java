package com.javaone.hol2017.junit5;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CableCarsTest {
	
	@Test
	public void numberLines() {
		int actual = CableCars.getNumberLines();
		assertEquals(3, actual);
	}

	@Test
	public void namesOfLines() {

		assertAll("lines",
				() -> assertTrue(CableCars.isLine("California"), "California"),
				() -> assertTrue(CableCars.isLine("Powell-Hyde"), "Powell-Hyde"),
				() -> assertTrue(CableCars.isLine("Powell-Mason"), "Powell-Mason"),
				() -> assertFalse(CableCars.isLine("San Francisco"), "San Francisco")

		);
	}

}
