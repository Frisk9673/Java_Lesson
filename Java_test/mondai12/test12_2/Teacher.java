package mondai12.test12_2;

class Teacher extends Person {
    String subject = "";

    /**
     * コンストラクタ
     * 
     * @param name 名前
     * @param job 職業
     * @param subject 担当科目
     */
    public Teacher(String name, String job, String subject) {
        // 親クラスのコンストラクタを呼び出し
        super(name, job);
        this.subject = subject;
    }

    /**
     * 自己紹介
     * 
     */
    @Override public void introduce() {
        System.out.println("氏名：" + this.name);
        System.out.println("職業：" + this.job);
        System.out.println("担当科目：" + this.subject);
    }
}
