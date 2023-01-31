package practice13;

import java.util.Arrays;
import java.util.List;

public class Q03_Enum_BeslenmeEgzersiz {

    //Aylara göre sebze ve meyve tavsiyesi içeren ve toplam yapılması gereken egzersiz saatlerini söyleyen bir kod yazınız.
    //20 ssat üstü egzersiz yapılacak ayları ekrana yazdırınız.

    public static void main(String[] args) {

    for (BeslenmeEgzersiz w :BeslenmeEgzersiz.values()){
        if (w.toplamEgzersizSaati>20){
            System.out.println(w);
       }
    }

  }

}
