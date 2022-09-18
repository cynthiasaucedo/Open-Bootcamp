package Excercises7_8_9;

import java.util.ArrayList;

public class ArrayListInt {

    public static void main(String[] args) {

        ArrayList<Integer> arrayListInt = new ArrayList<Integer>();

        for (int i = 1; i <= 10; i++) {
            //si x/2 = 0 es par
            //entonces no imprimo y continuo iterando
            if (i % 2 == 0) {
                continue;
            } else {arrayListInt.add(i);
            System.out.println(i);}
        }
    }
}
