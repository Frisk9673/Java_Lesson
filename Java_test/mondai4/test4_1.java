package mondai4;
import java.util.Scanner;
class test4_1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("1～100までの得点(整数値)を入力してください：");
        int a = stdIn.nextInt();

        if (a >= 80)
            System.out.println("合格です");
        
    }
}
