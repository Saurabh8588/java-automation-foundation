package Javabasics;

import javax.swing.text.Style;

public class Day1Basics {

    String stg = "Automation";
        public static void main(String [] args){
            System.out.println("Name: Saurabh Shukla.");
            System.out.println("Role : QA Automation Engineer.");
            System.out.println("Task : Learning.");

            Day1Basics obj = new Day1Basics();
            System.out.println("stg length: "+obj.stg.length());//get length of String.
            //Reverse a stg
            for (int i=obj.stg.length()-1; i>=0;i-- )
            System.out.print(obj.stg.charAt(i));

    }
}
