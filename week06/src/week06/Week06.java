package week06;

import java.util.List;

public class Week06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		

		
		System.out.println(multiply(2,2));
		
		System.out.println(multiplyName("Loren", 3));
		
		System.out.println(createStringCount(5));


	}
	
	public static int multiply(int paramOne, int paramTwo) {
		return paramOne * paramTwo;
	}
	
	public static String multiplyName(String name, int times) {
		String result = "";
		for(int index = 0; index < times; index++) {
			result += name;
		}
		return result;
	}
	
	public static String createStringCount(int number) {
		StringBuilder word = new StringBuilder();
		while (number >= 0) {
			word.append(number--);
		}
		return word.toString();
	}
	

	
	

}
