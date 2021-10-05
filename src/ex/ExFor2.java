package ex;

public class ExFor2 {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};
        int sum = 0;

        for(int num : array){
            sum += num;
        }
        System.out.println(sum);
        System.out.println((double)sum / array.length);
    }
}
