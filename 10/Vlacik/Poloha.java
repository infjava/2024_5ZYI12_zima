public class Poloha {
    private final int x;
    private final int y;
    private final Smer smer;
    
    public Poloha(int x, int y, Smer smer) {
        this.x = x;
        this.y = y;
        this.smer = smer;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public Smer getSmer() {
        return this.smer;
    }
    
    public Poloha getPosunutaPoloha(int krok, Smer smer) {
        return new Poloha(
            this.x + krok * smer.getVektorX(),
            this.y + krok * smer.getVektorY(),
            smer
        );
    }
}
