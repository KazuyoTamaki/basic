package intro.sample;

public class DoubleLoop2 {
    public static void main(String[] args){
        int[][] num = {{87,54}, {76,92,48,58,84}};

        for (int i = 0; i < num.length; i++){
            for (int j = 0; j < num[i].length; j++){
                System.out.println("num[" + i + "][" + j + "] = " + num[i][j]);
            }
        }
    }
}
