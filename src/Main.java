import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.00;
        int armutkg, elmakg, domateskg, muzkg, patlicankg;
        double toplam;

        Scanner inp = new Scanner(System.in);

        System.out.print("Armut Kac Kilo? ");
        armutkg = inp.nextInt();
        System.out.print("Elma Kac Kilo? ");
        elmakg = inp.nextInt();
        System.out.print("Domates Kac Kilo? ");
        domateskg = inp.nextInt();
        System.out.print("Muz Kac Kilo? ");
        muzkg = inp.nextInt();
        System.out.print("Patlican Kac Kilo? ");
        patlicankg = inp.nextInt();

        toplam = (armutkg*armutkg) + (elmakg*elma) + (domateskg*domates) + (muzkg*muz) + (patlicankg*patlican);

        System.out.println("Toplam Tutar: " + toplam + " TL");
    }
}