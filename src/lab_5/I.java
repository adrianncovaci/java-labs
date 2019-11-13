package lab_5;

public class I extends H {
    protected String I;

    public I(String I) {
        super("woof");
        this.I = I;
    }

    public String toString() {
        return super.toString() + " " + this.I; 
    }


    public void urla() {
        System.out.println("Je suis I");
    }
}
