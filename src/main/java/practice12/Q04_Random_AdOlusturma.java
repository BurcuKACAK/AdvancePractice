package practice12;

public class Q04_Random_AdOlusturma {

    //Rastgele alınan harfleri bir Stringe ekleyerek
    // adınızı oluşturan ve bunu kaç deneme ile yaptığını yazdıran bir kod yazınız.

    public static void main(String[] args) {

        String alfabe = "abcçdefgğhıijklmnoöpqrsştuüvyzABCÇDEFGĞHIİJKLMNOÖPQRSŞTUÜVYZ ";

        String isim = "Ayse";
        String yeniIsim = "";

        int counter =0;
        for (int i = 0; i <isim.length() ; i++) {


            while (true){
                char rastgeleHarf = alfabe.charAt((int) (Math.random()*alfabe.length()));
                counter++;
                if (isim.charAt(i)==rastgeleHarf){
                    yeniIsim+=rastgeleHarf;
                    System.out.println("yeniIsim = " + yeniIsim);
                    System.out.println("counter = " + counter);
                    break;
            }
        }

    }
        System.out.println(yeniIsim);

    }

}
