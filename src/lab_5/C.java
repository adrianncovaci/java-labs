package lab_5;

public class C extends B {
    protected String C;
    
    public C(String C) {
        super("lalal");
        this.C = C;
    }

    public String toString() {
        return super.toString() + " " + this.C; 
    }


    public void urla() {
        System.out.println("Je suis C");
    }
}
