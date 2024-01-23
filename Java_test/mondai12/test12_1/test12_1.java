package mondai12.test12_1;

import java.util.Scanner;

class test12_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //半径を整数値で入力させる
        System.out.print("整数を入力してください：");
        int x = scanner.nextInt();

        System.out.print("整数を入力してください：");
        int y = scanner.nextInt();

        //Calculatorを呼び出す
        Calculator calculator = new Calculator(x, y);
        int sum = calculator.CalcSum();
        int avg = calculator.CalcAve();

        //Calculatorから継承したMoreCalcを呼び出す
        MoreCalc moreCalc = new MoreCalc(x, y);
        int pow = moreCalc.CalcPow();

        //合計結果の出力
        System.out.println("Sum " + x + " and " + y + " = " + sum);
        //平均結果の出力
        System.out.println("Average " + x + " and " + y + " = " + avg);
        //累乗結果の出力
        System.out.println("Power " + x + " of " + y + " = " + pow);
    }
}
