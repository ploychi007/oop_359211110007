package ooplab6;

public class myString {
    public static void main(String[] args) {
        String msgl = "ploychawisa";
        System.out.println(msgl);
        char []c = {'H','e','l','l','o'};
        String msg2 = new String(c);
        System.out.println(msg2);

        //concatenation string
        //type 1 (+)
        String msg3 = msg2 +" "+ msgl;
        System.out.println(msg3);
        System.out.println(msg3.length());//การนับตัวอักษร
        //type 2 (concat())
        String msg4 = msg3.concat(" RMUTSV");
        System.out.println(msg4);
        System.out.println(msg4.toLowerCase());//แปลงตัวอักษรเป็นตัวพิมพ์เล็ก
        System.out.println(msg4.toUpperCase());//แปลงตัวอักษรเป็นตัวพิมพืใหญ่
        System.out.println(msg4.substring(1,5));//ตัดตัวอักษร

        String  msg5 = " Hello ";
        System.out.println("*"+msg5+"*");
        System.out.println("*"+msg5.trim()+"*");//ตัดตัวอักษรซ้ายขวา

    }//main

}//class
