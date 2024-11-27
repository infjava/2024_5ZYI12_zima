import org.junit.Before;

public class Instancie {
    private Tim mskZilina;
    private Tim balaton;
    private Tim sparta;
    private Tim slovan;
    
    private ZoznamTimov liga;
    
    private Turnaj turnaj;
    
    @Before
    public void setUp() {
        this.mskZilina = new Tim("Zilinsky vlci", Krajina.SLOVENSKO);
        this.balaton = new Tim("Piros Balaton", Krajina.MADARSKO);
        this.sparta = new Tim("Sparta Praha", Krajina.CESKO);
        this.slovan = new Tim("Slovan Bratislava", Krajina.SLOVENSKO);
        
        this.liga = new ZoznamTimov();
        this.liga.pridajTim(this.mskZilina);
        this.liga.pridajTim(this.balaton);
        this.liga.pridajTim(this.sparta);
        this.liga.pridajTim(this.slovan);
        
        this.turnaj = new Turnaj(
            new String[]{"Zilinsky vlci", "Piros Balaton", "Sparta Praha", "Slovan Bratislava"},
            liga
        );
    }
}
