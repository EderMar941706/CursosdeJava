package Curso9;

public abstract class Rectangulo extends Figura {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangulo(double length, double width){
        setLength(length);
        setWidth(width);


    }
    @Override
    double calculateArea() {
        return length * width;
    }
}

