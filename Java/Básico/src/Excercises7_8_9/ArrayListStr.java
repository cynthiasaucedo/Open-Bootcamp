package Excercises7_8_9;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListStr {

    public static void main(String[] args) {
        /*CapacidadVector = CapacidadVector * 2
         *
         * CapacidadArrayList = CapacidadArrayList + (CapacidadArrayList * 0.5)   */

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("abc");
        arrayList.add("def");
        arrayList.add("ghi");
        arrayList.add("jkl");

        //en arraylist se utiliza la propiedad size, no length
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

        //LinkedList se utiliza para modificar datos !no almacenar ni buscar
        LinkedList<String> linkedlist = new LinkedList<String>(arrayList);

        for (int i = 0; i < linkedlist.size(); i++) {
            System.out.println(linkedlist.get(i));
        }
    }
}

