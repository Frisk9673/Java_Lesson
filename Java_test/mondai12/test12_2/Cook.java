package mondai12.test12_2;

class Cook extends Person {
    // 得意料理
    String specialities = "";

    /**
     * コンストラクタ
     * 
     * @param name 名前
     * @param job 職業
     * @param specialities 得意料理
     */
    public Cook(String name, String job, String specialities) {
        // 親クラスのコンストラクタを呼び出し
        super(name, job);
        this.specialities = specialities;
    }

    /**
     * 自己紹介
     * 
     */
    @Override public void introduce() {
        System.out.println("氏名：" + this.name);
        System.out.println("職業：" + this.job);
        System.out.println("得意料理：" + this.specialities);
    }
}
