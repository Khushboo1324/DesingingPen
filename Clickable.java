public class Clickable implements IType {
    @Override
    public void start() {
        System.out.println("The pen is clicked and opened!");
    }

    @Override
    public void close() {
        System.out.println("The pen is clicked and now closed.");
    }
}
