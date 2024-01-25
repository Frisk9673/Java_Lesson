package mondai12.test12_2;

class Person {
    String name = "";
    // 職業
    String job = "";

    /**
     * コンストラクタ
     * 
     * @param name 名前
     * @param job 職業
     */
    Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    /**
     * 自己紹介
     * 
     */
    public void introduce() {
        System.out.println("氏名：" + this.name);
    }
}
