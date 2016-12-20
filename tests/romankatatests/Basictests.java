package romankatatests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Basictests {
	public Roman rom;

	@Before
	public void setUp() throws Exception {
		rom = new Roman();

	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void should_convert_1_to_I() {

		assertEquals("I", rom.ToRoman(1));

	}

	@Test
	public void should_convert_2_to_II() throws Exception {

		assertEquals("II", rom.ToRoman(2));
	}

	@Test
	public void should_convert_3_toIII() throws Exception {

		assertEquals("III", rom.ToRoman(3));
	}

	@Test
	public void should_convert_4_to_IIII() throws Exception {

		assertEquals("IV", rom.ToRoman(4));
	}

	@Test
	public void should_convert5_toV() throws Exception {

		assertEquals("V", rom.ToRoman(5));
	}

	@Test
	public void should_convert6_to_VI() throws Exception {

		assertEquals("VI", rom.ToRoman(6));
	}

	@Test
	public void should_convert9_to_IX() throws Exception {

		assertEquals("IX", rom.ToRoman(9));
	}

	@Test
	public void should_convert10_toX() throws Exception {

		assertEquals("X", rom.ToRoman(10));
	}
	@Test
	public void shouldConvert999() throws Exception {
		assertEquals("CMXCIX", rom.ToRoman(999));
	}
	@Test
	public void shouldConvert2751() throws Exception {
		assertEquals("MMDCCLI", rom.ToRoman(2751));
	}

}
