public class PenFactory {
    public Pen createPen(String varity, String inkColor, String mechanism) {
        IVarity v;
        switch (varity.toLowerCase()) {
            case "ballpen":
                v = new BallPen();
                break;
            case "gelpen":
                v = new GelPen();
                break;
            case "fountainpen":
                v = new FountainPen();
                break;
            default:
                throw new IllegalArgumentException("Unknown pen variety: " + varity);
        }

        IType t;
        switch (mechanism.toLowerCase()) {
            case "capable":
                t = new Capable();
                break;
            case "clickable":
                t = new Clickable();
                break;
            default:
                throw new IllegalArgumentException("Unknown mechanism type: " + mechanism);
        }

        InkType ink = new InkType(inkColor);
        return new Pen(t, ink, v);
    }
}
