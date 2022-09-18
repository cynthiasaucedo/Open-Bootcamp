package Excercises7_8_9;

import java.util.Vector;

public class VectorInt {

    public static void main(String[] args) {

        Vector<Integer> vector = new Vector();
        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(5);
        vector.add(5);

        vector.remove(1);
        vector.remove(2);

        System.out.println(vector);

        //si tuvieramos un vector que almacenara 1000 elementos por ej, sería mejor declarar su capacidad inicial asi :
        // "vector (1000);" (donde el parámetro es = initialCapacity)
        // ya que al exceder la capacidad del mismo, este duplica su capacidad, costando GPU excesivo.
        System.out.println("capacidad : " + vector.capacity());
        System.out.println("tamaño : " + vector.size());


    }
}
