import java.util.Scanner;

public class EX2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci la prima parola");
        String firstWord = sc.nextLine();
        System.out.println("Inserisci la seconda parola");
        String secondWord = sc.nextLine();
        System.out.println("Inserisci la terza parola");
        String thirdWord = sc.nextLine();

        System.out.println(concatanation(firstWord, secondWord, thirdWord));


        sc.close();
    }

    public static String concatanation(String a, String b, String c) {
        return a + " " + b + " " + c + " " + c + " " + b + " " + a;
    }

}