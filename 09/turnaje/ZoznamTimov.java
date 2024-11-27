import java.util.ArrayList;

public class ZoznamTimov {
    private ArrayList<Tim> timy;
    
    public ZoznamTimov() {
        this.timy = new ArrayList<Tim>();
    }
    
    public boolean pridajTim(Tim pridavany) {
        // TODO kontroly
        
        this.timy.add(pridavany);
        return true;
    }
    
    public Tim getTim(String nazov) {
        for (Tim tim : this.timy) {
            if (tim.getNazovTimu().equals(nazov)) {
                return tim;
            }
        }
        
        return null;
    }
}
