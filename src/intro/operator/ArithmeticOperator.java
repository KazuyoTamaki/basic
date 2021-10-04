package intro.operator;

public class ArithmeticOperator {
    public static void main(String[] args) {
        //算術演算子(二項演算子）
        int a = 5 , b = 3;
        System.out.println("算術演算子（二項）");
        System.out.println(a + " + " + b + " = " +(a + b));
        System.out.println(a + " - " + b + " = " +(a - b));
        System.out.println(a + " * " + b + " = " +(a * b));
        System.out.println(a + " / " + b + " = " +(a / b));
        System.out.println(a + " % " + b + " = " +(a % b));

        //算術演算子（単項）
        //符号・インクリメント・デクリメント
        int e = 1, f = 2;
        System.out.println("算術演算子（単項）");
        System.out.println("-e:" + -e);     //-1(符号で反転）
        System.out.println("e:" + e++);     //1（インクリメント・後置演算）
        System.out.println("f:" + ++f);     //3（インクリメント・前置演算）
        System.out.println("e++ + ++f:" + (e++ + ++f)); // 2 + 4 = 6（演算・後置冤罪　+　前置演算）
        System.out.println("e:" + e);       //3
        System.out.println("f:" + f);       //4

        //ワイドニング
        double c = 5;
        int d = 3;
        System.out.println(c + " + " + d + " = " + (c + d));  //int + double(答えはdouble型になる）
        System.out.println(c + " - " + d + " = " + (c - d));  //逆だと小数点が切り捨てられる
        System.out.println(c + " * " + d + " = " + (c * d));  //表記もcはdoubleのため、5.0
        System.out.println(c + " / " + d + " = " + (c / d));  //dはintのため、3
        System.out.println(c + " % " + d + " = " + (c % d));  //割り算は割り切れないので最大桁を四捨五入

        //ナローイング
        int g;
        double h = 10;
        //g=h;      //エラーになるためコメントアウト
        g = (int)h; //明示的なキャスト（hの小数点は強制切り捨て）

        //代入演算子
        int i,j;
        i = j = 10;
        System.out.println("i:" + i); //10
        System.out.println("j:" + j); //10

        //復号代入演算子
        //例 x= x + 1;
        //x +=1; と記述できる
        int x = 1;
        System.out.println(x += 1);  //2
        System.out.println(x *= 10); //20

    }
}
