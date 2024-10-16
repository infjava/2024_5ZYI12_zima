public class Segment {
    private Obdlznik segment;
    
    public Segment(int x, int y, boolean zvislaOrientacia) {
        this.segment = new Obdlznik();
        
        this.segment.posunVodorovne(x - 60);
        this.segment.posunZvisle(y - 50);
        
        if (zvislaOrientacia) {
            this.segment.zmenStrany(10, 50);
        } else {
            this.segment.zmenStrany(50, 10);
        }
    }
    
    public void zasviet() {
        this.segment.zobraz();
    }
    
    public void zhasni() {
        this.segment.skry();
    }
}
