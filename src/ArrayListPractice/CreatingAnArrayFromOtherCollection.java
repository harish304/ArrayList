package ArrayListPractice;

import java.util.ArrayList;
import java.util.Collections;

public class CreatingAnArrayFromOtherCollection {
	public static void main(String[]args) {
		ArrayList<Integer> FristFiveNumbers = new ArrayList<>();
		FristFiveNumbers.add(1);
		FristFiveNumbers.add(2);
		FristFiveNumbers.add(3);
		FristFiveNumbers.add(4);
		FristFiveNumbers.add(5);
		
		ArrayList<Integer> FristTenNumbers = new ArrayList<>(FristFiveNumbers);
		
		ArrayList<Integer> NextFiveNumbers = new ArrayList<>();
		
		NextFiveNumbers.add(6);
		NextFiveNumbers.add(8);
		NextFiveNumbers.add(9);
		NextFiveNumbers.add(7);
		NextFiveNumbers.add(10);
		
		FristTenNumbers.addAll(NextFiveNumbers);
		Collections.sort(FristTenNumbers);
		System.out.println(FristFiveNumbers.get(3));
		System.out.println(FristTenNumbers.set(2,14));
		System.out.println(FristTenNumbers);
		
	}

}
