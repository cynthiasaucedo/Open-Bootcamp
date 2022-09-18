package Excercises7_8_9;

import java.util.Scanner;

public class DividePorCero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");

        int numA = scanner.nextInt();
        int numB = scanner.nextInt();

        try {
            int resultado = numA / numB;
            System.out.println(resultado);
        } catch (ArithmeticException e) {
            System.out.println("esto no puede hacerse, exception: " + e.getClass());
        } finally {
            System.out.println("demo de código");
        }
    }

}
