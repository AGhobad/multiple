
package com.quiz.multiple;

/**
* Multiples 
* 
* <P> Given an integer, this program finds all multiples of 3 or 5 and returns sum of those multiples. For example:
* for integer 10, we have multiples of 3,6,9 for 3 and multiple 5 for 5. The total would be 23.
*  
*  
* @author Ali Ghobadpour
* @version 0.1
*/




public  class Multiples
{



/**
 * <p>
 * Given an integer, this method finds all multiples of given parameter when those multiples are smaller than the given integer. 
 * For example, given 3 and 10, it finds 3,6,9 and returns 15.
 * <p>
 * This method calculates the sum in O(1), i.e. the time complexity is independant of the given parameter.
 * @param  multiple  an integer to find all multiples of.
 * @param  num an integer to find all multiples of m when those multiples are smaller than num.
 * @return      the sum of all multiples.
 */
public static   int  findSumOfMultipler(int multiple, int num)
    {
	int sum = 0;
	int i = num  -1;
	while (i >= multiple )
	    {
		if ((i % multiple ) != 0) // this loop works at most m times
		    {			
			i--;
			continue;
		    }
		int totalmultipers = i/multiple;
		sum = ((totalmultipers * (totalmultipers + 1))/2) * multiple;
		break;	
	    }
	return sum;
    }
/**
 * <p>
 * Given an integer, this method finds all multiples of given parameter when those multiples are smaller than the given integer. 
 * For example, given 3 and 10, it finds 3,6,9 and returns 15.
 * <p>
 * This method calculates the sum in O(K), where K = num/multiple.
 * @param  multiple  an integer to find all multiples of.
 * @param  num an integer to find all multiples of m when those multiples are smaller than num.
 * @return      the sum of all multiples.
 */
    public static   int  findSumOfMultipler2(int multiple, int num)
    {
	int sum = 0;
	
	if (num < multiple )
	    return 0;
	
	int i = multiple;
	while (i <= num -1 )
	    {
		sum += i;
		i += multiple;
	    }
	return sum;	       
    }

/**
 * <p>
 * Calls findSumOfMultipler and findSumOfMultipler2 for a given parameter 
 *
 * @param  args  an String array
 */   

    public static void main(String[] args) 
    {       
	if (args.length == 0)
	    {
		System.err.println(" An integer  input is required.");
		System.exit (1);
	    }
	try
	    {
		int inputNumber = Integer.parseInt(args[0]);	
		int sum3 = findSumOfMultipler (3,inputNumber);
		int sum5 = findSumOfMultipler (5,inputNumber);
	
		System.out.println("Using first method for: :" + inputNumber);
		System.out.println("\tSum of all multiples of 3:" + sum3 + " and of 5:" + sum5 + " with total of:" + (sum3 + sum5));

		sum3 = findSumOfMultipler2 (3,inputNumber);
		sum5 = findSumOfMultipler2 (5,inputNumber);
	
		System.out.println("Using second method for: :" + inputNumber);
		System.out.println("      Sum of all multiples of 3:" + sum3 + " and of 5:" + sum5 + " with total of:" + (sum3 + sum5));
	    }
	catch(NumberFormatException e)
	    {
		System.err.println(" The given parameter :'" + args[0] + "' is not an integer. Please try again with an integer");
	    }
    }
}