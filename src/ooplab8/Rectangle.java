package ooplab8;

import javafx.scene.shape.Shape;

public class Rectangle extends Shape {
    public  Rectangle(int width,int length){
        super|(width,length);
    }
    @Override
    public  double getArear(){
        return  super.getWidth()*super.getLength(); //ต้องเียกใช้ด้วยคำสั่ง super
    }
}//class
