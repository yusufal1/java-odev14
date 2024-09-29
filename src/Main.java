import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double kmBasinaUcret = 0.10, km, biletFiyati;
        int yas, yolculukTipi;

        System.out.print("Gidilecek mesafeyi giriniz: ");
        km = input.nextDouble();

        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.println("1-Tek Yön\n2-Gidiş-Dönüş");
        yolculukTipi = input.nextInt();

        if(km < 0 || yas < 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı veri girdiniz!");
        } else {
            if(yas < 12) {
                if(yolculukTipi == 1) {
                    biletFiyati = (km*kmBasinaUcret)*0.5;
                    System.out.println("Bilet Fiyatı: " + biletFiyati);
                }
                else {
                    biletFiyati = ((km*kmBasinaUcret)*0.5)*0.8;
                    System.out.println("Bilet Fiyatı: " + biletFiyati);
                    }
            } else if(yas >= 12 && yas <= 24) {
                if(yolculukTipi == 1) {
                    biletFiyati = (km * kmBasinaUcret) * 0.9;
                    System.out.println("Bilet Fiyatı: " + biletFiyati);
                }
                else {
                    biletFiyati = ((km * kmBasinaUcret) * 0.9) * 0.8;
                    System.out.println("Bilet Fiyatı: " + biletFiyati);
                }
            } else if(yas > 65) {
                if(yolculukTipi == 1) {
                    biletFiyati = (km * kmBasinaUcret) * 0.7;
                    System.out.println("Bilet Fiyatı: " + biletFiyati);
                }
                else {
                    biletFiyati = ((km * kmBasinaUcret) * 0.7) * 0.8;
                    System.out.println("Bilet Fiyatı: " + biletFiyati);
                }
            } else {
                if(yolculukTipi == 1) {
                    biletFiyati = (km * kmBasinaUcret);
                    System.out.println("Bilet Fiyatı: " + biletFiyati);
                }
                else {
                    biletFiyati = (km * kmBasinaUcret) * 0.8;
                    System.out.println("Bilet Fiyatı: " + biletFiyati);
                }
            }
        }
    }
}