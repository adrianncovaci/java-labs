package lab_5;

public class F extends E {
    protected String F;

    public F(String F) {
        super("woof");
        this.F = F;
    }
   
    public String toString() {
        return super.toString() + " " + this.F; 
    }


   
    public void urla() {
        System.out.println("Je suis F");
    }
}
