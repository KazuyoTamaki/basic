package intro.operator;
//関係演算子による条件の書き方
public class RelationalOperatorSample {
    public static void main(String[] args) {
        int num = 50;

        System.out.println("num = " + num);
        //numが0以上であるか？
        System.out.println("numは0以上か？　:" + (num >= 0));
        //numが0未満であるか？
        System.out.println("numは0未満か？　:" + (num < 0));
        //numが100以下であるか？
        System.out.println("numは100以下か？:" + (num <= 100));
        //numが奇数であるか？
        System.out.println("numは奇数か？ 　:" + (num % 2 == 1));
        //numは3の倍数か？
        System.out.println("numは3の倍数か？:" + (num % 3 == 0));
        //numが0以上かつ100以下
        System.out.println("numは0以上かつ100以下か？　　　:" + (num >= 0 && num <= 100));
        System.out.println("numは0以上かつ100以下か？(反転):" + (!(num >= 0 && num <= 100)));
        System.out.println("numは0以上かつ100以下か？　　　:" + (!(num < 0 || num > 100)));
    }
}
