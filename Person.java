package OOP;

public class Person {
    //Private properties(Encapsulation)
    private String name;
    private int age;
    public Person(String name) {
        this.name = name;
        this.age = 18; //Default age
    }
    //Method to display the name of person
    public void display(){
        System.out.println("Persons Name:"+name);
        System.out.println("Age:"+age);
    }

}
