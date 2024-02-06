package ArrayListPractice;

import java.util.ArrayList;

public class AccessingElementsFromAnArrayList {

	public static void main(String[] args) {
		ArrayList<String> TopCompanies = new ArrayList<>();
		System.out.println("Is the Companies list is empty"+ TopCompanies.isEmpty());
		
		TopCompanies.add("Google");
		TopCompanies.add("Apple");
		TopCompanies.add("OnePlus");
		TopCompanies.add("Amazon");
		TopCompanies.add("FaceBook");
		
		System.out.println("Here are the top " + TopCompanies.size() + " companies in the world");
		System.out.println(TopCompanies);
		
		String BestCompany = TopCompanies.get(0);
		String SecondBestCompany = TopCompanies.get(1);
		String LatCompany = TopCompanies.get(TopCompanies.size()-1);
		
		System.out.println("Best company in list: "+BestCompany);
		System.out.println(SecondBestCompany );
		System.out.println(LatCompany );
		
		TopCompanies.set(4,"WallMArt");
		System.out.println("The Modified Companies are :"+TopCompanies);
		
		
		
		
		
		
		
		
		
		

	}

}
