import java.util.Scanner;

public class HarmonicNumber {

    public void nthHarmonic()
    {
        float harmonic = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Harmonic Numbers : ");
        int N = scanner.nextInt();

        for (int i = 2; i <= N; i++)
        {
            harmonic += (float) 1 / i;
            // System.out.println("1/"+i);
        }
        System.out.println("Total Of HarmonicNumbers: " +harmonic );


    }
    public static void main (String[] args) {
        HarmonicNumber p = new HarmonicNumber();
        p.nthHarmonic();

    }

}
