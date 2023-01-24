package practice10;

import java.util.Scanner;

public class Q02_Arrays_HarfKullanimSayilari {
    /*
  Girilen String'de hangi harfin kaç kere kullanıldığını yazan bir kod yazınız.
  Input: String str = "Java is so Good";
  Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
   */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int vizeNotu;
        int finalNotu;


        while (true) {
            try {
                System.out.println("Vize notunu giriniz");
                vizeNotu = scanner.nextInt();
                if (vizeNotu < 0 || vizeNotu > 100) {
                    throw new ArithmeticException();
                } else {
                    break;
                }
            }catch (ArithmeticException e) {
                System.out.println("Not 0 ile 100 arasında olmalıdır");
            }catch (Exception e){
                System.out.println("Geçersiz bir giriş yaptınız");
                scanner.next();//dummy scanner
            }
        }

        while (true) {
            try {
                System.out.println("Final notunu giriniz");
                finalNotu = scanner.nextInt();
                if (finalNotu < 0 || finalNotu > 100) {
                    throw new ArithmeticException();
                } else {
                    break;
                }
            } catch (ArithmeticException e) {
                System.out.println("Not 0 ile 100 arasında olmalıdır");
            }catch (Exception e){
                System.out.println("Geçersiz bir giriş yaptınız");
                scanner.next();//dummy scanner
            }
        }

        double ortalama = vizeNotu * 40 / 100 + finalNotu * 60 / 100;

        if (ortalama >= 70) {
            System.out.println(ortalama+": Başarılı");
        } else {
            System.out.println(ortalama+": Başarısız");
        }

    }

}