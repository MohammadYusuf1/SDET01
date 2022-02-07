package javaprogram;

import java.util.Iterator;

public class ChangeFirstCharToUpperCase {

	public static void main(String[] args) {
		String str = "my name is yusuf";
		String[] str1 = str.split(" ");
		for (int i = 0; i < str1.length; i++) 
		{
			char[] ch = str1[i].toCharArray();
			for (int j = 0; j < ch.length; j++) 
			{
				ch[0] = (char) (ch[0]-32);
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
	}

}
