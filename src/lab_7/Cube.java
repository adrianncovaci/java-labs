package lab_7;

public class Cube implements GeometricBody {
    private double vertice;

    public Cube(double v) {
        this.vertice = vertice;
    }

    public Cube() {
        this.vertice = 1;
    }

    public double getVertice() {
        return this.vertice;
    }

    public void setVertice(double vertice) {
        this.vertice = vertice;
    }
 
    public double getSurface() {
        return this.vertice * this.vertice * 6;
    }

    public double getVolume() {
        return this.vertice * this.vertice * this.vertice;
    }
}
