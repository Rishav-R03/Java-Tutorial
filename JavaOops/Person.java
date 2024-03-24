package JavaOops;

public class Person {
    private String name;
    private int age;
    public Person(String name, int age){
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
        Person p1 = new Person("Rishav", 21);
        p1.getName();
        p1.getAge();
    }
}
