package javaprogram;

import java.util.ArrayList;

public class pro1 {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("bcp");
		list.add("india");
		
		System.out.println(list);
		for (int i = 0; i < list.size(); i++) {
			
			String s=list.get(i);
			String rev="";
			for (int j = s.length()-1; j >=0; j--) {
				
				rev=rev+s.charAt(j);
			}
			list.set(i, rev);
			
		}
		System.out.println(list);
	}

}
