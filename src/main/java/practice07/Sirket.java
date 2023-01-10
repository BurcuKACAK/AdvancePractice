package practice07;

public class Sirket {

    static int kasa;
    int depButcesi;

    public void kasadanbutceyeParaAl (int alinacakPara){
        depButcesi+=alinacakPara;
        kasa-=alinacakPara;
        System.out.println("Kasadan "+alinacakPara+ " $ alindi");

    }

    public void paraKazan(int kazanilanPara){
        kasa+=kazanilanPara;
        System.out.println(kazanilanPara +" $ kazanildi");
    }

    public static void kasadanParaHarca(int harcanacakPara){
        kasa-=harcanacakPara;
        System.out.println("Kasadan "+harcanacakPara+ " $ harcanildi");
    }
    public void departmanHarcamasi(int harcanacakPara ){
        depButcesi-=harcanacakPara;
        System.out.println("Departman Butcesinden "+ harcanacakPara+ "$ harcanildi");

    }
}
