import java.util.Scanner;

class Circulo {
    public void calcular(int opcionCalculo) {
        Scanner scanner = new Scanner(System.in);

        if (opcionCalculo == 1) { // Perímetro
            System.out.print("Ingrese el radio del círculo: ");
            double radio = scanner.nextDouble();
            double perimetro = 2 * Math.PI * radio;
            System.out.println("El perímetro del círculo es: " + perimetro);
        } else if (opcionCalculo == 2) { // Área
            System.out.print("Ingrese el radio del círculo: ");
            double radio = scanner.nextDouble();
            double area = Math.PI * Math.pow(radio, 2);
            System.out.println("El área del círculo es: " + area);
        } else {
            System.out.println("Cálculo no válido para el círculo.");
        }

        scanner.close();
    }
}
