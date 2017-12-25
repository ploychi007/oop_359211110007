package ooplab6;

public class myStrBuffer {
    public static void main(String[] args) {
// StringBuffer
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello");
        buffer.append(" ");
        buffer.append("t0");
        buffer.append(" ");
        buffer.append("RMUTSV");
        buffer.append(" ");
        buffer.append(2017);
        System.out.println(buffer);
        buffer.replace(0,5,"UniverSity");
        System.out.println(buffer);
        System.out.println(buffer.reverse());
        buffer.setCharAt( 0,'T');

    }//main
}//class
