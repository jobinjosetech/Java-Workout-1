// Java program to generate fibonacci series up to the given number using recursion

import java.util.Scanner;

public class FibonacciSeries {

    // Returns the fibonacci number
    public static int fibonacci(int n) {
        if(n <= 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);

        //Read user input.
        System.out.print("Enter the limit value:");
        int limitValue = sc.nextInt();

        //Display fibonacci series up to the limit using recursion
        for(int i=0; i<limitValue; i++) {
            //Check whether the number is lesser than or equal to the limit value
            if(fibonacci(i) <= limitValue) {
                System.out.print(String.format("%d,\t", fibonacci(i)));
            }
            else {
                break;
            }
        }
    }
}
