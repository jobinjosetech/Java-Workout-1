// Java program to check whether the given string is palindrome or not

import java.util.Scanner;

public class Palindrome {
    public static void main(String a[]) {
        String tempString = "";
        Scanner sc = new Scanner(System.in);

        //Read user input.
        System.out.print("Enter the String:");
        String userString = sc.next();

        //Reversing and storing the string to another variable
        for(int i = userString.length()-1; i>=0; i--) {
            tempString = tempString + userString.charAt(i);
        }
        //checks the two string values are equal or not
        if(userString.equals(tempString)) {
            System.out.println(userString +" is palindrome");
        }
        else {
            System.out.println(userString + " is not palindrome");
        }
    }
}
