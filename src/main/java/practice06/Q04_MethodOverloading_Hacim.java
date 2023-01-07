package practice06;

public class Q04_MethodOverloading_Hacim {
    public static void main(String[] args) {
        //Küp, kare prizma ve dikdörtgen prizmanın hacmini hesaplayan
        // bir kod yaziniz(Method overloading kullanınız)

//Her class bir data tipidir ama her data tipi bir class degildir.
        Hacim obje = new Hacim();
        int kupunHacmi = obje.hacimHesapla(5);
        System.out.println("kupunHacmi = " + kupunHacmi);

        int karePrizmaHacmi = obje.hacimHesapla(5,4);
        System.out.println("karePrizmaHacmi = " + karePrizmaHacmi);

        int dikdortgenPrizmaHacmi = obje.hacimHesapla(2,3,4);
        System.out.println("dikdortgenPrizmaHacmi = " + dikdortgenPrizmaHacmi);

    }
}
