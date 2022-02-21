import java.util.Scanner;

public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Armut: 2,14 TL " +
                "Elma: 3,67 TL " +
                "Domates: 1,11 TL " +
                "Muz: 0,95TL TL " +
                "Patlıcan: 5,00TL");
        System.out.print("Armut Kaç Kilo? :");
        double armut = inp.nextDouble();
        System.out.print("Elma Kaç Kilo? :");
        double elma = inp.nextDouble();
        System.out.print("Domates Kaç Kilo? :");
        double domates = inp.nextDouble();
        System.out.print("Muz Kaç Kilo? :");
        double muz = inp.nextDouble();
        System.out.print("Patlıcan Kaç Kilo? :");
        double patlican = inp.nextDouble();
        double toplam = (armut*2.14) + (elma*3.67) + (domates*1.11) + (muz*0.95) + (patlican*5);
        System.out.print("Toplam Tutar: " +toplam);

    }
}
