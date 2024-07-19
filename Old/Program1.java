interface operation {
    public void add(int a, int b);

    public void subs(int a, int b);
}

class A implements operation {
    public void add(int a, int b) {
        System.out.println(a + b + "\n");
    }

    public void subs(int a, int b) {
        System.out.println(a - b + "\n");
    }
}

public class Program1 {
    public static void main(String[] args){
        A ob = new A();
        ob.add(10, 2);
        ob.subs(10, 2);
    }
}
