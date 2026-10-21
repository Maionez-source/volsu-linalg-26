package src.edu.volsu.pimm261.test;

import java.util.Arrays;

import src.edu.volsu.pimm261.linear.Rational;
import src.edu.volsu.pimm261.linear.RationalUtils;

public class Test {

	public static void main (String[] args) {
		t5();			
	}
	public static void t1() {
		Rational r = new Rational(2);
		Rational s = new Rational(1,2);
		System.out.println(r.getInverse());
	}
	
	public static Integer rnd(Integer a, Integer b) {
		return Math.round((float)(Math.random()*(b-a)+a));
	}
	
	public static void t2() {
		for (int i = 0; i < 20; i++) 
			System.out.println(rnd(-3,7));
	}
	public static void t3() {
		System.out.println(RationalUtils.getRandom(10, 100, 6).toFloat());
	}
	
	public static void t4() {
		Rational r = new Rational(1,2);
		Rational s = (Rational)r.clone();
		System.out.println(s);
	}
	
	public static void t5() {
		Rational [] arr = new Rational[3];
		arr[0] = new Rational(1,2);
		arr[1] = new Rational(1,3);
		arr[2] = new Rational(-3,5);
		Arrays.sort(arr);
		System.out.println(arr[0]+", "+arr[1]+", "+arr[2]);
	}
	
}
