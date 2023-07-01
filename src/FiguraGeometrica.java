class FiguraGeometrica {
    private int opcionFigura;

    public FiguraGeometrica(int opcionFigura) {
        this.opcionFigura = opcionFigura;
    }

    public void calcular(int opcionCalculo) {
        if (opcionFigura == 1) { // Triángulo
            Triangulo triangulo = new Triangulo();
            triangulo.calcular(opcionCalculo);
        } else if (opcionFigura == 2) { // Cuadrado
            Cuadrado cuadrado = new Cuadrado();
            cuadrado.calcular(opcionCalculo);
        } else if (opcionFigura == 3) { // Círculo
            Circulo circulo = new Circulo();
            circulo.calcular(opcionCalculo);
        } else if (opcionFigura == 4) { // Pirámide
            Piramide piramide = new Piramide();
            piramide.calcular(opcionCalculo);
        } else if (opcionFigura == 5) { // Cubo
            Cubo cubo = new Cubo();
            cubo.calcular(opcionCalculo);
        } else if (opcionFigura == 6) { // Esfera
            Esfera esfera = new Esfera();
            esfera.calcular(opcionCalculo);
        } else {
            System.out.println("Figura no válida.");
        }
    }
}