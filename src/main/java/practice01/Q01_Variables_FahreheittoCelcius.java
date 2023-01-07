package practice01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q01_Variables_FahreheittoCelcius {
    // Fahrenheit değeri, Celsius değere çeviren kod yazınız.
    // formül: c = (f-32)*5/9
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Fahrenheit degeri giriniz");
        double f = input.nextDouble();

        double c = (f-32)*5/9;
        System.out.println("Celcius: "+c);

        //Ondalik kismi belirli bir formatta yazdirmak icin :
        //1.Yol: DecimalFormat class
        DecimalFormat decimalFormat = new DecimalFormat("0.0000");
        String formattedCelcius = decimalFormat.format(c);
        System.out.println("formattedCelcius = " + formattedCelcius);
        //Double.valueOf(formattedCelcius); bu haliyle matematik isleminde kullanilabilir

        //2. Yol: printf ile;
        System.out.printf("Printf ile: " + "%.2f",c);//%==> herhangi bir sayi, 2f= iki basamakli format


}
}
