// Java program to find whether the given input character is vowel or consonant using switch statement.

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String a[]) {
        Scanner sc = new Scanner(System.in);

        //Read user input.
        System.out.print("Enter the character:");
        char charValue =  sc.next().charAt(0);

        //Check the vowels
        switch (Character.toLowerCase(charValue)) {
            case 'a':
                System.out.println(String.format("%c is a vowel", charValue));
                break;
            case 'e':
                System.out.println(String.format("%c is a vowel", charValue));
                break;
            case 'i':
                System.out.println(String.format("%c is a vowel", charValue));
                break;
            case 'o':
                System.out.println(String.format("%c is a vowel", charValue));
                break;
            case 'u':
                System.out.println(String.format("%c is a vowel", charValue));
                break;
            default:
                System.out.println(String.format("%c is a consonant", charValue));
                break;
        }
    }
}
