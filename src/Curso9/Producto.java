package Curso9;

public interface Producto {

    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);

    String getColor();
    void setColor(String color);

    default String getBarcode() {
        return "sin codigo";
    }
}
