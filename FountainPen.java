public class FountainPen implements IVarity {
    public void write(String s) {
        System.out.println("Writing with FOUNTAINPEN: " + s);
    }
    public void refill() {
        System.out.println("FOUNTAINPEN ink refilled from bottle.");
    }
}
