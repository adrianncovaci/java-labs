package lab_5;

public class J extends I {
    protected String J;

    public J(String J) {
        super("woof");
        this.J = J;
    }

    public String toString() {
        return super.toString() + " " + this.J; 
    }


    public void urla() {
        System.out.println("Je suis J");
    }
}
