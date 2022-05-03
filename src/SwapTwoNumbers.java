import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Numbers : ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Before swap: A= " +a);
        System.out.println("before swap: B= " +b);

        if (a!=0 && b!=0)
        {
            int temp=0;
            temp=a;
            a=b;
            b=temp;
            System.out.println("After swap: A= " +a);
            System.out.println("After swap: B= " +b);
        }

    }
}
