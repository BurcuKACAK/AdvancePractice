package practice09.overriding;

public class Memur extends Banka{
    @Override
    public double faizHesapla(double alinacakKredi) {
        return alinacakKredi*0.10;
    }
}

