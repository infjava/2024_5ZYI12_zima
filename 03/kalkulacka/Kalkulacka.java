public class Kalkulacka {
    private double vysledok;
    private char operator;
    
    public Kalkulacka() {
        this.vysledok = 0;
        this.operator = '+';
    }
    
    public void zadaj(double hodnota) {
        switch (this.operator) {
            case '+':
                this.vysledok += hodnota;
                break;
            case '-':
                this.vysledok -= hodnota;
                break;
            case '*':
                this.vysledok *= hodnota;
                break;
            case '/':
                if (hodnota == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    this.vysledok /= hodnota;
                }
                break;
        }
    }
    
    public void plus() {
        this.operator = '+';
    }
    
    public void minus() {
        this.operator = '-';
    }
    
    public void krat() {
        this.operator = '*';
    }
    
    public void deleno() {
        this.operator = '/';
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
