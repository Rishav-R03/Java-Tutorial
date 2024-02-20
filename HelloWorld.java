// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        int num;
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        for(int i = 1;i<11;i++){
            if(i%2==0){
            System.out.println(num*i);
                break;
            }
        }
    }
}