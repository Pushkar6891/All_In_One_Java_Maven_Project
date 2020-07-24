package eg00253;

import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.verify;

import static org.mockito.Mockito.when;

import org.junit.Before;

import org.junit.Rule;

import org.junit.Test;

import org.mockito.Mock;

import org.mockito.junit.MockitoJUnit;

import org.mockito.junit.MockitoRule;

public class TestMaxZeroesBetweenOnes {

	MaxZeroesBetweenOnes maxZeroesBetweenOnes = null;

	@Rule

	public MockitoRule rule = MockitoJUnit.rule();

	@Mock

	MaxZeroesBetweenOnesService service;

	@Before

	public void setUp() {

		maxZeroesBetweenOnes = new MaxZeroesBetweenOnes(service);

	}

	@Test

	public void testPerform1() {

		String str = "1000110000100";

		when(service.maxConsecutiveZeroes(str)).thenReturn(4);

		assertEquals(4, maxZeroesBetweenOnes.perform(str));

		verify(service).maxConsecutiveZeroes(str);

	}

	@Test

	public void testPerform2() {

		String str = "10000100010010000010000100001";

		when(service.maxConsecutiveZeroes(str)).thenReturn(5);

		assertEquals(5, maxZeroesBetweenOnes.perform(str));

		verify(service).maxConsecutiveZeroes(str);

	}

}