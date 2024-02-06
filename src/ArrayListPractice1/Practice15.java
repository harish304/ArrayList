package ArrayListPractice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Practice15 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(10);
		al.add(32);
		al.add(13);
		al.add(32);
		al.add(45);
		al.add(60);
		al.add(76);
		al.add(60);
		al.add(28);
		  System.out.println("ArrayList: " + al);
	        System.out.println("Minimum number: " + findMin(al));
	        System.out.println("Maximum number: " + findMax(al));
	    }

	    public static int findMin(ArrayList<Integer> list) {
	        return Collections.min(list);
	    }

	    public static int findMax(ArrayList<Integer> list) {
	        return Collections.max(list);
	    }
	

}
