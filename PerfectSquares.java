// Java program to display all the perfect square numbers between two input number interval

import java.util.Scanner;

public class PerfectSquares {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);

        //Read user input.
        System.out.print("Enter the initial value:");
        int initialValue = sc.nextInt();
        System.out.print("Enter the final value:");
        int finalValue = sc.nextInt();

        //finding the perfect square numbers
        System.out.print(String.format("The perfect squares between %d and %d are:\n", initialValue, finalValue));
        for(int i=initialValue; i<= finalValue; i++) {
            if(Math.sqrt(i) == (int)(Math.sqrt(i))){
                System.out.print(String.format("%d\t", i));
            }
        }
    }
}
