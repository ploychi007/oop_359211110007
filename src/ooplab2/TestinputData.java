package ooplab2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestinputData {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        System.out.print("What is your name? :");
        String name = reader.readLine();
        System.out.println("Your name is name" + name);
        System.out.print("How old are you?: ");
        int age = Integer.parseInt(reader.readLine());
        System.out.println("You are " + age + " years old.");
        //Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Where are you?: ");
        String address = scanner.nextLine();
        System.out.println("Tou form: " + address);
        System.out.println("Tou form: " + address);
    }//main
}//class
