package Curso7;

public class Herenciaprueba {
    public static void main(String[] agrs){
        Madre mom =new Madre();
        mom.setName("Rocio ");

        System.out.println(mom.getName() + "es " + mom.getGender());

        Empleado empleado= new Empleado();

        Rectangulo rectangulo=new Rectangulo();
        rectangulo.print();

        Cuadro cuadro=new Cuadro();
        cuadro.print("Cuadro");
    }
    public static void testSquareOverride(){
        Rectangulo rectangulo=new Rectangulo();
        rectangulo.setLength(5);
        rectangulo.setWidth(10);
        System.out.println(rectangulo.calculatePerimeter());

        Cuadro cuadro=new Cuadro();
        cuadro.setLength(4);
        cuadro.setWidth(8);
        System.out.println(cuadro.calculatePerimeter());
    }
}
