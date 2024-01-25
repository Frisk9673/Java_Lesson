package mondai12.test12_2;

class test12_2 {
    public static void main(String[] args) {
        // 教師クラス作成
        Teacher teacher = new Teacher("近藤勇", "教員", "Go言語");
        // 料理人クラス作成
        Cook cook = new Cook("沖田総司", "シェフ", "オムライス");
        
        // 自身の情報を表示
        teacher.introduce();
        System.out.println("");
        cook.introduce();
    }
}
