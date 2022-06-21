import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double kilo,boy,hesapla;

        System.out.print("Lutfen boyunuzu(metre cinsinden) giriniz : ");
        boy = scan.nextDouble();
        System.out.print("Lutfen kilonuzu giriniz : ");
        kilo = scan.nextDouble();
        hesapla = kilo/(boy*boy);
        System.out.println("Vucut kitle indeksiniz : "+hesapla);
    }
}
