package intro.operator;

import java.time.LocalDateTime;
import java.util.Random;

//分岐命令 if その1
public class If1 {
    public static void main(String[] args) {
        //奇遇判定
        /* Random というクラスにLocalDateTime～というシード値を与えて
           random というインスタンスを新しく作る(new)指示を出している
           getSecondは0～59の秒をintで取得*/
        Random random = new Random(LocalDateTime.now().getSecond());
        /* 出来たrandomというインスタンスにnextInt(0～99)というメソッドを設定
        　 int型のnumという変数に格納 */
        int num = random.nextInt(100);
        if (num%2 == 0) {
            //偶数
            System.out.println(num + "は偶数です");
        }
        else{
            System.out.println(num + "は奇数です");
        }
    }
}
