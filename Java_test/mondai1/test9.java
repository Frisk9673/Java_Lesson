package mondai1;
import java.util.Scanner;


class test9 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in, "Shift-JIS");

        System.out.print("お名前を入力してください>");
        String str = stdIn.nextLine();

        System.out.println("こんにちは" + str + "さん！");
  }    
}
