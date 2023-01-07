package practice02;

import java.util.Scanner;

public class Q02_If_Diskriminant {
    /* Günün sorusu: if statement
     katsayıları verilen 1 bilinmeyenli denklemin kökleriniz bulunuz.
       ax² + bx + c;
       Çözüm adımları
       kullanıcıdan a,b,c yi alın.
       Diskriminant formülü: (-b +/- karekök(delta)) / (2a)
       Delta = bb - 4ac
       Delta > 0 => 2 tane kök vardır x1=(-b + kök(d)) / (2a)  , x2= (-b - kök(d)) / (2*a)
       Delta = 0 => 1 tane kök vardır x = -b/2a
       Delta < 0 ise kök yoktur.
  */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Denklemin a,b ve c katsayilarini sirasiyla giriniz");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();//ctrl + d tiklarsak siradaki sirayi otomatik atar

        double deltaFormul = b * b - 4 * a * c;

        if (deltaFormul > 0) {
            double x1 = (-b + Math.sqrt(deltaFormul)) / (2 * a);
            double x2 = (-b - Math.sqrt(deltaFormul)) / (2 * a);
            System.out.println("Denkleminiz: " + a + "x² + " + b + "x + " + c + ";");
            System.out.println("Denklemin Iki kok vardir: x1 +" + x1 + ", x2 =" + x2);

        } else if (deltaFormul == 0) {
            double x = -b / (2 * a);
            System.out.println("Denkleminiz: " + a + "x² + " + b + "x + " + c + ";");
            System.out.println("Denklemin bir koku vardir: x=" + x);

        } else {
            System.out.println("Denkleminiz: " + a + "x² + " + b + "x + " + c + ";");
            System.out.println("Denklemin koku yoktur.");
        }

    }
}
