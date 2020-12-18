package Curso8;

public class Perro extends Animal{
    @Override
    public void makeSound() {
        System.out.println("Guao");
    }
    public void fetch(){
        System.out.println("soy el perro y ladro!");
    }
}
