package Curso8;

import java.util.zip.GZIPOutputStream;

public class Zologico {

    public static void main(String[] args){
       Perro rocky= new Perro();
       rocky.fetch();
       rocky.makeSound();
       feed(rocky);

        Animal sasha=new Perro();
        sasha.makeSound();
        feed(sasha);

        sasha=new Gato();
        sasha.makeSound();
        ((Gato) sasha).scrach();
        feed(sasha);
    }
    public static void feed (Animal animal){
        if (animal instanceof Perro){
            System.out.println("Aqui esta la comida del perro");
        }
        else if (animal instanceof Gato){
            System.out.println("Aqui esta la comida del Gato");
        }
    }
}
