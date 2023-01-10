package practice07;

import java.time.LocalDate;

public class Market {

    String urunAdi;
    double urunFiyati;
    String sonKullanmaTarihi;

    Market(String urunAdi, double fiyat, int aySonra){

        this.urunAdi = urunAdi;
        if (fiyat>99){
            fiyat=fiyat*0.9;
        }


        urunFiyati = fiyat;
        sonKullanmaTarihi =LocalDate.now().plusMonths(aySonra).toString();

    }

    Market(String urunAdi, double fiyat ){

        this.urunAdi = urunAdi;
        if (fiyat>99){
            fiyat=fiyat*0.9;
        }


        urunFiyati = fiyat;
        sonKullanmaTarihi ="Bu urunun son kullanma tarihi yoktur";

    }

    public Market() {

    }


    @Override
    public String toString() {
        return "Market{" +
                "urunAdi='" + urunAdi + '\'' +
                ", urunFiyati=" + urunFiyati +
                ", sonKullanmaTarihi='" + sonKullanmaTarihi + '\'' +
                '}';
    }
}
