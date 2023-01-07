package practice04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04_ForEach_Sifreleme {
    /*Kullanıcıdan alınan bir String'de bulunan her bir karakteri alfabetik sırada bir sonraki karakter ile değiştirerek
    şifreleyen bir method ve şifreli ismi çözen ayrı bir method yazınız. (foreach loop kullanınız)*/
    public static void main(String[] args) {
        System.out.println(sifreleme());
        System.out.println(sifreCoz());
    }

    public static String sifreleme() {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir String Giriniz");
        String[] arr = input.nextLine().split("");
        String sifreliString = "";

        for (String w : arr) {
            if (w.equals("z")) {
                sifreliString += "a";
            } else if (w.equals("Z")) {
                sifreliString += "A";
            } else {
                sifreliString += (char) (w.charAt(0) + 1);
            }

        }

        return sifreliString;
    }

    public static String sifreCoz() {
        Scanner input = new Scanner(System.in);
        System.out.println("Sifreli Bir String Giriniz");
        String[] arr = input.nextLine().split("");
        String sifresizString = "";

        for (String w : arr) {
            if (w.equals("a")) {
                sifresizString += "z";
            } else if (w.equals("A")) {
                sifresizString += "Z";
            } else {
                sifresizString += (char) (w.charAt(0) - 1);
            }

        }

        return sifresizString;
    }


//Normal forloop ile ==> Odev

/*
System.out.println(siFrele());


}
public static String siFrele(){
    Scanner sc =new Scanner(System.in);
    System.out.println("Kullanmici String Gir");
    String cml=sc.nextLine();

    String sifreli="";

    for(int i=0;i<cml.length();i++){
        char k=(char)(cml.charAt(i)+1);
        sifreli=sifreli+k;

    }
    return sifreli;
}
 */


}

