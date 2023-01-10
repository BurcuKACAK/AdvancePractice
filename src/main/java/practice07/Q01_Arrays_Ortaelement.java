package practice07;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_Arrays_Ortaelement {
    /*
    Elementlerini kullanıcandan aldığınız bir integer array içindeki orta elementi bulan bir kod yazınız.
    Example: (12, 5, 8) ==> (5, 8, 12) ==> Output=8
    (12, 5, 8, 13) ==> (5, 8, 12, 13) ==> Output=(8+12)/2 = 10
     */

    public static void main(String[] args) {

        Scanner input  = new Scanner(System.in);
        System.out.println("Array Limitini Giriniz");
        int limit = input.nextInt();
        System.out.println( );

        int arr [] = new int[limit];
        //System.out.println(Arrays.toString(arr)); ==> Burda[0,0,0,0,0] veriri

        for (int i = 0; i < limit; i++) {
            System.out.println(i+1 +". element Giriniz");
            arr[i] = input.nextInt();

        }
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);//Kucukten Buyuge Siralar

        System.out.println(Arrays.toString(arr));

        int ortIdx = arr.length/2;

        if (arr.length%2!=0){
            System.out.println("Orta Element : "+arr[ortIdx]);
        }else {
            System.out.println("Orta Element : "+(arr[ortIdx] + arr[ortIdx-1])/2.0);//iki data tipi isleme girdiginde buyuk olanin sonucu doner
        }







    }
}
