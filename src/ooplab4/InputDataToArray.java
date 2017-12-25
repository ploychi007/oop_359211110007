package ooplab4;

import java.util.Scanner;
//สิ่งที่ต้องทำ
//1. daclare array as Integer
//2. allow user to input data into array
//3. show data in array
public class InputDataToArray {
    private  static  int MAX = 5;
    public static void main(String[] args) {
        Integer[] num  = new Integer[MAX];
        //int[] num2 = new int [MAX];
        num = InputData(num);
showData(num);

    }//main

    private static void showData(Integer[] num) {
        System.out.println("Data in array ");
//        for (int i = 0; i < num.length; i++){
//            System.out.print(num[i] + " ");
//        }
        //enchace loop
        for (int i:num){
            System.out.println(i+" ");
        }
        System.out.println();
    }

    private static Integer[] InputData(Integer[] num) {
        Scanner scanner = new Scanner(System.in); // รับค่า ค่าข้อมูล integer
        System.out.println("Please  enter an integer: ");
        for (int i=0;i<num.length;i++){
            System.out.print("num["+i+"]: ");
            num[1] = scanner.nextInt();

        }
        return num;
    }
}
