package intro.order;

import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);                //in という名前のScannerクラスのインスタンスを作成
        System.out.println("パスワードを入力してください"); //パスワード入力を促す
        String str = in.nextLine();                         //文字列型変数strに inインスタンスのメソッドを実行
                                                            //nextLineは、戻り値が文字列型
        while(!"abc".equals(str)){                          //strが「abc」と一致しない間繰り返すequalsメソッド
            System.out.println("パスワードが違います。再入力してください。");//(基本型以外の比較に使用)
            str = in.nextLine();                            //再入力
        }
        System.out.println("OK");                           //終わったら通過メッセージ
    }
}
