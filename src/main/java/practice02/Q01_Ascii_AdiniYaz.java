package practice02;

public class Q01_Ascii_AdiniYaz {
    ////Adınızın içerdiği harfleri ve ascii table  kullanmadan, adınızı yazdıran bir kod yazınız.
    public static void main(String[] args) {

//Char bir degerden eksiltme yaparsak matematik islemi yapmis oluruz
        char ch1 = 'B'-1;//A
        char ch2 = 'm'-1;//l
        char ch3 = 'h'+1;//i

        //Not: Char'lari matematik islemine tabii tutarsak ascii degerlerinden matematik islemi yapmis olur
        System.out.println("" + ch1+ch2+ch3);//Basina "" ekleyerek concat yapariz.Diger turlu ""konulmazsa ascii deger toplamini verir

        char ch4 = 'A'+1;
        char ch5 = 'V'-1;
        char ch6 = 'Q'+1;
        char ch7 = 'B'+1;
        char ch8 = 'V'-1;
        System.out.println(""+ch4+ch5+ch6+ch7+ch8);


        // System.out.println(Q04_RandomMethod_RastgeleHarf.rastgeleHarf());


    }
}
