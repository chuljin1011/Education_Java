package basic;

import java.util.Iterator;

public class ArrayApp {
	public static void main(String[] args) {
		int[] numArray = new int[3];
		System.out.println(numArray[0]);
		System.out.println(numArray[1]);
		System.out.println(numArray[2]);

		System.out.println(numArray.length);

		int a1;
		
		for (a1 = 0; a1 < numArray.length; a1++) {
			numArray[a1] = (a1 + 1) * 10;
			System.out.println(numArray[a1]);
		}

		for (int i = 0; i < numArray.length; i++) {
			System.out.println(numArray[i]);
		}
		
		System.out.println("============================================================");
		
		int[] su1Array = new int[] {10, 20, 30};
		for (a1 = 0; a1 < numArray.length; a1++) {
			numArray[a1] = (a1 + 1) * 10;
			System.out.println(numArray[a1]);
		}
		
		String s1;
		s1 = ("가"+"나");
		System.out.println(s1);
		
		int[] su2Array= {10,20,30,40};
		
		for(int number : su2Array) {
			System.out.println(number + "\t");
		}
		
		System.out.println("============================================================");
		
		int[] array = {54, 70,64,87,96,01,65,76,11,34,56,41,77,80 };
		
		int tot = 0;
		
		for (int i = 0; i < array.length; i++) {
			tot += array[i];
		}
		System.out.println(tot);
		System.out.println();
		
		int cnt = 0;
		for(int element : array) {
			if(element >= 30 && element <= 60) {
				cnt++ ;
			}
		}
		
		System.out.println(cnt);
		
				
		
		
		
	}
}
