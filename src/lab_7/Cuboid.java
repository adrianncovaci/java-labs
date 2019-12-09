package lab_7;

public class Cuboid implements GeometricBody {
    private double width;
    private double length;
    private double height;

    public Cuboid() {
        this.width = this.length = this.height = 1;
    }

    public Cuboid(double l, double w, double h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public double getHeight() {
        return this.height;
    }

    public void setWidth(double val) {
        this.width = val;
    }

    public void setLength(double val) {
        this.length = val;
    }

    public void setHeight(double val) {
        this.height = val;
    }

    public double getSurface() {
        return 2 * (this.height * this.width + this.height * this.length + this.width * this.length);
    }

    public double getVolume() {
        return this.width * this.length * this.height;
    }
}
