// Online Java Compiler
// Use this editor to write, compile and run your Java code online
interface Playable
{
    public void play();
    public void rest();
    public void happy();
}

class Football implements Playable{
    public void play(){
        System.out.println("I am playing football!");
    }
    public void rest(){
        System.out.println("I am resting!");
    }
    public void happy(){
        System.out.println("I am happy and playing football !");
    }
}
class Volleyball implements Playable{
    public void play(){
        System.out.println("I am playing volleyball!");
    }
    public void rest(){
        System.out.println("I am resting!");
    }
    public void happy(){
        System.out.println("I am happy and playing volleyball !");
    }
}
class Basketball implements Playable{
    public void play(){
        System.out.println("I am playing basketball!");
    }
    public void rest(){
        System.out.println("I am resting!");
    }
    public void happy(){
        System.out.println("I am happy and playing basketball !");
    }
}

class Main{
    public static void main(String[] args) {
        Football f1 = new Football();
        f1.play();
        f1.rest();
        f1.happy();
        Volleyball v1 = new Volleyball();
        v1.play();
        v1.rest();
        v1.happy();
        Basketball b1 = new Basketball();
        b1.play();
        b1.rest();
        b1.happy();
    }
}