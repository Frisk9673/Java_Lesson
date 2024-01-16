import java.util.Scanner;
class test51 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        //A～Dの値を入力
        System.out.print("A～Dの値を入力してください：");
        String abcd = stdIn.nextLine();
        
        //switch文を使用し、ABCDのうち一つを出力する
        switch (abcd) {
        case "A" : System.out.println("ランク" + abcd + "は評価「優」です");  break;
        case "B" : System.out.println("ランク" + abcd + "は評価「良」です");  break;
        case "C" : System.out.println("ランク" + abcd + "は評価「可」です");  break;
        case "D" : System.out.println("ランク" + abcd + "は評価「不可」です");  break;
        }

    }
}
