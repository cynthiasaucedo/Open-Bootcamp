package Excercises7_8_9;

public class ArrayBi {
    public static void main(String[] args) {

        int[][] arrays = {
                {1, 2, 3, 4, 5},
                {10, 11, 12, 13, 14, 15}
            };


        for (int i = 0; i < arrays.length; i++) {
            { for (int j = 0; j < arrays[i].length; j++){
                    System.out.print("number : " + arrays[i][j] + " position : " + i + ","+ j + '\n');

                }
            }
        }
    }
}
