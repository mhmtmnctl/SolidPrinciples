package OpenClosePrinciple;

public class YakitHesaplayici {
    /*
    public static double hesapla(Mercedes arabaMercedes){
        return arabaMercedes.tripKm * 3 ; // mercedes km başı $3 yakıyor
    }
    public static double hesapla(BMW arabaBMW){
        return arabaBMW.tripKm * 2 ; // bmw km başı $2 yakıyor
    }

     */

    public static int hesapla(Araba araba){
        // --> kötü kod
        //int masraf =0;
        //if(araba.model==("BMW")) masraf = araba.tripKM* araba.dolarPerKM;
        //(araba.model==("Mercedes")) masraf = araba.tripKM*araba.dolarPerKM;
        // if(araba.model==("Audi")) masraf = araba.tripKM*dolarPerKM;
        return araba.tripKM*araba.dolarPerKM;

    }
}
