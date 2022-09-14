package Ejercicios;

public class Functions {

    public static void main(String[] args) {
        finalPrice();
    }
    static void finalPrice(){
        double price = 100;
        double IVA = 20;
        double finalPrice = price + IVA;
        System.out.println("Price: " + finalPrice);
    }
}


