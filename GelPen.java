public class GelPen implements IVarity {
    public void write(String s){
        System.out.println("Writing with GELPEN: " + s);
    }
    public void refill() {
        System.out.println("GELPEN refill replaced.");
    }
}
