import java.util.Scanner;

class Piramide extends FiguraGeometrica {
    @Override
    public void calcular(int opcionCalculo) {
        Scanner scanner = new Scanner(System.in);

        if (opcionCalculo == 3) { // Volumen
            System.out.print("Ingrese la base de la pirámide: ");
            double base = scanner.nextDouble();
            System.out.print("Ingrese la altura de la pirámide: ");
            double altura = scanner.nextDouble();
            System.out.print("Ingrese la apotema de la pirámide: ");
            double apotema = scanner.nextDouble();
            double volumen = (base * altura * apotema) / 3;
            System.out.println("El volumen de la pirámide es: " + volumen);
        } else {
            System.out.println("Cálculo no válido para la pirámide.");
        }

        scanner.close();
    }
}