package ex;

import java.time.LocalDateTime;
import java.util.Random;

public class omikuji {
    public static void main(String[] args) {
        Random random = new Random(LocalDateTime.now().getSecond());
        int num = random.nextInt(100);

        switch (num) {
            case 1:
                System.out.println(num);
                System.out.println("あたり！！！");
                break;
            default:
                System.out.println(num);
                System.out.println("はずれ！！！");
        }
    }
}
