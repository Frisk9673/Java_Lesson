package mondai14.test14_2;

import java.util.Scanner;

public class test14_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        //文字列の入力
        System.out.print("文字列を入力：");
        //ユーザからの入力を受け取る
        String userInput = scanner.nextLine();
        //入力を元に新しい文字列を生成
        int inputLength = userInput.length();
        //
        System.out.println("入力された文字数は" + inputLength + "です。");
        //Scannerを閉じる(リソースの開放)
        scanner.close();
    }    
}
