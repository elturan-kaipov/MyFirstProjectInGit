package Encapsulation;

public class Person {
    String firstName;
    String lastName;
    int age;

    public Person(){
        System.out.println("======Person Info======");
        lastName=firstName="undefined";
        age=-1;
    }

    public Person(String firstName, String lastName, int age){
        System.out.println("======Person Info======");
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public int getAge(){
        return  age;
    }
    public void setAge(int age){
        this.age=age;
    }
    public String toString(){
        return getFirstName()+"|"+getLastName()+"|"+getAge();
    }

}
