
package com.quiz.multiple;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;


public  class TestMultiples
{
    private Multiples multiples;
    
    @Before public void setUpMyTest() {
	multiples = new Multiples();
    }
    @Test public void test1() {
	final int result = multiplesOf3N5 (10);
    }
   @Test public void test2() {
	final int result = multiplesOf3N5 (3);

	assertEquals(0, result);
    }
    
    private int multiplesOf3N5(int num)
    {
	return  multiples.findSumOfMultipler2 (3,num) +  multiples.findSumOfMultipler2 (5,num);
    }
}
