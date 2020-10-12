package com.capgemini.testmaximum;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestMaximum {

	private static final Logger log = LogManager.getLogger(TestMaximum.class);

	public Integer findMax(Integer x, Integer y, Integer z) {
		Integer max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;

		return max;
	}
	public Float findMax(Float x, Float y, Float z) {
		Float max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;

		return max;
	}
	public String findMax(String x, String y, String z)
	{
		String max = x;
		if(y.compareTo(max)>0)
			max=y;
		if(z.compareTo(max)>0)
			max=z;
	
		return max;
	}

	public static void main(String[] args) {
		TestMaximum testMaximum = new TestMaximum();
		Integer a = 40, b = 20, c = 25;
		Float d=10.0f, e=15.f, f=31.f;
		String g="200",h="357",i="870";
		Integer maxInt = testMaximum.findMax(a, b, c);
		Float maxFloat=testMaximum.findMax(d, e, f);
		String maxString=testMaximum.findMax(g, h, i);
		log.info("The maximum integer in " + a + ", " + b + ", " + c + " is " + maxInt);
		log.info("The maximum float in "+d+", "+e+", "+f+" is "+maxFloat);
		log.info("The maximum string in "+g+", "+h+", "+i+" is "+maxString);
	}
}
