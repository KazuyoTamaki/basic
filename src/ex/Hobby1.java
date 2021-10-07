package ex;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class Hobby1 {
    public static void main(String[] args) {
        Random random_num = new Random(LocalDateTime.now().getSecond());
        int[] array = new int[100];

        for (int i = 0; i < 100; i++) {
            array[i] =random_num.nextInt(10000) ;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("見たい番地を選んでください（0～99）");
        int banchi = scanner.nextInt();

        if (banchi > 99 ){
            System.out.println("エラーです。最初からやり直してください。");
        }
        else {
            System.out.println(banchi + "番地は" + array[banchi] + "です。");
        }
    }
}
