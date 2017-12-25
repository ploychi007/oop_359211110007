package ooplab4;

public class OperatorArray {
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 4, 5};
        int num2[] = num;
        int num3[] = {1, 2, 3, 4, 5};
        if (num == num3) //ชี้คนละตำแหน่งกัน เป็นเท็ข
            System.out.println("true");
        else
            System.out.println("false");
        if (num == num2)// เป็นเท็จ
            System.out.println("true");
        else
            System.out.println("false");
    }
}
