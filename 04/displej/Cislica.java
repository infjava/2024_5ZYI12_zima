public class Cislica {
    private Segment segmentA;
    private Segment segmentB;
    private Segment segmentC;
    private Segment segmentD;
    private Segment segmentE;
    private Segment segmentF;
    private Segment segmentG;
    
    public Cislica(int x, int y) {
        this.segmentA = new Segment(10 + x, y, false);
        this.segmentB = new Segment(60 + x, 10 + y, true);
        this.segmentC = new Segment(60 + x, 70 + y, true);
        this.segmentD = new Segment(10 + x, 120 + y, false);
        this.segmentE = new Segment(x, 70 + y, true);
        this.segmentF = new Segment(x, 10 + y, true);
        this.segmentG = new Segment(10 + x, 60 + y, false);
    }
    
    public void nastavCislo(char cislo) {
        switch (cislo) {
            case '0':
                this.segmentA.zasviet();
                this.segmentB.zasviet();
                this.segmentC.zasviet();
                this.segmentD.zasviet();
                this.segmentE.zasviet();
                this.segmentF.zasviet();
                this.segmentG.zhasni();
                break;
            case '1':
                this.segmentA.zhasni();
                this.segmentB.zasviet();
                this.segmentC.zasviet();
                this.segmentD.zhasni();
                this.segmentE.zhasni();
                this.segmentF.zhasni();
                this.segmentG.zhasni();
                break;
            case '2':
                this.segmentA.zasviet();
                this.segmentB.zasviet();
                this.segmentC.zhasni();
                this.segmentD.zasviet();
                this.segmentE.zasviet();
                this.segmentF.zhasni();
                this.segmentG.zasviet();
                break;
            case '3':
                this.segmentA.zasviet();
                this.segmentB.zasviet();
                this.segmentC.zasviet();
                this.segmentD.zasviet();
                this.segmentE.zhasni();
                this.segmentF.zhasni();
                this.segmentG.zasviet();
                break;
            case '4':
                this.segmentA.zhasni();
                this.segmentB.zasviet();
                this.segmentC.zasviet();
                this.segmentD.zhasni();
                this.segmentE.zhasni();
                this.segmentF.zasviet();
                this.segmentG.zasviet();
                break;
            case '5':
                this.segmentA.zasviet();
                this.segmentB.zhasni();
                this.segmentC.zasviet();
                this.segmentD.zasviet();
                this.segmentE.zhasni();
                this.segmentF.zasviet();
                this.segmentG.zasviet();
                break;
            case '6':
                this.segmentA.zasviet();
                this.segmentB.zhasni();
                this.segmentC.zasviet();
                this.segmentD.zasviet();
                this.segmentE.zasviet();
                this.segmentF.zasviet();
                this.segmentG.zasviet();
                break;
            case '7':
                this.segmentA.zasviet();
                this.segmentB.zasviet();
                this.segmentC.zasviet();
                this.segmentD.zhasni();
                this.segmentE.zhasni();
                this.segmentF.zhasni();
                this.segmentG.zhasni();
                break;
            case '8':
                this.segmentA.zasviet();
                this.segmentB.zasviet();
                this.segmentC.zasviet();
                this.segmentD.zasviet();
                this.segmentE.zasviet();
                this.segmentF.zasviet();
                this.segmentG.zasviet();
                break;
            case '9':
                this.segmentA.zasviet();
                this.segmentB.zasviet();
                this.segmentC.zasviet();
                this.segmentD.zasviet();
                this.segmentE.zhasni();
                this.segmentF.zasviet();
                this.segmentG.zasviet();
                break;
        }
    }
}
