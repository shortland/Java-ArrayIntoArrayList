// This can easily be accomplished with for-loops.
// I'm purposely accomplishing this using recursion.

import java.util.ArrayList;

public class TurnArrayToArrayList {
	public static void main(String[] args) {
		int[] intArray = {10, 3, 5, 9};

		ArrayList<Integer> intArrayList = new ArrayList();
		makeIntIntoInteger(intArrayList, intArray, 0);

		// only using for-loop to print the results, not necessary in functionality.
		/*
		for(int i = 0; i < intArrayList.size(); i++)
			System.out.println(">" + intArrayList.get(i));
		*/

		// alternatively print the results using recursion
		printArrayListContentsUsingRecursion(intArrayList, 0);
	}

	public static void printArrayListContentsUsingRecursion(ArrayList<Integer> intList, int pos) {
		if(pos < intList.size()) {
			System.out.println(intList.get(pos));
			printArrayListContentsUsingRecursion(intList, pos+1);
		}
	}

	public static ArrayList<Integer> makeIntIntoInteger(ArrayList<Integer> intList, int[] array, int pos) {
		if(pos >= array.length) 
			return intList;
		else {
			intList.add(array[pos]);
			return makeIntIntoInteger(intList, array, pos+1);
		}
	}
}