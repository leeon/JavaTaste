/**
 * StringDemo.java
 * @author leeon
 * @version 1.0
 * 2012 4 2 
 * */

package org.leeon.java.str;

/*this is a class testing some string use */
public class StringDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str1 = "string";
		String str4 = "string";
		String str2 = new String("string");
		String str3 = new String("string");
		

		System.out.println(str1 == str4);
		System.out.println(str2 == str3);
		System.out.println(str3 == str1);
		
		str3 = str3.intern(); 
		System.out.println(str3 == str1);
		
		StringBuilder sb = new StringBuilder("string builder");
		StringBuffer sf = new StringBuffer("string buffer");
		

		
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < 50000; i++)
		{
			//str1+= " ";   /*string*/
			sf.append(" ");   /*StringBffer*/
			//sb.append(" ");   /*StringBuilder*/
		}
		
		long end = System.currentTimeMillis();
		System.out.println("the run time is "+(end -start)+" ms");
	}

}
