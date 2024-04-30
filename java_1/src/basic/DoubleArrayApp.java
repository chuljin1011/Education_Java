package basic;

import java.util.Iterator;

public class DoubleArrayApp {
	public static void main(String[] args) {
		int[][] numArray=new int[2][3];
		
		System.out.println("numArray = "+numArray);
		System.out.println("numArray[1] = "+numArray[1]);
		
		System.out.println("=======================================================");
		System.out.println("numArray[0][0] = "+numArray[0][0]);
		
		System.out.println(numArray.length);
		System.out.println(numArray[0].length);
		for (int i = 0; i < numArray.length; i++) {
			for (int j = 0; j < numArray[0].length; j++) {
				System.out.println(numArray[i][j]);
				
			}
			
		}
		System.out.println("=======================================================");
		int[][] suArray = new int[][] {{10,20,30},{40,50,60},{70,80,90}};
		int[][] suArray1 = {{10,20,30},{40,50,60},{70,80,90}};
		
		for(int[] array : suArray1) {
			for(int num : array) {
				System.out.print(num + "\t");
			}
			
			System.out.println();
		}
		
		int[][] valueArray = new int [3][];
		
		valueArray[0] = new int[3];
		valueArray[1] = new int[2];
		valueArray[2] = new int[4];
		
	}

}
