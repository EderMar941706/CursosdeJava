package Curso9;

public class Pruebadelasfiguras {

    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5, 7) {
            @Override
            public double getLength() {
                return super.getLength();
            }
        };
        rectangulo.print();
        System.out.println(rectangulo.calculateArea());
    }
}

