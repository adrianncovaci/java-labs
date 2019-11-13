package lab_5;

public class D extends C {
    protected String D;
    protected X ix = new X("xxx");

    public D(String D) {
        super("woof");
        this.D = D;
    }

    public String toString() {
        return super.toString() + " " + this.D + this.ix.getX(); 
    }

    public void urla() {
        System.out.println("Je suis D");
    }
}
