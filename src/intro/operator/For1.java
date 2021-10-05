package intro.operator;

//For命令のサンプル
public class For1 {
    public static void main(String[] args) {
        int sum = 0; //合計の初期化
        for (int i = 1; i <= 100; i++) {           //iの初期化と各種条件を記載
            sum += i;                              //sumにiをたす
            System.out.println(i + "回目:" + sum); //表示
        }
    }
}
