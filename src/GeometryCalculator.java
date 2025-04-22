import java.util.Scanner;

public class GeometryCalculator {
    private static final double PI = 3.1416;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String shape = askShape(input);
        String operation = askOperation(input);

        double result = calculate(shape, operation, input);
        System.out.println("Resultado: " + result);
    }

    private static String askShape(Scanner input) {
        System.out.println("Figura (circulo, cuadrado, triangulo, rectangulo, pentagono):");
        return input.nextLine().trim().toLowerCase();
    }

    private static String askOperation(Scanner input) {
        System.out.println("Operacion (area, perimetro):");
        return input.nextLine().trim().toLowerCase();
    }

    private static double calculate(String shape, String operation, Scanner input) {
        return switch (shape) {
            case "circulo" -> operation.equals("area") ? circleArea(input) : circlePerimeter(input);
            case "cuadrado" -> operation.equals("area") ? squareArea(input) : squarePerimeter(input);
            case "triangulo" -> operation.equals("area") ? triangleArea(input) : trianglePerimeter(input);
            case "rectangulo" -> operation.equals("area") ? rectangleArea(input) : rectanglePerimeter(input);
            case "pentagono" -> operation.equals("area") ? pentagonArea(input) : pentagonPerimeter(input);
            default -> 0;
        };
    }

    private static double circleArea(Scanner input) {
        System.out.println("Radio:");
        double radius = input.nextDouble();
        return PI * radius * radius;
    }

    private static double circlePerimeter(Scanner input) {
        System.out.println("Radio:");
        double radius = input.nextDouble();
        return 2 * PI * radius;
    }

    private static double squareArea(Scanner input) {
        System.out.println("Lado:");
        double side = input.nextDouble();
        return side * side;
    }

    private static double squarePerimeter(Scanner input) {
        System.out.println("Lado:");
        double side = input.nextDouble();
        return 4 * side;
    }

    private static double triangleArea(Scanner input) {
        System.out.println("Base:");
        double base = input.nextDouble();
        System.out.println("Altura:");
        double height = input.nextDouble();
        return 0.5 * base * height;
    }

    private static double trianglePerimeter(Scanner input) {
        System.out.println("Lado 1:");
        double a = input.nextDouble();
        System.out.println("Lado 2:");
        double b = input.nextDouble();
        System.out.println("Lado 3:");
        double c = input.nextDouble();
        return a + b + c;
    }

    private static double rectangleArea(Scanner input) {
        System.out.println("Base:");
        double base = input.nextDouble();
        System.out.println("Altura:");
        double height = input.nextDouble();
        return base * height;
    }

    private static double rectanglePerimeter(Scanner input) {
        System.out.println("Base:");
        double base = input.nextDouble();
        System.out.println("Altura:");
        double height = input.nextDouble();
        return 2 * (base + height);
    }

    private static double pentagonArea(Scanner input) {
        System.out.println("Lado:");
        double side = input.nextDouble();
        System.out.println("Apotema:");
        double apothem = input.nextDouble();
        return (5 * side * apothem) / 2;
    }

    private static double pentagonPerimeter(Scanner input) {
        System.out.println("Lado:");
        double side = input.nextDouble();
        return 5 * side;
    }
}
