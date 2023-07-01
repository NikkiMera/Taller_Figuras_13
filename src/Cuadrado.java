import java.util.Scanner;

class Cuadrado {
    public void calcular(int opcionCalculo) {
        Scanner scanner = new Scanner(System.in);

        if (opcionCalculo == 1) { // Perímetro
            System.out.print("Ingrese el lado del cuadrado: ");
            double lado = scanner.nextDouble();
            double perimetro = lado * 4;
            System.out.println("El perímetro del cuadrado es: " + perimetro);
        } else if (opcionCalculo == 2) { // Área
            System.out.print("Ingrese el lado del cuadrado: ");
            double lado = scanner.nextDouble();
            double area = lado * lado;
            System.out.println("El área del cuadrado es: " + area);
        } else {
            System.out.println("Cálculo no válido para el cuadrado.");
        }

        scanner.close();
    }
}