package practice12;

import java.util.Scanner;

public class Q03_ForLoop_UsAlma {
    //Bir sayının istenen kuvvetini hesaplayan bir method yazınız.

    public static void main(String[] args) {

        System.out.println(kuvvetiniAL(5,5));

    }
    public static double kuvvetiniAL(double taban,int us){

        if (taban==0 &&us==0){
            throw new ArithmeticException("Taban ve Us Ayni Anda Sifir Olamaz");
        }

        double sonuc = 1;
        if (us>=0){
        for (int i = 1; i <=us ; i++) {
            sonuc*=taban;
        }return sonuc;
        }else {
            for (int i = 0; i <Math.abs(us) ; i++) {
                sonuc*=taban;
            }
            return  1/sonuc;
        }

    }


}
