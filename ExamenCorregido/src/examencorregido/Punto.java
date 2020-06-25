package examencorregido;

/**
 *
 * @author x535
 */
public class Punto {

    protected int x, y;

    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Punto() {
        this(0, 0);
    }

    public double distancia(int px, int py) {
        double d = Math.sqrt((x - px) * (x - px) + (y - py) * (y - py));
        return d;
    }

    public double distancia(Punto p) {
        return distancia(p.getX(), p.getY());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean esIgual(Punto p) {
        return (x == p.getX() && y == p.getY());
    }
}
