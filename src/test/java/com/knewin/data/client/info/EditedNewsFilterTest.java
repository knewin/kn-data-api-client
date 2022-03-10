package com.knewin.data.client.info;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EditedNewsFilterTest {

	@Test
	public void testCreateEditedShouldFromNull() {
		assertEquals(EditedNewsFilter.SHOULD, EditedNewsFilter.of(null));
	}


	@Test
	public void testCreateEditedMustFromTrue() {
		assertEquals(EditedNewsFilter.MUST, EditedNewsFilter.of(true));
	}


	@Test
	public void testCreateEditedMustNotFromFalse() {
		assertEquals(EditedNewsFilter.MUST_NOT, EditedNewsFilter.of(false));
	}

}
