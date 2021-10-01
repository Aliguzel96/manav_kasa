package giris;
import java.util.Scanner;

public class manavKasa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int armut, elma, domates, muz, patlican;
        double tutar;

        System.out.print("Kac kilo Armut: ");
        armut = input.nextInt();
        System.out.print("Kac kilo Elma: ");
        elma = input.nextInt();
        System.out.print("Kac kilo Domates: ");
        domates = input.nextInt();
        System.out.print("Kac kilo Muz: ");
        muz = input.nextInt();
        System.out.print("Kac kilo Patlican: ");
        patlican = input.nextInt();

        tutar = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5.0);
        System.out.println("Toplam tutar: " + tutar);
    }
}
