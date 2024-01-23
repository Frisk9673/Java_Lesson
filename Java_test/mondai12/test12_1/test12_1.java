package mondai12.test12_1;

import java.util.Scanner;

class test12_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //半径を整数値で入力させる
        System.out.print("整数を入力してください：");
        int num1 = scanner.nextInt();

        System.out.print("整数を入力してください：");
        int num2 = scanner.nextInt();

        //Calculatorを呼び出す
        Calculator calculator = new Calculator(num1, num2);
        int sum = calculator.CalcSum();
        int avg = calculator.CalcAve();

        //Calculatorから継承したMoreCalcを呼び出す
        MoreCalc moreCalc = new MoreCalc(num1, num2);
        int pow = moreCalc.CalcPow();

        //合計結果の出力
        System.out.println("Sum " + num1 + " and " + num2 + " = " + sum);
        //平均結果の出力
        System.out.println("Average " + num1 + " and " + num2 + " = " + avg);
        //累乗結果の出力
        System.out.println("Power " + num1 + " of " + num2 + " = " + pow);
    }
}
