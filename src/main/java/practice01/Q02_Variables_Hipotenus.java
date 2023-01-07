package practice01;

import java.util.Scanner;

public class Q02_Variables_Hipotenus
{
    //Hipotenüs hesaplayan bir kod yazınız.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ucgenin 1. dik kenar uzunlugunu giriniz");
        double a = input.nextDouble();
        System.out.println("Lutfen ucgenin 1. dik kenar uzunlugunu giriniz");
        double b = input.nextDouble();

        double c = Math.sqrt(a*a + b*b);
        System.out.println("hipotenus = " + c);

        System.out.printf("%.2f",c);

}
}
