package mondai13.test13_3;

class test13_3 {
    public static void main(String[] args) {

        Person[] num = new Person[2];
        num[0] = new PersonTeacher("竹井一馬", "教員", "情報処理");
        num[1] = new PersonCook("大原太郎", "シェフ", "オムライス");

        //実行
        for (Person intro : num) {
            intro.introduction();
            System.out.println();
        }
    }
}
