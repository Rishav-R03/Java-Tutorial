// package JavaOops;

public class Person1{
    private String name;
    private int age;
    public Person1(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
class Main{
    public static void main(String[] args){
        Person1 p1 = new Person1("Rishav", 21);
        p1.getName();
        p1.getAge();
    }
}
