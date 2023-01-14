package practice08;

import java.util.Arrays;
import java.util.Scanner;

public class Q02_Arrays_SesliHarfleriKapa {

    /*Kullanıcıdan alınan bir kelimedeki sesli harfleri kapatıp her bir karakteri bir array elemanı olarak yazdıran bir kod yazınız.
    Örn:
    input: Merhaba
    output: [M, *, r, h, *, b, *]
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen Bir Kelime Giriniz");
        String str = input.nextLine();
        int idx = 0;
        String arr [] = new String [str.length()];

        for (String w : str.split("")){
            if (w.equals("a")||w.equals("e")||w.equals("i")||w.equals("o")||w.equals("u")){
                arr[idx] = "*";
                idx++;

            }else {
                arr[idx] = w;
                idx++;
            }
        }
        System.out.println(Arrays.toString(arr));

    }



}
