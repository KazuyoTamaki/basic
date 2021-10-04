package ex;

public class CalcBmi_1001 {
    public static void main(String[] args) {
        double height,weight,bmi,best_weight;

        height = 1.55d;   //身長
        weight = 50.0d;    //体重
        bmi = weight / Math.pow(height,2.0) ;       //BMI初期値

        System.out.println("身長(m)  : " + height);
        System.out.println("体重(kg) : " + weight);

        bmi = Math.round((bmi * 10.0) / 10.0);
        best_weight = Math.pow(height,2) * 22.0;              //適正体重
        best_weight = Math.round(best_weight * 10.0) / 10.0;  //適正体重の四捨五入

        System.out.println("----------------------------------\n");
        System.out.println("=============入力情報=============");
        System.out.println("　身長　　 :  " + height + "m");
        System.out.println("　体重　　 : " + weight + "kg\n");
        System.out.println("===============結果===============");
        System.out.println("　BMI　　　: " + bmi);
        System.out.println("　適正体重 : " + best_weight + "kg");
        System.out.println("==================================\n");
        System.out.println("----------------------------------");
    }
}
