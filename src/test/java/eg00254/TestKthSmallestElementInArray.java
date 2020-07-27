package eg00254;

import static org.junit.Assert.assertEquals;

import static org.mockito.Mockito.verify;

import static org.mockito.Mockito.when;

import org.junit.Before;

import org.junit.Rule;

import org.junit.Test;

import org.mockito.Mock;

import org.mockito.junit.MockitoJUnit;

import org.mockito.junit.MockitoRule;

import eg00197.KthSmallestElementInArray;
import eg00197.KthSmallestElementInArrayService;

public class TestKthSmallestElementInArray {

	KthSmallestElementInArray kthSmallestElementInArray = null;

// 1 way

	@Rule

	public MockitoRule rule = MockitoJUnit.rule();

	@Mock

	KthSmallestElementInArrayService service;

	@Before

	public void setUp() {

		kthSmallestElementInArray = new KthSmallestElementInArray(service);

	}

	@Test

	public void testPerform1() {

		int[] arr = { 7, 10, 4, 3, 20, 15 };

		int k = 3;

		when(service.getKthSmallestElementUsingHeap(arr, k)).thenReturn(7);

		assertEquals(7, kthSmallestElementInArray.perform(arr, k));

		verify(service).getKthSmallestElementUsingHeap(arr, k);

	}

	@Test

	public void testPerform2() {

		int[] arr = { 9, 8, 2, 6, 4, 19, 11, 5 };

		int k = 7;

		when(service.getKthSmallestElementUsingHeap(arr, k)).thenReturn(11);

		assertEquals(11, kthSmallestElementInArray.perform(arr, k));

		verify(service).getKthSmallestElementUsingHeap(arr, k);

	}

}