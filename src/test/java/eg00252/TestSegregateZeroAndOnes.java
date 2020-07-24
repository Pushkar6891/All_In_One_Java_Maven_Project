package eg00252;

import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.verify;

import static org.mockito.Mockito.when;

import org.junit.Before;

import org.junit.Rule;

import org.junit.Test;

import org.mockito.Mock;

import org.mockito.junit.MockitoJUnit;

import org.mockito.junit.MockitoRule;

public class TestSegregateZeroAndOnes {

	SegregateZeroAndOnes segregateZeroAndOnes = null;

	@Rule

	public MockitoRule rule = MockitoJUnit.rule();

	@Mock

	SegregateZeroAndOnesService service;

	@Before

	public void setUp() {

		segregateZeroAndOnes = new SegregateZeroAndOnes(service);

	}

	@Test

	public void testPerform1() {

		int[] input = { 0, 1, 0, 1, 1, 0, 1 };

		int[] expected = { 0, 0, 0, 1, 1, 1, 1 };

		when(service.segregateZeroAndOnes(input)).thenReturn(expected);

		assertEquals(expected, segregateZeroAndOnes.perform(input));

		verify(service).segregateZeroAndOnes(input);

	}

	@Test

	public void testPerform2() {

		int[] input = { 0, 1, 1, 1, 0, 1, 0, 0, 1, 1 };

		int[] expected = { 0, 0, 0, 0, 1, 1, 1, 1, 1, 1 };

		when(service.segregateZeroAndOnes(input)).thenReturn(expected);

		assertEquals(expected, segregateZeroAndOnes.perform(input));

		verify(service).segregateZeroAndOnes(input);

	}

}