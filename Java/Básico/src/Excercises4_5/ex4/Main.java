/*
 * En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas: SmartPhone y SmartWatch.
 *
 * Agregaréis atributos tal cual tendrían esos objetos en la realidad.
 *
 * Crear constructor vacío y con todos los parámetros para cada clase.
 *
 * Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
 */


package Excercises4_5.ex4;

public class Main {
    public static void main(String[] args) {

        SmartPhone samS20 = new SmartPhone("Samsung", "S20", "Android 9", true, 16, 20, 64);
        SmartWatch appWatch = new SmartWatch("Apple", "Rzw", "iOS16", false, 8, true, false);

        //retorna el atributo "brand"
        System.out.println(samS20.brand);
        //retorna un booleano si tiene podómetro(metodo)
        System.out.println(appWatch.isPedometer());
        //retorna un int de gb de memoria
        System.out.println(samS20.getExtraibleSD());
        //retorna un string de modelo
        System.out.println(samS20.getModel());
    }
}
