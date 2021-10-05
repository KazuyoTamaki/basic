package ex;

public class MaxSample {
    public static void main(String[] args) {
        int[] array = {20,30,10,50,40};  // 配列を作成
        int max = array[0];              //仮の最大値

        for(int num : array){              //forの拡張構文(arrayの中身を毎回変数iに引き出し)
            if (max < num){                //比較(配列内の数値とmaxを比較)
                max = num;                 //最大値の置き換え
            }                              //該当条件が1つしかない場合は、if (max < num) max = num;
        }                                  //でもOK！
        System.out.println("最大値は" + max + "です。");
    }
}

/*　拡張構文については、教科書P42に記載あり　*/