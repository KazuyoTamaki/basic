package ex;

import java.time.LocalDateTime;
import java.util.Random;

public class Omikuji {
    public static void main(String[] args) {
        Random random = new Random(LocalDateTime.now().getSecond());
        int num = random.nextInt(100);
        System.out.println("======99%の確率で叱られるくじ======");

        switch (num) {
            case 1:
                System.out.println(num);
                System.out.println("あたり！！！おめでとうございます！！！");
                break;
            default:
                //System.out.println(num);
                System.out.println("はずれ！！！ばっかも～ん！！！");
        }
        System.out.println("=================完================");
    }
}
