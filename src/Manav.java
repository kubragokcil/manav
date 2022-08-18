import java.util.Scanner;
public class Manav {
    public static void main(String[] args) {
        double tutar, elmafiyat=2.14, muzfiyat=0.95, domatesfiyat=1.11,armutfiyat=3.67, patlicanfiyat=5;
        int muzkilo, armutkilo, domateskilo, elmakilo, patlicankilo;

        Scanner  input = new Scanner(System.in);

        System.out.println("Kaç kilo domates aldınız?");
        domateskilo=input.nextInt();

        System.out.println("Kaç kilo elma aldınız?");
        elmakilo=input.nextInt();

        System.out.println("Kaç kilo muz aldınız?");
        muzkilo=input.nextInt();

        System.out.println("Kaç kilo armut aldınız?");
        armutkilo=input.nextInt();

        System.out.println("Kaç kilo patlıcan aldınız?");
        patlicankilo=input.nextInt();
        tutar= (patlicankilo*patlicanfiyat)+(elmakilo*elmafiyat)+(muzkilo*muzfiyat)+(domateskilo*domatesfiyat)+(armutkilo*armutfiyat);

                System.out.println("Toplam tutar" + tutar);
    }
}
