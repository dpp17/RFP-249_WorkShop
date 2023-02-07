package workshoptwo;

import java.util.ArrayList;

/*
 Write a program in range 1......50 
 find all the odd num store in array 
 and find addition of the odd number and print the same.
 * */
public class WorkShopMain {

	void byArrayList() {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> resultArrayList = new ArrayList<Integer>();
		
		for(int i = 1; i <= 50; i++) {
			list.add(i-1, i );
		}
		int sum = 0;
		System.out.println("Odd Numbers :: ");
			for(int i = 0; i < 50; i++) {
				if(i%2 != 0 ) {
					System.out.print(list.get(i-1)+", ");
					 sum = sum + i;
				}
			}System.out.println('\n'+"Sum of All Odd Numbers :: " + sum);
			int j=0;
			for(int i = 1; i <= list.size(); i++ ) {
				if(list.get(i-1)%2 != 0) {
					resultArrayList.add(j, list.get(i-1));
					j++;
			}
		}
			System.out.println("Result ArrayList");
			for(int i = 0;i<resultArrayList.size() ; i++) {
				System.out.print(resultArrayList.get(i) + ", ");
			}System.out.println();
	}
	
	
	
	void byArray() {
		int[] numberArray = new int[50];//array
		
		for(int i = 1; i <= numberArray.length; i++) {
			numberArray[i-1]=i;
		}
		int sum = 0;
		int count = 0;
		System.out.println("Odd Numbers :: ");
			for(int i = 1; i <= numberArray.length; i++) {
				if(i%2 != 0 ) {
					System.out.print(numberArray[i-1]+", ");
					 sum = sum + i;
					 count++;
				}
			}System.out.println('\n'+"Sum of All Odd Numbers :: " + sum);		
			int[] resultArray = new int[count];
			int j = 0;
			for(int i = 1; i <= numberArray.length; i++ ) {
					if(numberArray[i-1]%2 != 0) {
						resultArray[j] = numberArray[i-1];
						j++;
				}
			}
			System.out.println("Result Array :: ");
			for(int i = 0; i < resultArray.length; i++ ) {
				System.out.print(resultArray[i]+", ");
			}
	
	}

	
	
	
	public static void main(String[] args) {
	
		WorkShopMain work = new WorkShopMain();
	
		System.out.println("program for odd numbers in range 1......50 ");
		System.out.println("By ArrayList ::");
		work.byArrayList();
		System.out.println();
		System.out.println("By Array");
		work.byArray();
	
	}
}






