/**
 * Java 1. Homework 3
 *
 * @author Andrey Usmanov
 * @version 16.10.2021
 */
 import java.util.Arrays;
         
 class Lessons3HomeWork {
            
    public static void main(String[] args) {
        invertArray();
        fillArray();
	    changeArray();
		fillDiagonal();
		int[] arrFive = fillArray(10,7);
	    System.out.println(Arrays.toString(arrFive));

    }
    
    static void invertArray() {
        int[] numbers = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int a = 0; a < numbers.length; a++ ) {
            numbers[a] = 1- numbers[a];
            System.out.println(numbers[a]);
        }
    }
    
    static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++ ) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }
	
    static void changeArray() {
        int[] arrThree = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int a = 0; a < arrThree.length; a++ ) {
            if (arrThree[a] < 6) {
				arrThree[a] *= 2;
			}
        }
		System.out.println(Arrays.toString(arrThree));
    }
	
	static void fillDiagonal() {
        int[][] matrix = new int[5][5];
        for (int a = 0; a < matrix.length; a++ ) {
            matrix[a][a] = 1;
			matrix[a][matrix.length - a - 1] = 1;
		}
		for (int a = 0; a < matrix.length; a++ ) {
		    System.out.println(Arrays.toString(matrix[a]));
		}
    }
	
	static int[] fillArray(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
		return arr;
    } 
}