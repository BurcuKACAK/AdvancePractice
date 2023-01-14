package practice08;

public class Q03_ObjeOlusturma_Kutuphane {
    public static void main(String[] args) {
        //Kütüphaneye eklemek istediğiniz kitapları;
        // adı, yazar adı, sayfa sayısı, seri numarası ile yazdıran bir kod yazınız.

        Kutuphane obj1 = new Kutuphane("Magaradakiler", "Cemil Meric" , 285);

        Kutuphane obj2 = new Kutuphane("Kirlangic Cigligi" , "Ahmet Umit" , 400 );
        obj2.sayfaSayisi  = 405;
        obj2.kitapBilgileri();

        //object'leri kullanarak variable'lar uzerinde istegimiz degisikligi yapabiliriz

    }
}
