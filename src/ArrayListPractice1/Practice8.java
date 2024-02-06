package ArrayListPractice1;

import java.util.ArrayList;
import java.util.Collections;

public class Practice8 {

	public static void main(String[] args) {
		// Write a Java program to sort a given array list.
		
		ArrayList<Integer> Numbers = new ArrayList<>();
		Numbers.add(6);
		Numbers.add(8);
		Numbers.add(9);
		Numbers.add(2);
		Numbers.add(5);
		Numbers.add(1);
		Collections.sort(Numbers);
		System.out.println(Numbers);
	}

}
