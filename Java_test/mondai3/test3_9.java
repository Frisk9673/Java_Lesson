package mondai3;
import java.util.Scanner;

class test3_9 {
    public static void main(String[] args) {
        double r;  //半径の値
        double area;  //面積の値

        //Scannerを使用しキーボード入力をできるようにする
        Scanner scanner = new Scanner(System.in);

        //半径の入力
        System.out.print("半径：");
        r = scanner.nextDouble();

        //円の面積を計算する処理
        area = r * r * Math.PI;

        //円の面積を表示する
        System.out.println("円の面積：" + area);
    }
}
