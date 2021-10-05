package ex;

public class MaxMinSample
{
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};  // 配列を作成
        int max = array[0];              //仮の最大値
        int min = array[0];              //仮の最小値

        for(int num : array){            //forの拡張構文(arrayの中身を毎回変数iに引き出し)
            if (max < num){              //比較(配列内の数値とmaxを比較)
                max = num;               //最大値の置き換え
            }                            //該当条件が1つしかない場合は、if (max < num) max = num;
            if (num < min){              //でもOK！
                min = num;               //最小値の処理
            }
        }
        System.out.println("最大値は" + max + "です。");
        System.out.println("最小値は" + min + "です。");
    }
}
