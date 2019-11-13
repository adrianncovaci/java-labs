package lab_5;

public class E extends D {
    protected String E;

    public E(String E) {
        super("woof");
        this.E = E;
    }

    public String toString() {
        return super.toString() + " " + this.E; 
    }

    public void urla() {
        System.out.println("Je suis E");
    }
} 
