package practice04;

public class Q01_Arrays_OrtalamadanBuyuk {
    /*
    //Verilen bir Array'in elementlerinin ortalamasından büyük elementleri yazdıran bir kod yazınız.
     */
    public static void main(String[] args) {

        int[] arr = {5, 9, 15, 1, 0, 11, 3};

        double toplam = 0;

        for (int w : arr) {
            toplam+=w;
        }
        System.out.println("toplam = " + toplam);

        double ortalama = toplam/ arr.length;
        System.out.println("ortalama = " + ortalama);

        System.out.print("Ortalamadan buyuk elementler : ");
        for (int w: arr) {
            toplam+=w;

            if(w>ortalama){
                System.out.printf(w+ " ");

            }
        }













    }


}
