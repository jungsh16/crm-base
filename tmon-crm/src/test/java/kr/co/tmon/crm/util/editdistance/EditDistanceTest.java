package kr.co.tmon.crm.util.editdistance;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EditDistanceTest {

	@Test
	public void testGetDistance() throws Exception {
		assertEquals(3, EditDistance.getDistance("sitting", "kitten"));
		assertEquals(3, EditDistance.getDistance("kitten", "sitting"));

		assertEquals(3, EditDistance.getDistance("Sunday", "Saturday"));

		assertEquals(3, EditDistance.getDistance("승현sitting", "승현kitten"));

		assertEquals(3, EditDistance.getDistance("ABCDEFG", "AEFG"));

		assertEquals(1, EditDistance.getDistance("현", "혀"));
	}

}
