package com.javaone.hol2017.junit5;

import com.javaone.hol2017.junit5.Earthquake.ShakeException;
import org.junit.jupiter.api.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class EarthquakeTest {
	private Earthquake earthquake;

	@BeforeEach
	public void setUp() {
		earthquake = new Earthquake();
	}

	@Test
	public void usingStandalone() {
		ShakeException actual = assertThrows(ShakeException.class, () -> earthquake.shake(true));
		assertThat(actual.getMessage(), containsString("Wait for the aftershock"));
	}

}
