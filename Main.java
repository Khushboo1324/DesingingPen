import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter pen variety - ballpen/gelpen/fountainpen: ");
        String variety = sc.next();

        System.out.print("Enter mechanism type capable/clickable: ");
        String type= sc.next();

        System.out.print("Enter ink color: ");
        String color = sc.next();

        PenFactory factory = new PenFactory();
        Pen p = factory.createPen(variety, color, type);

        System.out.println("\nPen details:");
        System.out.println("Ink color: " + color);

        p.start();
        p.write("welcome java!!!");
        p.refill();
        p.close();

        sc.close();
    }
}
