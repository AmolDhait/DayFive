import java.util.Scanner;

public class VowelrOrConsonant {
    public void checkVowelOrConsonant()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Char : ");
        char ch = scanner.next().charAt(0);

        if( ch == 'i' || ch == 'o' || ch == 'u' || ch == 'e' || ch == 'a'
                || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'E' || ch == 'A' )
        {
            System.out.println(ch +" :Is Vowel");
        }
        else
        {
            System.out.println(ch +" :Is Consonant");
        }
    }

    public static void main(String[] args) {
        VowelrOrConsonant vc = new VowelrOrConsonant();
        vc.checkVowelOrConsonant();
    }

}
