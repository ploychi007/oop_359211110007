package ooplab9;

public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person(
                "chawisa","359211110007",
                new Address("6 M.3","Nokonsitmmarat",
                        "80250"),
                new Job("Teacher","25000"));

        System.out.println(person.toString());

    }
}
