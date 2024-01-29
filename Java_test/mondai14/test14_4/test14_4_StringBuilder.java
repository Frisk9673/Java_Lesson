package mondai14.test14_4;

import java.util.Scanner;

class test14_4_StringBuilder {
    public static void main(String[] args) {
        //ユーザが入力したものを受け取る
        System.out.print("文字列を2つ入力してください。\n");
        Scanner scanner = new Scanner(System.in, "Shift-JIS");
        //1つ目
        System.out.print("1つ目の文字列を入力してください：");
        String input1 = scanner.nextLine();

        //2つ目
        System.out.print("2つ目の文字列を入力してください：");
        String input2 = scanner.nextLine();

        //新しい文字列を作成
        String generateString1 = generateString(input1);
        String generateString2 = generateString(input2);

        //生成された文字列を比較して結果を表示
        if (generateString1.equals(generateString2)) {
            System.out.println("同じ文字列です。");
        } else {
            System.out.println("違う文字列です。");
        }
        scanner.close();
    }
    public static String generateString(String input) {
        //StringBuilderを使用して文字列を生成
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(input);
        return stringBuilder.toString();
    }
}

