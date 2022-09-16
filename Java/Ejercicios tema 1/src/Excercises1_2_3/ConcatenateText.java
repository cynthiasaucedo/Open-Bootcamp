
/**
 * Crear un bucle que permita concatenar textos y imprima el resultado final por consola.
 * Concatenar nombres
 * Los textos pueden venir de un array String
 * String[] nombres = {"", "", "", ""};
 */
package Excercises1_2_3;

public class ConcatenateText {
    public static void main(String[] args){
        String[] names = {"Maria", "Leonardo", "Carolina", "Victoria"};
                for(int i = 0; i < names.length; i++){
                    System.out.println(names[i] + " ");
                }
    }
}
