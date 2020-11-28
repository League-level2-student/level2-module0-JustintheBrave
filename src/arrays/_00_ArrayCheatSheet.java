package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] Array = {"hi", "bye", "justin", "pog", "gg"};
		//2. print the third element in the array
		System.out.println(Array[2]);
		//3. set the third element to a different value
		Array[2]="changed";
		//4. print the third element again
		System.out.println(Array[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i=0; i<Array.length; i++) {
			System.out.println(Array[i]);
		}
		
		//6. make an array of 50 integers
		int[] fifty = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		for (int i = 0; i < fifty.length; i++) {
			fifty[i]= new Random().nextInt(50);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest=49;
		for (int i = 0; i < fifty.length; i++) {
			if(fifty[i]<smallest) {
				smallest=fifty[i];
			}
		}
		System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
		for (int i = 0; i < fifty.length; i++) {
			System.out.print(fifty[i] + " ");
		}
		//10. print the largest number in the array.
		int largest = 0;
		for (int i = 0; i < fifty.length; i++) {
			if(fifty[i]>largest) {
				largest=fifty[i];
			}
		}
		System.out.println();
		System.out.println(largest);
		
		
		
	}
}
