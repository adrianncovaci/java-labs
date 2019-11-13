package lab_5;

public class H extends G {
    protected String H;
    private X ix = new X("xxx");
    public H(String H) {
        super("woof");
        this.H = H;
    }

    protected String getHX() {
        return this.ix.getX();
    }

    public String toString() {
        return super.toString() + " " + this.H + " " + this.getHX(); 
    }


    public void urla() {
        System.out.println("Je suis H");
    }
}
