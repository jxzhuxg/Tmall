package aa;

import java.util.Random;

public class Helloworld {

	public static void test1(int i){
		System.out.println(i);
	}
	public static void main(String[] args) {
		System.out.println();
		test1(2);
		test2(2);

	}
	public static void test2(int i){
		double rr = 
		new Random().nextDouble();
		System.out.println(i*rr);
	}
}
