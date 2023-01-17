package practice09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manav {
    /*
	     Basit bir 5 ürünlü manav alışveris programı yazınız.
	 * 1. Adim : Ürün ve fiyat listesi oluştur.
	 * 2. Adim : Ürün listesinden kod ile ürün seçtir ve kaç kilo olduğunu sor.
	 * 3. Adim : Müşteri her ürün seçtiğinde, aldığı ürünün fiyatını toplam fiyata ekle.
	 * 4. Adim : Alışveriş bitince ödemesi gereken tutarı göster.
	 * 5. Adim : Başka bir ürün almak isteyip istemediğini sor.
	 * 			 İstemiyorsa ödenecek tutarı göster, istiyorsa tekrar ürün seçtir.
	 * 			 Bu islemi alışveriş bitene kadar tekrarla.
	 */
    static List<String> urunlistesi = new ArrayList<>();
    static double toplamOdeme;

    public static void main(String[] args) {

        urunlistesi.add("Domates - Urun Kodu 1 - Fiyati: 20");
        urunlistesi.add("Biber - Urun Kodu 2 - Fiyati: 25");
        urunlistesi.add("Patates - Urun Kodu 3 - Fiyati: 9");
        urunlistesi.add("Elma - Urun Kodu 4 - Fiyati: 15");
        urunlistesi.add("Muz - Urun Kodu 5 - Fiyati: 30");
        System.out.println("urunlistesi = " + urunlistesi);
        musteriSecimi();


    }
    public static void musteriSecimi(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen Urun Kodunu Giriniz");
        int kod = scanner.nextInt();

        System.out.println("Kiloyu Giriniz");
        int kilo = scanner.nextInt();


        System.out.println(kilo+" kilo "+urunlistesi.get(kod-1).split(" ")[0]+"= "+Integer.parseInt(urunlistesi.get(kod-1).split(" ")[urunlistesi.get(kod-1).split(" ").length-1]));
        toplamOdeme += Integer.parseInt(urunlistesi.get(kod-1).split(" ")[urunlistesi.get(kod-1).split(" ").length-1])*kilo;

        System.out.println("toplamOdeme = " + toplamOdeme);

        System.out.println("Devam etmek icin D, kasa icin herhangi bir karakter giriniz");

        if (scanner.next().equalsIgnoreCase("d")){
            musteriSecimi();
        }else{
            System.out.println("toplamOdeme = " + toplamOdeme);
            System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
        }

    }
}
