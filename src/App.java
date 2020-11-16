import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import com.company.Konyv;
import com.company.KonyvList;

public class App {
    public static void main(String[] args) throws FileNotFoundException {
            ArrayList<Konyv> konyvek = new ArrayList<>();
            File f = new File("konyvek.txt");
            Scanner olvas = new Scanner(f);
            while (olvas.hasNext()) {
                String cim = olvas.next();
                String szerzo = olvas.next();
                String kiado = olvas.next();
                int datum = olvas.nextInt();
                String isbn = olvas.next();}

        for (int i = 0; i < konyvek.size(); i++) {
            if(konyvek.get(i).getCim().equals("Fuggvenytablazat")){
                konyvek.get(i).setKolcson(true);
            }
        }

        for (int i = 0; i < konyvek.size(); i++) {
            if(konyvek.get(i).getKiado().equals("Zrinyi"))
                System.out.println( konyvek.get(i).getCim());
        }
        
}
}
