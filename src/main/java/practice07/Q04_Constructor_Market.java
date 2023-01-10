package practice07;

public class Q04_Constructor_Market {
    public static void main(String[] args) {

        //Ürün adı, ürün fiyatı ve (varsa) son kullanma tarihlerini yazdıran bir market programı yazınız.
        //Birim fiyatı 99 lira üzeri olan ürünlere %10 vergi indirimi uygulayınız.

        Market obje1 = new Market("Cikolata", 20,6);

        System.out.println(obje1);

        Market obje2 = new Market("Peynir", 100, 3);
        System.out.println(obje2);

        Market obje3 = new Market("Deterjan", 200);
        System.out.println(obje3);

        Market obje4 = new Market();
        System.out.println(obje4);

    }
}
