package mondai14.test14_5;

class test14_5 {
    public static void main(String[] args) {
        String content1 = "東京都千代田区";
        String content2 = "神田神保町";

        //StringBuilder resultBuilderを使用して結合させる
        StringBuilder resultBuilder = new StringBuilder();
        resultBuilder.append(content1).append(content2);

        //結果を画面に表示
        System.out.println(resultBuilder.toString());
    }
}
