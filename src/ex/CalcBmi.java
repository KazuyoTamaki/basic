package ex;

//Scannerを入れると自動反映
import java.util.Scanner;

public class CalcBmi {
    //キーボード入力のinputDataメソッド
    //doubleが戻り値の型、引数がmessage（変数）
    static double inputData(String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextDouble();
    }
    //Sccanerはクラス、importで呼び出せるもの
    //scannerというメソッドを、System,in(キーボード入力)をシード値として入力して作成
    //メッセージ（任意）を表示し、入力した項目を返す

    public static void main(String[] args) {
        //関数を呼び出して変数に代入
        double height = CalcBmi.inputData("身長を入力してください(m)");
        double weight = CalcBmi.inputData("体重を入力してください(kg)");
        double bmi, best_weight;

        bmi = weight / Math.pow(height, 2.0);       //BMI初期値

        bmi = Math.round((bmi * 10.0) / 10.0);
        best_weight = Math.pow(height, 2) * 22.0;              //適正体重
        best_weight = Math.round(best_weight * 10.0) / 10.0;  //適正体重の四捨五入

        System.out.println("----------------------------------\n");
        System.out.println("=============入力情報=============");
        System.out.println("　身長(m)　　:  " + height + " m");
        System.out.println("　体重(kg)　 : " + weight + " kg\n");
        System.out.println("===============結果===============");
        System.out.println("　BMI　　　: " + bmi);
        System.out.println("　適正体重 : " + best_weight + "kg\n");
        System.out.println("===============判定===============");

        if (bmi >= 0 && bmi < 18.5) {
            System.out.println("　判定はやせ型です。");
        } else if (bmi < 25.0) {
            System.out.println("　判定は普通体重です。");
        } else if (bmi < 30.0) {
            System.out.println("　判定は肥満(1度)です。");
        } else if (bmi < 35.0) {
            System.out.println("　判定は肥満(2度)です。");
        } else if (bmi < 40.0) {
            System.out.println("　判定は肥満(3度)です。");
        } else {
            System.out.println("　判定は肥満(4度)です。");
        }

        if (bmi < 18.5 || bmi >= 30) {
            System.out.println("　健康的な体重を目指しましょう。");
        }
        else {
            System.out.println("");
        }
        System.out.println("==================================");
        System.out.println("----------------------------------");
    }
}
