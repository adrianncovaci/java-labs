package lab_7;

public class Sphere implements GeometricBody {

    private double radius;

    public Sphere() {
        this.radius = 1;
    }

    public Sphere(double r) {
        this.radius = r;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double val) {
        this.radius = val;
    }

    public double getSurface() {
        return 4 * this.radius * this.radius * 3.14;
    }

    public double getVolume() {
        return 4 / 3 * 3.14 * this.radius * this.radius * this.radius;
    }
}
