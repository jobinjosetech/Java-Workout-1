// Java program to generate a triangle.

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);

        //Read user input.
        System.out.print("Enter the limit value:");
        int limitValue = sc.nextInt();

        //Nested loop to print the corresponding triangle.
        for(int i=0; i<=limitValue; i++) {
            for(int j=0; j<i; j++) {
                System.out.print(String.format("%d\t", i));
            }
            System.out.print("\n");
        }
    }
}
