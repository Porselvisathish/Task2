package OOP;

//Base class
 class Person1 {
    String name;
    int age;
    //Constructor for Person1
    public Person1(String name,int age){
        this.name=name;
        this.age=age;
    }
    //Method to display person details
    public void displayPersonInfo(){
        System.out.println("Name"+name);
        System.out.println("Age:"+age);
    }
}
