import java.util.Scanner;

public class HeadAndTails {
    public void coinPercentage ()
    {
        int heads = 0;
        int tails =0;
        float t=0,h=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number Of times For Flip Coin : ");
        int N = scanner.nextInt();
        for (int i=1 ; i<=N;i++) {
            if (Math.random() < 0.5) {
                System.out.println("Heads");
                heads = heads + 1;
            } else {
                System.out.println("Tails");
                tails = tails+1;

            }

        }
        t = (tails*(100/N));
        h = (heads*(100/N));
        System.out.println("Percentage of Tails:"  +t);
        System.out.println("Percentage of Heads:"  +h);

    }
    public static void main(String[] args) {
        HeadAndTails ht = new HeadAndTails();
        ht.coinPercentage();
    }
}
