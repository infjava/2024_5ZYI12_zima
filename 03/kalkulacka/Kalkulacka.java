public class Kalkulacka {
    private double vysledok;
    
    public Kalkulacka() {
        this.vysledok = 0;
    }
    
    public void zadaj(double hodnota) {
        this.vysledok = hodnota;
    }
    
    public void plus(double hodnota) {
        // this.vysledok = this.vysledok + hodnota;
        this.vysledok += hodnota;
    }
    
    public void minus(double hodnota) {
        this.vysledok -= hodnota;
    }
    
    public void krat(double hodnota) {
        this.vysledok *= hodnota;
    }
    
    public void deleno(double hodnota) {
        if (hodnota != 0) {
            this.vysledok /= hodnota;
        } else {
            System.out.println("Cannot divide by zero");
        }
    }
    
    public void druhaMocnina() {
        this.vysledok = this.vysledok * this.vysledok;
    }
    
    public void mocnina(int exponent) {
        double medzivysledok = 1;
        if (exponent >= 0) {
            for (int i = 0; i < exponent; i++) {
                medzivysledok *= this.vysledok;
            }
        } else {
            for (int i = 0; i < -exponent; i++) {
                medzivysledok /= this.vysledok;
            }
        }
        this.vysledok = medzivysledok;
    }
    
    public void druhaOdmocnina() {
        double medzivysledok = this.vysledok;
        double predchadzajuciMedzivysledok;
        
        //int i = 0;
        do {
            predchadzajuciMedzivysledok = medzivysledok;
            medzivysledok = (medzivysledok + this.vysledok / medzivysledok) / 2;
            //i++;
        } while ((predchadzajuciMedzivysledok - medzivysledok) > 0.00000000000000001);
        //System.out.println(i);
        
        this.vysledok = medzivysledok;
    }
    
    public double getVysledok() {
        return this.vysledok;
    }
}
