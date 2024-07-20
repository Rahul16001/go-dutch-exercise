package com.epam.rd.autotasks.godutch;

import java.util.Scanner;

public class GoDutch {

    public static void main(String[] args) {
        //Write code here
        int billAmount;
        int numberOfFriends;
        Scanner scan = new Scanner(System.in);
        billAmount = scan.nextInt();
        numberOfFriends = scan.nextInt();


        if(billAmount < 0) System.out.println("Bill total amount cannot be negative");
        else if(numberOfFriends <= 0) System.out.println("Number of friends cannot be negative or zero");
        else {
            int total = (int)(1.1 * billAmount);
            int moneyDivide = total / numberOfFriends;
            System.out.println(moneyDivide);
        }


    }
}
