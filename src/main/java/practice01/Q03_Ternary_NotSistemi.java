package practice01;

import java.util.Scanner;

public class Q03_Ternary_NotSistemi {
    /*
  Yüzlük not cinsinden kullanıcıdan alınan notu harf not sistemine çeviren bir kod yazınız.(Ternary kullanınız)
  (90 ve üstü A, 80-89 B, 70-79 C, 60-69 D, 50-59 E, Diğerleri F)
   */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Lutfen 0-100 arasinda notunuzu giriniz");
        int notSayi = input.nextInt();

        String notHarf  =
                notSayi>100 ? "Lutfen 0-100 arasinda bir not giriniz"
                        : notSayi>89 ? "A"
                        : notSayi>79 ? "B"
                        : notSayi>78 ? "C"
                        : notSayi>68 ? "D"
                        : notSayi>58 ? "E"
                        : notSayi>-1 ? "F" : "Lutfen 0-100 arasinda bir not giriniz" ;

        System.out.println("notHarf = " + notHarf);

    }
}
