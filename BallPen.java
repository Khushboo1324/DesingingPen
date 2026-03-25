public class BallPen implements IVarity {
    public void write(String s) {
        System.out.println("Writing with BALLPEN: " + s);
    }

    public void refill() {
        System.out.println("BALLPEN refill replaced.");
    }
}
