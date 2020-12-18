package Curso5;

import java.util.Scanner;

public class Grades {
    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("¿A cuantos grados le gustaria ingresar?");
        grades = new int[scanner.nextInt()];
        getGrades();

        System.out.println("prmedio: " + String.format("%.2f", calculateAverage()));
        System.out.println("mas alta: " + getHighest());
        System.out.println("mas baja: " + getLowest());

    }

    public static void getGrades() {
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Ingrese el numero de grados" + (i + 1));
            grades[i] = scanner.nextInt();
        }
    }

    public static int calculateSum() {
        int sum = 0;
        for (int grade : grades) {
            sum = sum + grade;
        }
        return sum;
    }

    public static double calculateAverage() {
        return calculateSum() / grades.length;
    }

    public static int getHighest() {
        int highest = grades[0];
        for (int grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    public static int getLowest() {
        int lowest = grades[0];
        for (int grade : grades) {
            if (grade > lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}




