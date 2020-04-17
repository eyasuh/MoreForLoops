import java.util.Scanner;

public class MoreForLoops {
    public static void main(String[] args) {
        //Scanner object
        Scanner in = new Scanner(System.in);
        //Write a program that prints all the odd numbers from 1-20.
        //use the modulo to get the remainder and if it's not zero then it means it's an odd number
        System.out.println("Odd numbers 1-20");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 > 0) System.out.print(i +" ");
        }
        //Write a program that prints all the even numbers from 1-20.
        //same concept as above but when remainder is zero it is even
        System.out.println("\nEven numbers 1-20");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) System.out.print(i + " ");
        }
        System.out.println("\nReversed string");
        // Write a program to reverse a string.
        // start from String.length - 1 and decrement till 0
        String str = "Program";
        for (int i = str.length()-1; i >=0; i-- ){
            System.out.print(str.charAt(i));
        }
        //Write a program that display all the factors of a number.
        //
        int num = 20;
        System.out.println("\nFactors of number");
        for (int i = 1; i < num; i++){
            if (num%i == 0) System.out.print(i + ",");
        }
        //Write a program that computes the factorial of a number.
        // start with f = 1 * i which starts at 2, then increment i
        int numFactorial = 5;
        int f = 1;
        System.out.println("\nFactorial of a number");
        for (int i = 2; i <= numFactorial; i++) {
            f *= i;
        } System.out.print(f);



         }

}
