package Excercises4_5_6.ex5;

public class Main {

    public static void main(String[] args) {

        CarCRUD carCRUD = new CarCRUDImpl();

        carCRUD.save();
        carCRUD.delete();
        carCRUD.findAll();
    }
}
