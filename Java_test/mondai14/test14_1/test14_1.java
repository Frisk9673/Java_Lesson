package mondai14.test14_1;
import java.util.Scanner;

class test14_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        //文字列の入力
        System.out.print("文字列を入力：");
        //ユーザからの入力を受け取る
        String userInput = scanner.nextLine();
        //入力を元に新しい文字列を生成
        String generateString = userInput;
        //新しい文字列を表示
        System.out.println(generateString);
        //Scannerを閉じる(リソースの開放)
        scanner.close();
    }    
}
