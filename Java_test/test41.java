import java.util.Scanner;
class test41 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        System.out.print("1～100までの得点(整数値)を入力してください：");
        int a = stdIn.nextInt();

        if (a >= 80)
            System.out.println("合格です");
        
    }
}
