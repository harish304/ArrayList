package ArrayListPractice1;

import java.util.ArrayList;

public class Practice14 {
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
		for(int i =0 ;i<al.size();i++) {
			for(int j =0;j<al.size();j++) {
				if(al.get(i).equals(al.get(j))) {
					al.remove(j);
				System.out.println(al);
			}
			}
		}
	}
}


