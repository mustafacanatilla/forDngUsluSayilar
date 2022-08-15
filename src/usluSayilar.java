import java.util.Scanner;

public class usluSayilar {
    public static void main(String[] args) {
        int number1, number2;
        Scanner inp = new Scanner(System.in);
        System.out.print("Üssü Alınacak Sayıyı Giriniz:");
        number1 = inp.nextInt();
        System.out.print("Üs Olacak Sayıyı Giriniz:");
        number2 = inp.nextInt();

        int total = 1;

        for (int i = 1; i <= number2; i++) {
            total *= number1;
        }
        System.out.println(number1 + " Sayısının Üssü:" + total);
    }
}
