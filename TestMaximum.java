package com.capgemini.testmaximum;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestMaximum {

	private static final Logger log = LogManager.getLogger(TestMaximum.class);

	public Integer toMax(Integer x, Integer y, Integer z) {
		Integer max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;

		return max;
	}

	public static void main(String[] args) {
		TestMaximum testMaximum = new TestMaximum();
		Integer a = 40, b = 20, c = 25;
		Integer maxInt = testMaximum.toMax(a, b, c);
		log.info("The maximum integer in " + a + ", " + b + ", " + c + " is " + maxInt);
	}
}
