interface Person{
    public void displayName();
    public void displayAge();
}
class person implements Person{
      public void displayName(){
        System.out.println("Rishav");
      }
      public void displayAge(){
        System.out.println(21);
      }
}
class Main{
    public static void main(String [] args){
        person ob = new person();
        ob.displayName();
        ob.displayAge();
    }
}