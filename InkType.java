public class InkType {
    private String color;

    public InkType(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void changeInk(String newColor) {
        this.color = newColor;
        System.out.println("Ink color changed to: " + this.color);
    }

    public void refill() {
        System.out.println("Ink refilled for color: " + this.color);
    }
}
