package com.capgemini.testmaximum;
import java.util.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestMaximum<T extends Comparable<T>> {
	List<T> values;
	private static final Logger log = LogManager.getLogger(TestMaximum.class);

	T x, y, z;

	public TestMaximum(T... values) {
		this.values = Arrays.asList(values);
	}

	public T findMax() {
		return TestMaximum.findMax(values);

	}

	public static <T extends Comparable<T>> T findMax(List<T> values) {

		T max;
		List<T> sortedList = new ArrayList<>(values);
		Collections.sort(sortedList);
		max = sortedList.get(sortedList.size() - 1);
		return max;
	}

	public static void main(String[] args) {

		Integer a = 500, b = 50, c = 5, d = 25;
		log.info(new TestMaximum<Integer>(a, b, c, d).findMax());
		String e = "5", f = "89", g = "225", h = "68";
		log.info(new TestMaximum<String>(e, f, g, h).findMax());

	}
}