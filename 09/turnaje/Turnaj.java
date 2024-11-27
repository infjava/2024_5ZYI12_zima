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
}
