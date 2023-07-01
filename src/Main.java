import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Seleccione una figura:");
        System.out.println("1. Triángulo");
        System.out.println("2. Cuadrado");
        System.out.println("3. Círculo");
        System.out.println("4. Pirámide");
        System.out.println("5. Cubo");
        System.out.println("6. Esfera");

        int opcionFigura = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Seleccione qué desea calcular:");
        System.out.println("1. Perímetro");
        System.out.println("2. Área");
        System.out.println("3. Volumen");

        int opcionCalculo = scanner.nextInt();

        FiguraGeometrica figura = obtenerFigura(opcionFigura);
        figura.calcular(opcionCalculo);

        scanner.close();
    }

    public static FiguraGeometrica obtenerFigura(int opcionFigura) {
        if (opcionFigura == 1) { // Triángulo
            return new Triangulo();
        } else if (opcionFigura == 2) { // Cuadrado
            return new Cuadrado();
        } else if (opcionFigura == 3) { // Círculo
            return new Circulo();
        } else if (opcionFigura == 4) { // Pirámide
            return new Piramide();
        } else if (opcionFigura == 5) { // Cubo
            return new Cubo();
        } else if (opcionFigura == 6) { // Esfera
            return new Esfera();
        } else {
            return null;
        }
    }
}