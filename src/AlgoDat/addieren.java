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
        int[] result = new int[array1.length];


        for (int i = 0; i < Zahl1.length(); i++) {
            array1[i] = Zahl1.charAt(i);
        }
        for (int i = 0; i < Zahl2.length(); i++) {
            array2[i] = Zahl2.charAt(i);
        }
        int[] Intarray1 = new int[array1.length];
        int[] Intarray2 = new int[array2.length];

        for (int i=0;i< array1.length;i++){
            Intarray1[i] = Integer.parseInt(String.valueOf(array1[i]));
        }

        for (int i = array1.length -1; i <=0; i--) {
            result[i]= Intarray1[i] + Intarray2[i];

        }


        for (int i=0;i< array1.length;i++){
            System.out.println(result[i]);
        }


    }
}
