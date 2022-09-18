package Excercises4_5.ex5;

public class CarCRUDImpl implements CarCRUD{
    @Override
    public void save() {
        System.out.println("save");
    }

    @Override
    public void delete() {
        System.out.println("delete");

    }

    @Override
    public void findAll() {
        System.out.println("findAll");

    }
}
