package Excercises7_8_9;

import java.io.IOException;

public class DividePorCero {

    public static void main(String[] args) {
        try {//se llama a la función divide en el main
            divide(10, 2);
        } catch (Exception e) { //captura el error lanzado en la función divide
            System.out.println("error capturado");
        }
    }

    public static int divide(int numA, int numB) throws ArithmeticException, IOException {
        //Scanner scanner = new Scanner(System.in);
        //System.out.print("Enter the number: ");
        //int numA = scanner.nextInt();
       // int numB = scanner.nextInt();

        int resultado = 0;
        try {
            resultado = numA / numB;
            System.out.println(resultado);

        } catch (ArithmeticException e) {
            System.out.println("esto no puede hacerse, exception: " + e.getClass());
            throw new IOException();
        }

        //finally {
        //System.out.println(resultado);}
        return resultado;
    }
}
