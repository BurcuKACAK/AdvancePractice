package practice05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q07_ListOrtalamaUstuNotlar {
    public static void main(String[] args) {
        // Bir öğretmenden girmek istediği kadar notu alınız, ve ortalamayı geçen öğrenci sayısını bulunuz.
        Scanner input = new Scanner(System.in);
        List<Double> notlar = new ArrayList<>();
        int sayac = 0;
        String karar;

        //Kullanıcıdan istedigi kadar not girmesini iste
        do {
            sayac++;
            System.out.println(sayac+". notu giriniz");
            notlar.add(input.nextDouble());
            System.out.println("Çıkmak için H, Daha fazla not girmek için herhangi bir karakter giriniz");
            karar = input.next();

        }while (!karar.equalsIgnoreCase("H"));

        System.out.println("notlar = " + notlar);

        //Ortalama hesapla double toplam = 0;


        double toplam = 0                                                                                                                                              ;
        for (double w : notlar){
           toplam += w ;
        }

        double ortalama = toplam/notlar.size();
        System.out.printf("ortalama = " + "%.2f",ortalama);
        System.out.println();

        //Ortalama üstü not sayısını bul
        int ortalamaUstuNotSayisi = 0;
        for (double w : notlar){
            if(w>ortalama){
                ortalamaUstuNotSayisi++;
            }
        }

        System.out.println("ortalamaUstuNotSayisi = " + ortalamaUstuNotSayisi);

    }
}
