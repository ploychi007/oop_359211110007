package ooplab4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class myArray2D {
    public static void main(String[] args) throws IOException {
        int num[][] = new int[2][3];// 2แนวนอน 3 แนวตั้ง จะได้ตาราง 2*3=6
//        num [0] [0] = 1;
//        num [0] [1] = 2;
//        num [0] [2] = 3;
        num = inputData2D(num);
        showData(num);
    }//main

    private static void showData(int[][] num) {
        System.out.print("Data in array 2D: ");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[1].length; j++) {
                System.out.print(num[i][j] + " ");
            }//j วนแถวแนวตั้ง
            System.out.println();
        }//i วนแถวแนวนอน
        System.out.println();
    }//showdata2D

    private static int[][] inputData2D(int[][] num) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));//สร้างoj ที่ชื่อ Reader
        System.out.print("Enter as integer: ");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[1].length; j++) {
                System.out.print("num[" + i + "][" + j + "]: ");
                num[i][j] = Integer.parseInt(reader.readLine());
            }//j วนแถวแนวตั้ง
        }//i วนแถวแนวนอน
        return num;
    }//inputData//

}//class
