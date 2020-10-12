package com.capgemini.testmaximum;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestMaximum {

	private static final Logger log = LogManager.getLogger(TestMaximum.class);

	public <T extends Comparable<T>> T findMax(T x, T y, T z)
	{
		T max = x;
		if(y.compareTo(max)>0)
			max=y;
		if(z.compareTo(max)>0)
			max=z;
	
		return max;
	}
	public static void main(String[] args) {
		TestMaximum testMaximum = new TestMaximum();
		String a="40", b="20", c="55";
		String maxString=testMaximum.findMax(a, b, c);
		log.info("The maximum integer in "+a+", "+b+", "+c+" is "+maxString);
	}
}
