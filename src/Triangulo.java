import java.util.Scanner;

class Triangulo extends FiguraGeometrica {
    @Override
    public void calcular(int opcionCalculo) {
        Scanner scanner = new Scanner(System.in);

        if (opcionCalculo == 1) { // Perímetro
            System.out.print("Ingrese el lado del triángulo: ");
            double lado = scanner.nextDouble();
            double perimetro = lado * 3;
            System.out.println("El perímetro del triángulo es: " + perimetro);
        } else if (opcionCalculo == 2) { // Área
            System.out.print("Ingrese la base del triángulo: ");
            double base = scanner.nextDouble();
            System.out.print("Ingrese la altura del triángulo: ");
            double altura = scanner.nextDouble();
            double area = (base * altura) / 2;
            System.out.println("El área del triángulo es: " + area);
        } else {
            System.out.println("Cálculo no válido para el triángulo.");
        }

        scanner.close();
    }
}