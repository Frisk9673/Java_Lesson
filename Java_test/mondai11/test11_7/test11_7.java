package mondai11.test11_7;

class test11_7 {
    public static void main(String[] args) {
        // 学生情報の初期化
        String[] names = {"Aさん", "Bさん", "Cさん"};
        String[] studentNumbers = {"001", "002", "003"};
        int[][] testScores = {
                {89, 65, 88},
                {80, 95, 64},
                {70, 80, 98}
        };

        // Studentオブジェクトの配列を作成
        Student[] students = new Student[names.length];
        for (int i = 0; i < names.length; i++) {
            students[i] = new Student(names[i], studentNumbers[i], testScores[i]);
        }

        // 学生情報を表示
        for (Student student : students) {
            student.displayStudentInfo();
        }
    }
}
