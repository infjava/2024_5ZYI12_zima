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
        for (int i = 0; i < exponent; i++) {
            medzivysledok *= this.vysledok;
        }
        this.vysledok = medzivysledok;
    }
    
    public double getVysledok() {
        return this.vysledok;
    }
}
