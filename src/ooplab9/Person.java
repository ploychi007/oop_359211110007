package ooplab9;

public class Person {
    private  String name;
    private  String personID;
    private  Address address;
    private  Job job;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", personID='" + personID + '\'' +
                ", address=" + address +
                ", job=" + job +
                '}';
    }

    public Person(String name, String personID, Address address, Job job) {
        this.name = name;
        this.personID = personID;
        this.address = address;
        this.job = job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Job getJob() {
        return job;
    }

    public void setJob(Job job) {
        this.job = job;
    }
}
