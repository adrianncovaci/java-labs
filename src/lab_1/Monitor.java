package lab_1;

public class Monitor {
    public String color;
    public int width;
    public int height;
    public String resolution;

    public Monitor(String color, int width, int height, String resolution) {
        this.color = color;
        this.width = width;
        this.height = height;
        this.resolution = resolution;
    }

    public void printCompareSize(Monitor monitor2) {
        if (this.height * this.height > monitor2.height * monitor2.width) {
            System.out.println("Monitorul1 e mai mare");
        } else {
            System.out.println("Monitorul2 e mai mare");
        }
    }

    public void showMonitor() {
        System.out.println("Monitorul cu culoarea " + this.color + " width = " + this.width + " height = " + this.height + " rezolutia= " + this.resolution);
    }

}
