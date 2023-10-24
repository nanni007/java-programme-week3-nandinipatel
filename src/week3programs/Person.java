package week3programs;
//Write a class with the name Person. The class needs three fields (instance variables) with the names
//firstName, lastName of type String and age of type int.

public class Person {

   String firstName;
   String lastName;
   int age;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String setFirstName(String firstName1) {
        return firstName=firstName1;
    }

    public String setLastName(String lastName1) {
        return lastName=lastName1;
    }
public int setAge(int age1){
        if(age1<0||age1>100) {
            age = 0;
        }
        return age=age1;
}
public boolean isTeen(){
        boolean z=false;
        if(age>12&&age<20){
            z=true;
        }else{
            z=false;
        }
        return z;
}
public String getFullName(){
        return firstName + " "+ lastName;
}

    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("");   // firstName is set to empty string
        person.setLastName("");    // lastName is set to empty string
        person.setAge(10);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setFirstName("John");    // firstName is set to John
        person.setAge(18);
        System.out.println("fullName= " + person.getFullName());
        System.out.println("teen= " + person.isTeen());
        person.setLastName("Smith");    // lastName is set to Smith
        System.out.println("fullName= " + person.getFullName());
    }
}

