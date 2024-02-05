import java.util.Scanner;

class Adding_num {
    public static void main(String[] args) {
        System.out.println("Enter numbers : ");
        int num1;
        int num2;
        Scanner s = new Scanner(System.in);
        num1 = s.nextInt();
        num2 = s.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is : " + sum);
    }
}
