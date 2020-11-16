package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class KonyvList<T> extends ArrayList {

    public KonyvList kolcson(){
        KonyvList kolcsonadva = new KonyvList();
        this.forEach((k) ->{
            Konyv konyv= (Konyv) k;
            if (konyv.isKolcson()){
                kolcsonadva.add(konyv);
            }
        });
        return kolcsonadva;
 }
    public Set<String> kiadok(){
        Set<String> kiadokListaja= new HashSet<>();
        this.forEach((k) ->{
            Konyv konyv= (Konyv) k;
            kiadokListaja.add(konyv.getKiado());
        });
        return kiadokListaja;
    }

    public KonyvList kiadoKonyvei(String kiado) {
        KonyvList kiadoKonyvei = new KonyvList();
        this.forEach((k) ->{
            Konyv konyv= (Konyv) k;
            if (konyv.getKiado().equals(kiado)){
                kiadoKonyvei.add(konyv);
            }
        });
        return kiadoKonyvei;

    }
}