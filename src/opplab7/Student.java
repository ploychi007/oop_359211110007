package opplab7;

public class Student {
    public  static  String faculty = "Management Techology";
    private  String id;
    private  String name;
    private  String major;
    private  String group;
    //construtor
    //defult

    public  Student(){}
    public  Student (String id, String n, String m, String g){
        this.id = id;
        this.name = n;
        this.major = m;
        this.group = g;
    }

    public  void  setId (String id){
        this.id = id;
    }//setID
    public  String getId (){
        return this.id;
    }//getID

    public  void  setName (String name){
        this.name = name;
    }//setName
    public String getName (){
        return  this.name;
    }//getName

    public  void  setMajor (String major){
        this.major = major;
    }
    public  String getMajor (){
        return  this.major;
    }

    public  void  setGroup (String group){
        this.group = group;
    }
    public  String getGroup (){
        return  this.group;
    }
}//class
