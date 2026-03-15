package Javabasics;
//import java.util.*;
import java.util.Scanner;


public class Day1EvenOdd {
    public static void main(String[] args) {
        //Even or Odd number
        int a = 200;
        //Static value
        if (a%2==0){
            System.out.println("Even");
        }else
            System.out.println("Odd");


        //Dynamic values
        Scanner obj01 = new Scanner(System.in);//Value Scanner class only.
        System.out.println("Enter the Number : b");
        int b=obj01.nextInt();
        if (b%2==0){
            System.out.println("Even");
        }else
            System.out.println("Odd");
    }

// this is second code I have pushed from IDE.

}
