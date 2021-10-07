package ex;

import java.util.Arrays;

public class SumSample3 {
    public static void main(String[] args) {
        //整数型配列の宣言
        int[] array = {20,30,10,50,40};

        //各種変数宣言
        int sum = 0;           //合計を保存する変数の宣言
        int max = array[0];    //最大値を保存する変数の宣言
        int min = array[0];    //最小値を保存する変数の宣言
        double average = 0.00; //平均を保存する変数の宣言
        int count = 0;         //要素数を保存するための変数の宣言

        while(count < array.length){
            sum += array[count];
            if (max < array[count]) max = array[count];
            if (min > array[count]) min = array[count];
            count++;
        }
        average = (double) sum / count;

        System.out.println("配列の内容は " + Arrays.toString(array) + " です。\n");
        System.out.println("合計は   " + sum + "です。");
        System.out.println("平均は   " + average + "です。");
        System.out.println("最大値は " + max + "です。");
        System.out.println("最小値は " + min + "です。");
        System.out.println("要素数は " + count + "です。");
    }
}
