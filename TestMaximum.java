package com.capgemini.testmaximum;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestMaximum <T extends Comparable<T>> {

	private static final Logger log = LogManager.getLogger(TestMaximum.class);

T x, y, z;
	
	public TestMaximum(T x, T y, T z)
	{
		super();
		this.x=x;
		this.y=y; 
		this.z=z;
	}
	
	public T findMax()
	{
		return  TestMaximum.findMax(this.x,this.y,this.z);
		
	}
	
	public static <T extends Comparable<T>> T findMax(T x, T y, T z)
	{
		T max = x;
		if(y.compareTo(max)>0)
			max=y;
		if(z.compareTo(max)>0)
			max=z;
	
		return max;
	}
	
	
	
    public static void main( String[] args )
    {
    	
		Integer a=10, b=30, c=50;
		TestMaximum<Integer>testMaximum=new TestMaximum<Integer>(a,b,c);
		String d="5", e="56", f="25";
		TestMaximum<String>testMaximum1=new TestMaximum<String>(d,e,f);
		Float g=10.5f, h=30.f, i=50.8f;
		TestMaximum<Float>testMaximum2=new TestMaximum<Float>(g,h,i);
		log.info("The maximum in "+a+", "+b+", "+c+" is "+testMaximum.findMax());
		log.info("The maximum in "+d+", "+e+", "+f+" is "+testMaximum1.findMax());
		log.info("The maximum in "+g+", "+h+", "+i+" is "+testMaximum2.findMax());
		
    }
}

