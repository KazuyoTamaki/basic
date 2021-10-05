package ex;

//配列の合計
public class ExFor {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};
        int sum = 0;
        double avr = 0.00;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            System.out.println("　現在の番地:" + i + " 現在の値:" + array[i] +" 現在の合計" + sum);
        }
        avr = Math.round((double) sum / array.length * 10.0) / 10.0;
        System.out.println("　合計は " + sum + "です。");
        System.out.println("　平均は " + avr + "です。");
    }
}
