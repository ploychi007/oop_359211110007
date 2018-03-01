package ooplab8;

public class Trangle extends Shape {
    private  int high;

    public  int getHigh(){
        return  high;
    }
    public  void setHigh(int high){
        this.high = high;
    }
    public  Triangle(int width,int lenght,int high){
        super(width,lenght);
        this.high=high;
    }
    @Override
    public  double getArea(){
        return super.getWidth()*high*0.5;
    }
}
