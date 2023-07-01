import java.util.Scanner;

class Esfera {
    public void calcular(int opcionCalculo) {
        Scanner scanner = new Scanner(System.in);

        if (opcionCalculo == 2) { // Área
            System.out.print("Ingrese el radio de la esfera: ");
            double radio = scanner.nextDouble();
            double area = 4 * Math.PI * Math.pow(radio, 2);
            System.out.println("El área de la esfera es: " + area);
        } else if (opcionCalculo == 3) { // Volumen
            System.out.print("Ingrese el radio de la esfera: ");
            double radio = scanner.nextDouble();
            double volumen = (4 / 3) * Math.PI * Math.pow(radio, 3);
            System.out.println("El volumen de la esfera es: " + volumen);
        } else {
            System.out.println("Cálculo no válido para la esfera.");
        }

        scanner.close();
    }
}