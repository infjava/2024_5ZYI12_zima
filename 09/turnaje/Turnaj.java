public class Turnaj {
    private Tim[] prihlaseneTimy;
    private Vysledok[][] tabulka;
    private boolean uzavrety;
    
    public Turnaj(String[] timy, ZoznamTimov liga) {
        this.prihlaseneTimy = new Tim[timy.length];
        
        for (int i = 0; i < timy.length; i++) {
            this.prihlaseneTimy[i] = liga.getTim(timy[i]);
        }
        
        this.tabulka = new Vysledok[timy.length][timy.length];
        
        for (int domaci = 0; domaci < timy.length; domaci++) {
            for (int hostia = 0; hostia < timy.length; hostia++) {
                if (domaci != hostia) {
                    this.tabulka[domaci][hostia] = Vysledok.NEDOHRANE;
                } else {
                    this.tabulka[domaci][hostia] = Vysledok.NEHRA_SA;
                }
            }
        }
        
        this.uzavrety = false;
    }
    
    public void uzavriTurnaj() {
        this.uzavrety = true;
    }
    
    public boolean vlozVysledokDoTabulky(Vysledok vysledok, int domaci, int hostia) {
        if (this.uzavrety) {
            return false;
        }
        
        if (this.tabulka[domaci][hostia] != Vysledok.NEDOHRANE) {
            return false;
        }
        
        this.tabulka[domaci][hostia] = vysledok;
        return true;
    }
    
    public void vypisTabulku() {
        System.out.format("%20s", "");
        
        for (Tim tim : this.prihlaseneTimy) {
            System.out.format("%20s", tim.getNazovTimu());
        }
        
        System.out.println();
        
        for (int domaci = 0; domaci < this.prihlaseneTimy.length; domaci++) {
            System.out.format("%20s", this.prihlaseneTimy[domaci].getNazovTimu());
            
            for (int hostia = 0; hostia < this.prihlaseneTimy.length; hostia++) {
                System.out.format("%20s", this.tabulka[domaci][hostia]);
            }
            
            System.out.println();
        }
        
        if (this.uzavrety) {
            System.out.println("Turnaj bol uzavrety!");
            
            int[] bodyTimov = new int[this.prihlaseneTimy.length];
            
            for (int domaci = 0; domaci < this.prihlaseneTimy.length; domaci++) {
                for (int hostia = 0; hostia < this.prihlaseneTimy.length; hostia++) {
                    bodyTimov[domaci] += this.tabulka[domaci][hostia].getBodyDomaci();
                    bodyTimov[hostia] += this.tabulka[domaci][hostia].getBodyHostia();
                }
            }
            
            for (int tim = 0; tim < this.prihlaseneTimy.length; tim++) {
                System.out.format("%20s%5d%n", this.prihlaseneTimy[tim].getNazovTimu(), bodyTimov[tim]);
            }
        }
    }
}
