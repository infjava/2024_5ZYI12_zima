import java.util.ArrayList;

public class Osoba {
    private String meno;
    private String priezvisko;
    private ArrayList<Double> znamky;

    public Osoba(String meno, String priezvisko) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.znamky = new ArrayList<Double>();
    }

    public String getMeno() {
        return this.meno;
    }

    public String getPriezvisko() {
        return this.priezvisko;
    }
    
    public void pridajZnamku(double znamka) {
        this.znamky.add(znamka);
    }
    
    public void zobrazHodnotiacuSpravu() {
        if (this.znamky.isEmpty()) {
            System.out.format("Osoba %s %s nema ziadne znamky%n", this.meno, this.priezvisko);
            return;
        }
        
        // zoznam znamok
        System.out.format("Znamkovy vykaz pre %s %s:%n", this.meno, this.priezvisko);
        
        double najlepsiaZnamka = 4;
        double najhorsiaZnamka = 0;
        double sucetZnamok = 0;
        for (double znamka : this.znamky) {
            System.out.println(znamka);
            
            if (znamka < najlepsiaZnamka) {
                najlepsiaZnamka = znamka;
            }
            
            if (znamka > najhorsiaZnamka) {
                najhorsiaZnamka = znamka;
            }
            
            sucetZnamok += znamka;
        }
        // pocet znamok
        System.out.format("Pocet znamok: %d%n", this.znamky.size());
        // najlepsiu znamku
        System.out.format("Najlepsia znamka: %.1f%n", najlepsiaZnamka);
        // najhorsiu znamku
        System.out.format("Najhorsia znamka: %.1f%n", najhorsiaZnamka);
        // priemernu znamku
        System.out.format("Priemerna znamka: %.2f%n", sucetZnamok / this.znamky.size());
    }

    public void vypis() {
        System.out.println(this.meno + " " + this.priezvisko);
    }
}
