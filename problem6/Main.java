import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double radius = sc.nextDouble();
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        int side = sc.nextInt();

        System.out.println(AreaCalculator.calculateArea(radius));       // Circle
        System.out.println(AreaCalculator.calculateArea(length, width)); // Rectangle
        System.out.println(AreaCalculator.calculateArea(side));          // Square

        sc.close();
    }
}