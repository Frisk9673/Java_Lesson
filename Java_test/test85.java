import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class test85 {
    public static void main(String[] args){

        // 要素数が5のリストを作成し、全要素の合計値と平均値を表示する
        // 整数値リスト
        int count[] = {1, 2, 3, 4, 5};
        int i = 0;
        int sum = 0;
        double avg = 0;

        //合計値を求める
        for(i = 0; i < 5; i++) {
            sum = sum + count[i];
        }

        //平均値を求める
        for(i = 0; i < 6; i++) {
            avg = sum / (double)i;
        }

    	// 合計を出力
        System.out.println("合計値は" + sum + "です。");

        // 平均を出力
        System.out.println("平均値は" + avg + "です。");
    }
}

