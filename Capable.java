public class Capable implements IType {
    @Override
    public void start() {
        System.out.println("The pen cap is opening... Opened!");
    }

    @Override
    public void close() {
        System.out.println("The pen cap is closing... Closed!");
    }
}
