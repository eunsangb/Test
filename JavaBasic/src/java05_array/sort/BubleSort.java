package java05_array.sort;

import java.util.Arrays;

public class BubleSort {
	public static void main(String[] args) {
		
		//버블 정렬
		//----------------------------------------------------------
		
		int[] arr = {3,2,5,4,1};
		
		//원본 출력
		System.out.println("---정렬 전---");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		//버블 정렬 수행
		
		for(int j =0; j<arr.length-1; j++) {  //j, arr.length -1 회 반복
			
			//각 회차 반복
			for (int i = 0; i < arr.length-1-j; i++) {
//				if(arr[i] > arr[i+1]) {
				if(arr[i] < arr[i+1]) {
				
				}
			}
		}
		
		
		
//			for (int i = 0; i < arr.length; i++) {
//				for (int j = i+1 ; j < arr.length; j++) {
//					if(arr[i]>arr[j]) {
//						int temp = arr[i];
//						arr[i] = arr[j];
//						arr[j] = temp;							
//					}
//				}
//			}
		
		//결과 출력
		System.out.println();
		System.out.println("---정렬 후---");
		for (int i = 0; i < arr.length; i++) {

			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		System.out.println("---------------------");
		
		int[] arr2 = {4324,5245,6546,76,454,234};
		
		//정렬
		Arrays.sort(arr2);
		
		System.out.println(Arrays.toString(arr2));
		
	}
}
