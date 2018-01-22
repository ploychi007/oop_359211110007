package opplab7;

public class SuperCar {
    public  void getSupercarcarInfo(){
        System.out.println("SuperCar info:");
        System.out.println("CarBrand:"+this.brand);
        System.out.println("CarColor:"+this.color);
        System.out.println("CarEnginesize:"+this.enginesize);
        System.out.println("CarMaxspeed:"+this.maxspeed);
        System.out.println("CarCountry:"+this.country);
    }
    private  String brand;
    private  String color;
    private  String enginesize;
    private  String maxspeed;
    private  String country;

    public SuperCar(){}
    public SuperCar(String b,String c,String e
    ,String m,String co){
        this.brand = b;
        this.color = c;
        this.enginesize = e;
        this.maxspeed = m;
        this.country = co;

    }

    public  void  setBrand (String brand){
        this.brand = brand;
    }//setID
    public  String getBrand (){
        return this.brand;
    }//getID

    public  void  setColor (String color){
        this.color = color;
    }
    public  String getColor(){
        return this.color;
    }
    public  void  setEnginesize (String enginesize){
        this.enginesize = enginesize;
    }
    public  String getEnginesize(){
        return this.enginesize;
    }
    public  void  setMaxspeed (String maxspeed){
        this.maxspeed = maxspeed;
    }
    public  String getMaxspeed(){
        return this.getEnginesize();
    }
    public  void  setCountry (String country){
        this.country= country;
    }
    public  String getCountry(){
        return this.getCountry();
    }
}



