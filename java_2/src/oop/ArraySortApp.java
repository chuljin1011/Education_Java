package oop;

import java.util.Arrays;

public class ArraySortApp {
	public static void main(String[] args) {
		int[] array = {30, 50, 10, 20, 40};
		
		System.out.println(" 정렬 전 >>");
		for(int number : array) {
			System.out.println(number + " ");
		}
		System.out.println();
		
		System.out.println("정렬 전 >>" + Arrays.toString(array));
		
		Arrays.sort(array);
		
		System.out.println("정렬 후 >>" + Arrays.toString(array));
	}
}
		
//		for(int i=0 ; i < array.length-1 ; i++) {
//			for(int j = i+1 ; j < array.length ; j++) {
//				if (array[i] > array[j]) {
//					int temp = array[i];
//					array[i] = array[j];
//					array[j] = temp;
//					
//				}
//			}
//		}
////			System.out.println(" 정렬 후 >>");
////			for(int number : array) {
////				System.out.println(number + " ");
////			}
//	}
//}
//	


