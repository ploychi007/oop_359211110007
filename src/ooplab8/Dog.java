package ooplab8;

public class Dog {
    //Dog is sup-class
    //Pet is super-class
    //SubClass ใหญ่กว่า superClass คือ Pet

    //superClass คือ Dog
    public  class  Dog extends  Pet{
        public Dog(String name,String harircolor,String gender,int age){
            super(name,harircolor,gender,age);//เรียกใช้งานจาก superClass
        }
        @Override
        public  void  makeNoise(){
            System.out.println("Box Box!!!");
        }
    }
}
