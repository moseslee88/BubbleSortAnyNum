import java.io.*;
import java.util.*;

public class SolutionSortNums {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Please enter total numbers (size of list from 0 to 2 billion): ");
		int n = input.nextInt();
		int[] arr1 = new int[n];

		// next i just take in number of elements in the Array
		// The second line contains n space-separated integers describing the
		// respective values of a[0], a[1], a[n-1].
	     System.out.println("Please enter contents in the array: ");
		for (int i = 0; i < n; i++) {
			int a = input.nextInt();

			arr1[i] = a;
		}
		
		System.out.println("Array before being Sorted: " + Arrays.toString(arr1));

		int numberofSwaps = 0;

		//here i Swap numbers using a bubble Sort method, checking if previous number 
		//in array arr1 is greater than current number arr1[j]
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < (n - i); j++) {

				if (arr1[j - 1] > arr1[j]) {
					int temp = arr1[j - 1];
					arr1[j - 1] = arr1[j];
					arr1[j] = temp;
					numberofSwaps++;

				}

			}
			if (numberofSwaps == 0) {
				break;
			}  

		}
		System.out.println("Array is sorted in " + numberofSwaps + " swaps.");
		System.out.println("First Element: " + arr1[0]);
		System.out.println("Last Element: " + arr1[(n - 1)]);
		//print new sorted Array
		System.out.println("Sorted Array: " + Arrays.toString(arr1));

	}
}


//I figured out to NOT hard-code numbers in the array

//int d = input.nextInt();
//int e = input.nextInt();
//int f = input.nextInt();
//int g = input.nextInt();


//public void swap(int x, int y) {
//boolean swapped = true;
//while (swapped) {
//swapped = false;
//for (int i = 0; i < n; i++) {
//if (arr1[j - 1] > arr1[j]) {

////swap elements
//int temp = arr1[j - 1];
//arr1[j - 1] = arr1[j];
//arr1[j] = temp;

/*
*****
* boolean swapped = true;
*  while (swapped) { 
*  swapped = false;
for (int i = 0; i< nums.size() - 1; i++) {
 if (nums.get(i) > nums.get(i + 1)) { 
 // swap elements 
  * double temp = nums.get(i);
  *  nums.set(i, nums.get(i + 1)); 
  *  nums.set(i+ 1, temp);
  *  swapped = true; } } } ****
*/
//swapped = true;
//}

//}

   
