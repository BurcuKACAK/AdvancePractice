package practice12;

public class Q01_Recursive_Faktoriyel {
    //Faktoriyel hesaplayan bir method yazınız.(Loop kullanmayınız.)
    public static void main(String[] args) {


        System.out.println(faktoriyel(-5));//-Koyarsak buraya try catch ile handle edebiliriz


    }

    public static int faktoriyel (int sayi) {//void olsaydi return olmazdi ama void'i matematik isleminde kullanamayiz


        try {
            if (sayi>=0){
                if (sayi == 0 || sayi == 1) {
                    return 1;
                } else {
                    return sayi * faktoriyel(sayi - 1);
                }
            } else {
                throw new ArithmeticException("Sayi Sifirdan Kucuk Olamaz");
            }
        }catch (Exception e){
            System.out.println(e.getCause());

            return 0;

        }


    }
}

