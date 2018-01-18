package Homework;

import java.util.Scanner;

public class Homework3_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Homework3_1 x = new Homework3_1();
        for (int i = 1;i<4;i++){
            System.out.print("Enter year "+i+" : ");
            int a = in.nextInt();
            System.out.println("Age"+i+":"+x.calculate(a));
        }
        System.out.println("Thank you.");
    }//main

    private int calculate(int x) {
        int sum;
        return  sum = 2561-x;
    }
}//class
