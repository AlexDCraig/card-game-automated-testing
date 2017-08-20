package edu.osu.sort;

import static org.junit.Assert.*;
import org.junit.Test;
import java.util.*;
import org.junit.Before;
import java.util.Random;

public class SortTest  
{
	final int lowerBoundSize = 0;
	final int upperBoundSize = 1000;
	final int lowerBoundInt = -200000000;
	final int upperBoundInt = 200000000;
	private Random random;

	@Before
	public void initRandom()
	{
		long seed = System.currentTimeMillis();
		random = new Random(seed);
		System.out.printf("====Seed: %d====\n", seed);
	}

	public int generateRandomInt(int lbound, int ubound)
	{
		return random.nextInt(ubound - lbound) + lbound;
	}

	// Generate list of random integers of a random size between 0 and 1000
	// the random ints are between lower value and max value of java's int
    	private List<Integer> randomIntegerArray()
	{
		List<Integer> list = new ArrayList<Integer>();

		int arrayLength = generateRandomInt(lowerBoundSize, upperBoundSize);
		
		for (int i=0; i< arrayLength; i++)
		{
			int randomVal = generateRandomInt(lowerBoundInt, upperBoundInt);
			list.add(randomVal);
		}

		return list;
    	}

    /*
    @Test // This test is an example template using an oracle
    public void randomTestExample() {
	int n_runs = 10;
	for(int i=0;i<n_runs;i++){
	    
	    // Generate a random array of size 10
	    List<Integer> sorted = randomIntegerArray(10);

	    // Copy the sorted array before sorting it 
	    List<Integer> original = new ArrayList(sorted);

	    // Sort it
	    Sort.sort(sorted);

	    // Test the result 
	    assertTrue(SortOracle.isSorted(original,sorted));
	}
    }
    
    */
    @Test
    public void randomTestOracle() 
    {
	int n_runs = 100;
	
	for (int i =0; i < n_runs; i++)
	{
		// get a random array
		List<Integer> sorted = randomIntegerArray();

		// copy random array
		List<Integer> original = new ArrayList(sorted);

		// sort random array
		Sort.sort(sorted);

		// test
		assertTrue(SortOracle.isSorted(original, sorted));
	}
    }

    public boolean checkLessThan(int a, int b)
    {
		if (a <= b)
			return true;

		else
			return false;
    }

    public boolean checkIfSmallest(List<Integer> list, int index)
    {
	int elementOfSmallest = 0;
	int smallest = list.get(0);

	for (int i = 0; i < list.size(); i++)
	{
		if (list.get(i) < smallest)
		{
			smallest = list.get(i);
			elementOfSmallest = i;
		}
	}

	if (index == elementOfSmallest)
		return true;

	else
		return false;

    }

    public boolean checkIfBiggest(List<Integer> list, int index)
    {
	int elementOfLargest = list.size() - 1;
	int largest = list.get(list.size() - 1);

	for (int i = elementOfLargest - 1; i >= 0; i--)
	{
		if (list.get(i) > largest)
		{
			largest = list.get(i);
			elementOfLargest = i;
		}
	}

	if (index == elementOfLargest)
		return true;

	else
		return false;

    }

    @Test
    public void randomTestAssertion() 
    {    
	// 5 different assertions
	// get a random array
	List<Integer> sorted = randomIntegerArray();
	int sizeBefore = sorted.size();

	Sort.sort(sorted);
	int sizeAfter = sorted.size();

	// Assert 1: see if list size is the same
	assertEquals(sizeBefore, sizeAfter);

	// Assert 2: see if the element in the middle is less than the one above it
	int middle = sorted.size() / 2;
	assertEquals((checkLessThan(sorted.get(middle), sorted.get(middle+1))), true);

	// assert 3: see if first element is smallest
	assertEquals((checkIfSmallest(sorted, 0)), true);	

	// assert 4: see if last element is largest
	assertEquals((checkIfBiggest(sorted, sorted.size() - 1)), true);	

	// assert 5: see if first element is smaller than last element
	assertEquals((checkLessThan(sorted.get(0), sorted.get(sorted.size() - 1))), true);
	
    }
}
