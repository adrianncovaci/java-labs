package lab_5;

public class B extends A {
    protected String B;

    public B(String b) {
        super("lala", new X("woop"));
        this.B = "woop";
    }

    public String toString() {
        return super.toString() + " " + this.B; 
    }

    public void urla() {
        System.out.println("Je suis B");
    }
}
