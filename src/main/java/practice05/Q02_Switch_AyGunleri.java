package practice05;

import java.util.Scanner;

public class Q02_Switch_AyGunleri {
    public static void main(String[] args) {

        /*
       Girilen yil ve ay numarasına göre ayin kaç gün olduğunu yazdiran bir kod yazınız.
       Girdi yıl: 2000 ay: 2
       Çıktı: 29
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Yili Giriniz");
        int yil = input.nextInt();
        System.out.println("Ay Numarasini Giriniz");
        int ay =input.nextInt();

        switch (ay){
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("Girdiginiz Ayin Gun Sayisi : 31");
                break;
            case 4: case 6: case 9: case 11:
                System.out.println("Girdiginiz Ayin Gun Sayisi : 30");
                break;
            case 2:
                if (yil%4==0 && yil%100!=0||yil%400==0){
                    System.out.println("Girdiginiz Ayin Gun Sayisi : 29");
                }else {
                System.out.println("Girdiginiz Ayin Gun Sayisi : 28");
                }
                break;
            default:
                System.out.println("Gecerli Bir Ay Numarasi Giriniz");

        }

    }
}
