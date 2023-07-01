import java.util.Scanner;

class Cubo extends FiguraGeometrica {
    @Override
    public void calcular(int opcionCalculo) {
        Scanner scanner = new Scanner(System.in);

        if (opcionCalculo == 2) { // Área
            System.out.print("Ingrese el lado del cubo: ");
            double lado = scanner.nextDouble();
            double area = 6 * Math.pow(lado, 2);
            System.out.println("El área del cubo es: " + area);
        } else if (opcionCalculo == 3) { // Volumen
            System.out.print("Ingrese el lado del cubo: ");
            double lado = scanner.nextDouble();
            double volumen = Math.pow(lado, 3);
            System.out.println("El volumen del cubo es: " + volumen);
        } else {
            System.out.println("Cálculo no válido para el cubo.");
        }

        scanner.close();
    }
}