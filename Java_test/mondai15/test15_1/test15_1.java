package mondai15.test15_1;
import java.util.Scanner;

class test15_1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        try {
            //整数1の入力
        System.out.print("整数1 = "); int num1 = stdIn.nextInt();

        //整数2の入力
        System.out.print("整数2 = ");
        int num2 = stdIn.nextInt();

        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        } catch(ArithmeticException e) {
            System.out.println("0による割り算です！！");
        } finally {
            System.out.println("処理終了");
        }
    }
}

