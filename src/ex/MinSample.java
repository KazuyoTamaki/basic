package ex;

public class MinSample {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};  // 配列を作成
        int min = array[0];              //仮の最小値

        for (int num: array){
            if (num < min){
                min = num;
            }
        }
        System.out.println("最小値は" + min + "です。");
    }
}
