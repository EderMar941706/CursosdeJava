package Curso4;

public class Ejemplo6DCalculadora {
    public static void main(String args[]){
        Ejemplo6D bill = new Ejemplo6D(15928);
        bill.setMinutesUsed(500);
        bill.printItemizedBill();
    }
}