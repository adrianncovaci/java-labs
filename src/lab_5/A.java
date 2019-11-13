package lab_5;

public class A extends X {
    protected String A;
    protected X ix = new X("xxx");

    public A(String a, X x) {
        super(a);
        this.ix = x;
    } 
    public String toString() {
        return super.getX() + " " + this.A; 
    }

    public void urla() {
        System.out.println("Je suis A");
    }
}
