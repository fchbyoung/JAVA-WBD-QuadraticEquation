import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        double a = scanner.nextDouble();
        System.out.println("Enter b:");
        double b = scanner.nextDouble();
        System.out.println("Enter c:");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (a == 0) {
            if (b == 0) {
                if (c != 0) {
                    System.out.println("The equation has not solution!");
                } else {
                    System.out.println("The equation has a multitude of solutions");
                }
            } else {
                System.out.println("Equations have solution x = " + (-c / b));
            }
        } else {
            if (quadraticEquation.getDelta() > 0) {
                System.out.println("The equations have solutions " + "x1 = " + quadraticEquation.getRoot1() + ", x2 = " + quadraticEquation.getRoot2());
            } else if (quadraticEquation.getDelta() == 0 ) {
                System.out.println("The equations  with double solutions x1 = x2 = " + quadraticEquation.getRootDouble());
            } else {
                System.out.println("The equations has no solution!");
            }
        }

    }
}
