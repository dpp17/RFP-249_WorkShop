package workshopone;
import java.util.Scanner;

public class CheckSubsetOfArray {


//array 1 is subset of array 2
	void arrayTwoIsSet(int firstArraySize, int secondArraySize){
		Scanner getInput = new Scanner(System.in);
		int[] parentArray = new int[firstArraySize];
		int[] subSetArray = new int[secondArraySize];
		
		System.out.println(" Enter elements of 1st Array :: ");
		for(int i = 0; i < parentArray. length; i++) {
				parentArray[i] = getInput. nextInt();
		}
		System.out.println(" Enter elements of 2nd Array :: ");
		for(int i = 0; i < subSetArray. length; i++) {
			subSetArray[i] = getInput. nextInt();
		}

		int count = 0;
		for(int i = 0; i < parentArray.length; i++) {
			for(int j = 0; j < subSetArray.length ; j++) {
				if(parentArray[i] == subSetArray[j]) {
					System.out.println("common element :: " + subSetArray[j]);
				count++;
				}
			}
		}
		if(count == secondArraySize) {
			System.out.println(" Array 2 is sub-set of Array 1 ");
		}else {
			System.out.println(" Not a sub set ");
		}
	}
	
//array 2 is subset of array 1
	void arrayOneIsSet(int firstArraySize, int secondArraySize){
		Scanner getInput = new Scanner(System.in);
		int[] parentArray = new int[firstArraySize];
		int[] subSetArray = new int[secondArraySize];
		
		System.out.println(" Enter elements of 1st Array :: ");
		for(int i = 0; i < parentArray. length; i++) {
				parentArray[i] = getInput. nextInt();
		}
		System.out.println(" Enter elements of 2nd Array :: ");
		for(int i = 0; i < subSetArray. length; i++) {
			subSetArray[i] = getInput. nextInt();
		}

		int count = 0;
		for(int i = 0; i < subSetArray.length; i++) {
			for(int j = 0; j < parentArray.length ; j++) {
				if(parentArray[j] == subSetArray[i]) {
					System.out.println(" common element :: " + parentArray[j]);
					count++;
				}
			}
		}
		if(count == firstArraySize) {
			System.out.println(" Array 1 is sub-set of Array 2 ");
		}else {
			System.out.println(" Not a sub set ");
		}
	}
	
//both the array have same size	
	void arraysAreSame(int firstSize, int secondSize){
		Scanner getInput = new Scanner(System.in);
		int[] parentArray = new int[firstSize];
		int[] subSetArray = new int[secondSize];
		
		System.out.println(" Enter elements of 1st Array :: ");
		for(int i = 0; i < parentArray. length; i++) {
				parentArray[i] = getInput. nextInt();
		}
		System.out.println(" Enter elements of 2nd Array :: ");
		for(int i = 0; i < subSetArray. length; i++) {
			subSetArray[i] = getInput. nextInt();
		}
		
		int count = 0;
		for(int i = 0; i < subSetArray.length; i++) {
			for(int j = 0; j < parentArray.length ; j++) {
				if(parentArray[j] == subSetArray[i]) {
					System.out.println(" Both the Array have Same size with common element :: " + subSetArray[j]);
					 count++;
				}
			}
		}if(count == firstSize) {
			System.out.println(" Array 1 Twin of Array 2 ");
		}else {
			System.out.println(" Not a sub set ");
		}
	}
	

//main-method
	public static void main(String[] args) {
		
		Scanner getInput = new Scanner(System.in);
		CheckSubsetOfArray subSet = new CheckSubsetOfArray();
		
		int firstArraySize = 0;
		int secondArraySize = 0;
		//Get-Array-Sizes
				System.out.println(" Enter the size of 1st Array :: ");
				firstArraySize = getInput.nextInt();
				
				System.out.println(" Enter the size of 2nd Array :: ");
				secondArraySize = getInput.nextInt();
				
//array 1 is subset of array 2
				
				if(firstArraySize > secondArraySize) {
					subSet.arrayTwoIsSet(firstArraySize,secondArraySize);					
//array 2 is subset of array 1
					
				}else if(secondArraySize > firstArraySize) {
					subSet.arrayOneIsSet(firstArraySize,secondArraySize);
//both the array have same size
					
				}else {
					subSet.arraysAreSame(firstArraySize, secondArraySize);
				}
	
	}
}
