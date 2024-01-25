package mondai11.test11_7;

class Student {
    private String name;
    private String studentNumber;
    private int[] testScores;

    // コンストラクタ
    public Student(String name, String studentNumber, int[] testScores) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.testScores = testScores;
    }

    // 3科目の平均点を計算するメソッド
    public double calculateAverage() {
        int sum = 0;
        for (int score : testScores) {
            sum += score;
        }
        return (double) sum / testScores.length;
    }

    // 3科目の合計点を計算するメソッド
    public int calculateTotal() {
        int total = 0;
        for (int score : testScores) {
            total += score;
        }
        return total;
    }

    // 学生情報を表示するメソッド
    public void displayStudentInfo() {
        System.out.printf("%s番　%s　平均点%.2f%n", studentNumber, name, calculateAverage());
    }
}
