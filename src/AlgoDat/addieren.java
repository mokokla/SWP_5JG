package AlgoDat;
import java.util.Scanner;

public class addieren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("erste Zahl: ");
        String Zahl1 = scanner.nextLine();
        System.out.println("zweite Zahl: ");
        String Zahl2 = scanner.nextLine();

        char[] array1 = new char[Zahl1.length()];
        char[] array2 = new char[Zahl2.length()];

        for (int i = 0; i < Zahl1.length(); i++) {
            array1[i] = Zahl1.charAt(i);
        }
        for (int i = 0; i < Zahl2.length(); i++) {
            array2[i] = Zahl2.charAt(i);
        }

        //int number = Integer.parseInt(str);

    }
}
