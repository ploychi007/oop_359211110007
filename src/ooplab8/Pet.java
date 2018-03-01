package ooplab8;

public class Pet {
    private  String name;
    private  String harircolor;
    private  String gender;
    private  int age;

    public  void  makeNoise(){}

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", harircolor='" + harircolor + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public Pet(String name, String harircolor, String gender, int age) {
        this.name = name;
        this.harircolor = harircolor;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHarircolor() {
        return harircolor;
    }

    public void setHarircolor(String harircolor) {
        this.harircolor = harircolor;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
