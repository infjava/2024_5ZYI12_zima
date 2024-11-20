import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Plocha {
    private Policko[][] policka;
    
    public Plocha(String nazovPlanu) throws IOException {
        Scanner citacPlanu = new Scanner(new File(nazovPlanu + ".txt"));
        
        int sirka = citacPlanu.nextInt();
        int vyska = citacPlanu.nextInt();
        int pocetLodiciek = citacPlanu.nextInt();
        
        this.policka = new Policko[vyska][sirka];
        
        Lodicka[] lodicky = new Lodicka[pocetLodiciek];
        for (int i = 0; i < pocetLodiciek; i++) {
            lodicky[i] = new Lodicka();
        }
        
        for (int y = 0; y < vyska; y++) {
            for (int x = 0; x < sirka; x++) {
                this.policka[y][x] = new Policko(x, y);
                
                int policko = citacPlanu.nextInt();
                if (policko != 0) {
                    this.policka[y][x].postavLodicku(lodicky[policko - 1]);
                }
            }
        }
        
        citacPlanu.close();
    }
}
