package practice04;

public class Q05_Varargs_KullaniciBilgileri {
    /*Ad, soyad, yaş ve bugüne dek yaşanılmış sehirler
    bilgilerini parametre olarak alıp yazdıran bir method oluşturunuz.

     */
    public static void main(String[] args) {

        bilgiler("Ali", "Can", 22,"Ankara","Konya","Erzurum","Agri","Diyarbakir","Kayseri");//Sehirlerin herbirini ayri parametreler olarak almak zorunda
        System.out.println();
        bilgiler2("Ali", "Can","22","Ankara","Konya","Erzurum","Agri","Diyarbakir","Kayseri");
        System.out.println();
        bilgiler2("Ahmet", "Tan","33","Hamburg","Bremen", "Berlin");
    }

    public static void bilgiler(String Ad, String Soyad, int Yas, String... sehirler){
        System.out.println("ad = " + Ad);
        System.out.println("soyad = " + Soyad);
        System.out.println("yas = " + Yas);
        System.out.print("Yasanilmis Sehirler : ");
        for (String w : sehirler) {
            System.out.print(w+" ");

        }

    }
    public static void bilgiler2(String...bilgiler){

        for (int i=0; i<bilgiler.length; i++ ){
            if (i==0){
                System.out.println("Ad : "+bilgiler[i]);
            } else if (i==1){
                System.out.println("Soyad : "+ bilgiler[i]);
            } else if (i==2){
                System.out.println("Yas : "+bilgiler[i]);
                System.out.print("Yasanilan Sehirler : "+ " ");
            }else {
                System.out.print(bilgiler[i]+ " ");
            }



        }
    }

}
