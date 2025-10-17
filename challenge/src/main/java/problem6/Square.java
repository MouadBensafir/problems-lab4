package problem6;

public class Square extends Forme {
    private double cote;

    public Square(double cote) {
        if (cote >= 0) this.cote = cote;
    }

    public double getSurface() {
        return Math.round(cote*cote*100) * 0.01;
    }

    @Override
    public String toString() {
        return String.format("Square (radius %.1f cm)", this.cote);
    }
}
