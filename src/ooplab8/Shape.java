package ooplab8;
//Abstract class
public abstract class Shape {
    private  int width;
    private  int length;

    public  abstract  double getArea();//Abstrct Methord ต่างคือมี ;คราสใดที่จะสืบทอด ต้องทำการ abstract int ใหม่

    public  Shape(int width,int length){
        this.width=width;
        this.length=length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }


}
