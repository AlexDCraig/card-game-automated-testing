package edu.osu.cs362;

import static org.junit.Assert.*;
import org.junit.Test;


public class WarmupTest  {
/*    	@Test
    	public void testFindIntegerExample() {

		int result = WarmUp.findInteger(new int[] { 1, 2, 3, 4, 5 }, 100);
		assertEquals(-1,result);

		for (int i = 1; i < 5; i++) {
			int result2 = WarmUp.findInteger(new int[] { 1, 2, 3, 4, 5 }, i + 1);
			assertEquals("findInteger(new int[]{1,2,3,4,5}," + i + ")", i,result2);
		}
	}

	// Returns index of last occurrence of 0 or -1 if no such element exists

	@Test
	public void testLastZero()
	{
		/*
		
		int result = WarmUp.lastZero(new int[] { 0, 1, 2, 3, 0 };
		assertEquals(result, 4); 

		int result = WarmUp.lastZero(new int [] { 0 });
		assertEquals(result, 0);	

		result = WarmUp.lastZero(new double [] { 3.3, 4.4, 5.5, 0 });
		assertEquals(result, 3);

		result = WarmUp.lastZero(new int [] { 0, 1, 2, 3, 4, 5 });
		assertEquals(result, 0);
		
	}

	@Test // should only work when the array's element 0 contains the value and there is no element after it that contains that value
	public void testLast()
	{
		// does not pass, element is present at 0 and 1		
		/*int result = WarmUp.last((new int[] { 1, 1, 2, 3 }), 1);
		assertEquals(result, 1);*/

		// passes because only 1 element that matches it
		/*int result = WarmUp.last((new int[] { 1 }), 1);
		assertEquals(result, 0);*/

		// passes
		/*
		int[] arr = null;
		int result = WarmUp.last((arr), 0);
		assertEquals(result, -1);*/

		// exception
		/*int result = WarmUp.last((new int[] { 1 }), 2);
		assertEquals(result, -1);*/ 

		// exception
		/*int result = WarmUp.last((new double[] { 1.0, 2.0 } ), 2.0);
 * 		assertEquals(result, -1);

		// passes
		/*int result = WarmUp.last((new int[] { 0, 1, 2, 3 } ), 0);
		assertEquals(result, 0);/*
		*/
		
		// passes
		/*
		int result = WarmUp.last((new int[] { }), 1);
		assertEquals(result, -1);
			
	}

	@Test
	public void testPositive()
	{	
		/*
		// All of them pass
		int result = WarmUp.positive(new int[] { 1, 2, 3, 4, 5 });
		assertEquals(result, 5);

		result = WarmUp.positive(new int[] { 1 });
		assertEquals(result, 1);

		result = WarmUp.positive(new int[] { });
		assertEquals(result, 0);
	
		// the following two do not pass
		/*int array[] = null;
		result = WarmUp.positive(array);*/

		/*int result = WarmUp.positive(new double[] { 1.0, 2.0 });
		assertEquals(result, 0);

		result = WarmUp.positive(new int[] { -1, -2, -3 });
		assertEquals(result, 0);

		result = WarmUp.positive(new int[] {-1, -2, 3});
		assertEquals(result, 1);	
		
	}

	@Test
	public void testOddOrPos()
	{
		// passes when element num > 2, all positive
		int res = WarmUp.oddOrPos(new int[] { 1, 2, 3, 4 });
		assertEquals(res, 4);

		// doesn't work for only negative odd numbers
		/*res = WarmUp.oddOrPos(new int[] { -3, -9, -11 });
		assertEquals(res, 3);*/
		/*
 
		res = WarmUp.oddOrPos(new double[] { -1.0, 2.0, 3.0 });
		assertEquals(res, 2);

		res = WarmUp.oddOrPos(new int[] { -1, 2, 3, 4 });
		assertEquals(res, 4);

		res = WarmUp.oddOrPos(new int[] { 1 });
		assertEquals(res, 1);

		/*int array[] = null;
		res = WarmUp.oddOrPos(array);
		assertEquals(res, 0);

		res = WarmUp.oddOrPos(new int[] { });
		assertEquals(res, 0);
		
	}*/
	
}
