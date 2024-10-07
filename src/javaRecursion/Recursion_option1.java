package javaRecursion;

/*
 
 * Description: This program allows a user to input five numbers and calculates the product of 
 *              those numbers using a recursive method. The program uses an array to store the 
 *              numbers and a recursive function to compute the product by multiplying each 
 *              number in sequence. The program demonstrates basic recursion and user input 
 *              handling in Java.
 */

import java.util.Scanner;

public class Recursion_option1 {

    // Recursive method to calculate the product of an array of numbers
    public static int product(int[] numbers, int index) {
        // Base case: if index reaches the length of the array, return 1 (multiplicative identity)
        if (index == numbers.length) {
            return 1;
        }
        // Recursive case: multiply the current number by the product of the remaining numbers
        return numbers[index] * product(numbers, index + 1);
    }

    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);
        
        // Array to store five numbers entered by the user
        int[] numbers = new int[5];

        // Prompt the user to input five numbers
        System.out.println("Enter 5 numbers:");

        // Loop to take user input and store numbers in the array
        for (int i = 0; i < 5; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();  // Store the number in the array
        }

        // Close the Scanner to avoid resource leaks
        scanner.close();

        // Calculate the product of the numbers using the recursive method
        int result = product(numbers, 0);

        // Output the result
        System.out.println("The product of the five numbers is: " + result);
    }
}
