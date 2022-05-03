import java.util.Scanner;

public class PowerOfTow {
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number : ");
        int n = scanner.nextInt();

        int i = 0;
        int powerOfTwo1 = 1;
        if (i <= n && n<31) {
            while (i <= n) {
                System.out.println(+powerOfTwo1);
                powerOfTwo1 = 2 * powerOfTwo1;
                i = i + 1;
            }
        }
        else {
            System.out.println("overflows an int");
        }

    }
}
