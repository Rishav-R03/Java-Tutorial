/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author 91931
 */
public class Student{
    private String name;
    private int age;
    
    public Student(String name,int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public class Main{
    public static void main(String [] args){
        Student s1 = new Student("Rishav",21);
        Student s2 = new Student("Pranjal",20);
        System.out.println(s1.getName() + " is " + s1.getAge() + " years old.");
        System.out.println(s2.getName() + " is " + s2.getAge() + " years old.");
        }
    }
}


