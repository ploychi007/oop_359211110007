package ooplab3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CalGrade {
//    score 0-49 grade F
//    score 50-59 grade D
//    score 60-69 grade C
//    score 70-79 grade B
//    score 80-100 grade A
public static void main(String[] args) {
    //BufferedReader
    BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
    System.out.print("Enter your Score: ");
    int a=70 ;
    if (a<50){
        System.out.println("Your grade F");
    }
    else if (a<=59){
        System.out.println("Your grade D");
    }
    else if (a<=69){
        System.out.println("Your grade C");
    }
    else if (a<=79){
        System.out.println("Your grade B");
    }
    else {
        System.out.println("Your grade A");
    }

}

}//calss
