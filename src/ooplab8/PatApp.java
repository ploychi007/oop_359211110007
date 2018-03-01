package ooplab8;
//เป็นแอพที่ใช้ติดต่อกับผู้ใช้
//Application for Pet,Dog,and Cat Class
public class PatApp {
   public static  void  main(String[]args){
       Dog dog =new Dog("Bow","Whigth","Female",2);

       System.out.println(dog.toString());

       Cat cat=new Cat("Samock","gray","Female",3);

       System.out.println(cat.getClass()+cat.toString());

       dog.makeNoise();
       cat.makeNoise();
   }

}
