package data;
/*
   Ctrl + Dで丸まんま下にソースを１行コピー
   alt + マウス左オーバーで複数選択
 */
//リテラルの書き方
public class Literal {
    public static void main(String[] args) {
        //整数リテラル
        int num1 = 10;     //10新数表記
        int num2 = 012;    //8新数表記
        int num3 = 0xA;    //16新数表記
        int num4 = 0b1010; //2新数表記

        System.out.println("num1:" + num1);
        System.out.println("num2:" + num2);
        System.out.println("num3:" + num3);
        System.out.println("num4:" + num4);

        //型によるリテラル
        long num5 = 1L;      //long型表記
        float num6 = 3.14f;  //float型表記
        float num7 = 3f;     //float型表記
        double num8 = 3d;    //double型表記

        System.out.println("num5:" + num5);
        System.out.println("num6:" + num6);
        System.out.println("num7:" + num7);
        System.out.println("num8:" + num8);

        //浮動小数点の指数表記
        double num9 = 0.123e+2;  //0.123*10^2
        double num10 = 0.123e-2; //0.123*10^-2
        System.out.println("num9:" + num9);   //12.3
        System.out.println("num10:" + num10); //0.00123

        //文字型リテラル
        char c1 = 'A';
        char c2 = '\u0041'; //Unicode
        char c3 = 65;       //整数

        System.out.println("c1:" + c1);
        System.out.println("c2:" + c2);
        System.out.println("c3:" + c3);

        //文字列型
        String str1 = "abc";
        String str2 = "あいうえお";
        String str3 = "\"猫\"";
        String str4 = "\"猫\n\"\"犬\"";

        System.out.println("str1:" + str1);
        System.out.println("str2:" + str2);
        System.out.println("str3:" + str3);
        System.out.println("str4:" + str4);

    }
}
