package intro.operator;

public class For2 {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};      //配列の宣言

        for (int i = 0; i < array.length; i++) {    //配列の要素数(5)
            System.out.println("i=" + i + " array[" + i + "]:" + array[i]);
        }
    }
}
