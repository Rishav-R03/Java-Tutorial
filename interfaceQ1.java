interface shape{
    public void draw();
}
class circle implements shape{
    public void draw(){
        System.out.println("This is circle \n");
    }
}
class rectangle implements shape{
    public void draw(){
        System.out.println("This is rectangle ");
    }
}

class Main{
    public static void main(String [] args){
        circle ob = new circle();
        ob.draw();
        rectangle ob1 = new rectangle();
        ob1.draw();
    }
}