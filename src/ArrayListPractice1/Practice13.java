package ArrayListPractice1;

import java.util.ArrayList;

public class Practice13 {
	public static void main(String[] args) {
		//Find the sum of elements in the ArrayList.
		ArrayList <Integer> al = new ArrayList<>();
		al.add(100);
		al.add(10);
		al.add(32);
		al.add(13);
		al.add(23);
		al.add(45);
		al.add(60);
		al.add(76);
		al.add(55);
		al.add(28);
		System.out.println(al);
		int sum1 = 0;
		for(int i =0 ;i<al.size();i++) {
			sum1 = sum1 + al.get(i);
			System.out.println(sum1);
		}
		
		
	}

}
