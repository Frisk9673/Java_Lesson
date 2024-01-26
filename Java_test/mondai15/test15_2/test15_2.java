package mondai15.test15_2;
import java.util.InputMismatchException;
import java.util.Scanner;

class test15_2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        try {
            //ユーザに整数の入力をするようメッセージを表示
            System.out.print("整数を入力 = ");

            //整数を受け取る
            int userInput = stdIn.nextInt();
            //入力された整数が偶数か奇数かを判定する
            String result = (userInput % 2 == 0) ? "偶数" : "奇数";

            //判定結果を画面に表示
            System.out.println(userInput + " は" + result);
        } catch (InputMismatchException e) {
            System.out.println("整数と認識できません！！");
        } finally {
            stdIn.close();
        }
    }
}
