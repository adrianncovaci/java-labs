package lab_5;

public class G extends F {
    protected String G;

    public G(String G) {
        super("woof");
        this.G = G;
    }

    public String toString() {
        return super.toString() + " " + this.G; 
    }


    public void urla() {
        System.out.println("Je suis G");
    }
}
