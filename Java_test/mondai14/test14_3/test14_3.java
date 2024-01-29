package mondai14.test14_3;
import java.util.Scanner;

class test14_3 {
    public static void main(String[] args) {
        //ユーザーが入力したものを受け取る
        Scanner scanner = new Scanner(System.in, "Shift-JIS");
        System.out.println("文字列を入力：");
        String userInput = scanner.nextLine();

        //新し文字列を生成し、10文字以内に切り詰めて表示
        String result = generateTrimString(userInput);
        System.out.println("結果文字列：" + result);

        //Scannerを閉じる
        scanner.close();
    }

    //11文字以上なら11文字以降を削除して10文字だけ返すメソッド
    public static String generateTrimString(String input) {
        //StringBuilderを使用して文字列を生成する
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input);

        //文字列が11文字以上の場合は11文字以降を削除する
        if (stringBuilder.length() >= 10) {
            stringBuilder.delete(10, stringBuilder.length());
        }
        return stringBuilder.toString();
    }
}
