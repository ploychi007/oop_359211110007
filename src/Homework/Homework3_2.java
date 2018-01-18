package Homework;
import  java.util.Scanner;
public class Homework3_2 {
    public static void main(String[] args) {
        int id = getID();
        String name = getName();
        float sal = getSalary();
        float ov =getOverTime();
        System.out.println("----------information----------");
        ShowDataInfo(id,name,sal,ov);

    }//main

    public static int getID() {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter ID: ");
        int ID = in.nextInt();
        return  ID;
    }

    public static String getName() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you Name: ");
        String name=in.nextLine();
        return name;
    }

    public static float getSalary() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you salary: ");
        float Salary = in.nextFloat();
        return Salary;
    }


    public static float getOverTime() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter you Overtime: ");
        float overTime = in.nextFloat();
        return overTime;
    }

    public static void ShowDataInfo(int id,String name,float sal,float ov) {
        Homework3_2 x = new Homework3_2();
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Salary:"+sal);
        System.out.println("OverTime:"+ov);
        System.out.println("Tax is:"+x.calculatetax(sal,ov));
        
    }

    private int calculatetax(float x, float y) {
        float sum=y+x;
        if (sum>=100000){
            return  10;
        }
        else  if (sum>=70000){
            return  7;
        }
        else  if (sum>=50000){
            return  5;
        }
        else  if (sum>=30000){
            return  3;
        }
        else {
            return  1;
        }
    }

}//class//
