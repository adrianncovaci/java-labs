package lab_2;

public class Box {
    double height;
    double width;
    double depth;

    public Box() {
        this.height = 1;
        this.width = 1;
        this.depth = 1;
    }

    public Box(double size) {
        if (size <= 0) {
            throw new ArithmeticException("Marimile trebuie sa fie mai mari decat 0");
        }
        this.height = size;
        this.width = size;
        this.depth = size;
    }

    public Box(double height, double width, double depth) {
        if (height <= 0 || width <= 0 || depth <= 0) {
            throw new ArithmeticException("Marimile trebuie sa fie mai mari decat 0");
        }
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    public double getSurface() {
        double base_surface = 2 * this.depth * this.width;
        double lateral_surface = 2 * this.depth * this.height + 2 * this.width * this.height;
        return base_surface + lateral_surface;
    }

    public double getVolume() {
        return this.height * this.width * this.depth;
    }

    public void showBox() {
        System.out.println("Cutia cu dimensiunile : " + this.width + " " + this.height + " " + this.depth);
    }

}
