package mondai3;

import java.util.Scanner;

class test3_14 {
    public static void main(String[] args) {
        System.out.println("長方形の面積を求めます");
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("縦の長さ：");
        double vertical = scanner.nextDouble();

        System.out.print("横の長さ：");
        double horizontal = scanner.nextDouble();

        //長方形の面積の計算
        double area = calculateArea(vertical, horizontal);

        //面積の表示
        System.out.println("長方形の面積 = " + area);

        //Scannerを閉じる
        scanner.close();
    }
    public static double calculateArea(double vertical, double horizontal) {
        return vertical * horizontal;
        
    }
}
