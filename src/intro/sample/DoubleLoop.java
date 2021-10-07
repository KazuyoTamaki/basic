package intro.sample;

public class DoubleLoop {
    public static void main(String[] args) {
        //二次元配列
        int[][] array = {
                { 1, 2, 3},
                { 4, 5, 6},
                { 7, 8, 9}
        };

        System.out.println(array[0][2]);  //3
        System.out.println(array[2][0]);  //7
        System.out.println(array.length + "\n");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                //System.out.println(array[i][j]);
                System.out.println(array[j][i]);
            }

        }
    }
}
