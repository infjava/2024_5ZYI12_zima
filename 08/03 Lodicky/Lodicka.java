import java.util.ArrayList;

public class Lodicka {
    private ArrayList<Policko> polickaLodky;
    
    public Lodicka() {
        this.polickaLodky = new ArrayList<Policko>();
    }
    
    public void priradPolicko(Policko policko) {
        this.polickaLodky.add(policko);
    }
    
    public void skontrolujZnicenie() {
        for (Policko policko : this.polickaLodky) {
            if (!policko.jeTrafene()) {
                return;
            }
        }
        
        for (Policko policko : this.polickaLodky) {
            policko.prefarbiNaCierno();
        }
    }
}
