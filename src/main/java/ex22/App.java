/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Mauricio Rios
 */
package ex22;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();
        int num1 = myApp.getFirst();
        int num2 = myApp.getSecond();
        int num3 = myApp.getThird();
        int largest = myApp.getLargest(num1, num2, num3);
        String outputString = myApp.generateOutputString(largest);
        myApp.printOutput(outputString);
    }

    public int getFirst() {
        System.out.print("Enter the first number? ");
        return in.nextInt();
    }
    public int getSecond() {
        System.out.print("Enter the second number? ");
        return in.nextInt();
    }
    public int getThird() {
        System.out.print("Enter the third number? ");
        return in.nextInt();
    }

    public int getLargest(int num1, int num2, int num3) {
        if(num1 > num2 && num1 > num3)
            return num1;
        else if(num2 > num1 && num2 > num3)
            return num2;
        else
            return num3;
    }

    public String generateOutputString(int largest) {
        return "The largest number is "+largest+".";
    }

    public void printOutput(String outputString) {
        System.out.print(outputString);
    }
}





