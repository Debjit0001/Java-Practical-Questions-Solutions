import java.util.Scanner;

public class GeometricObjectArea {
    static Scanner ob = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Chose the geometric object:");
        System.out.println("Circle => 1\nTriangle => 2\nRectangle => 3\n");
        int n = ob.nextInt();
        switch (n) {
            case 1:
                circleArea();
                break;
            case 2:
                triangleArea();
                break;
            case 3:
                rectangleArea();
                break;
        }
    }

    static void circleArea() {
        System.out.println("Enter the length of radius:");
        double a = ob.nextDouble();
        double b = 3.14 * a * a;
        System.out.printf("The area of the circle is: %.2f", b);
    }

    static void triangleArea() {
        System.out.println("Enter the value of three sights:");
        double a = ob.nextDouble();
        double b = ob.nextDouble();
        double c = ob.nextDouble();
        double s = (a + b + c) / 3;
        double d = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        System.out.printf("The area of the triangle is: %.3f",d);
    }

    static void rectangleArea() {
        System.out.println("Enter the value of length and width:");
        double a = ob.nextDouble();
        double b = ob.nextDouble();
        System.out.println("The area of the rectangle is:" + (a * b));
    }
}
