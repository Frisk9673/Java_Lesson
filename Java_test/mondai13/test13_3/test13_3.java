package mondai13.test13_3;

class test13_3 {
    public static void main(String[] args) {
        Person[] num = new Person[2];
        num[0] = new PersonTeacher();
        num[1] = new PersonCook();

        for (Person intro : num) {
            intro.introduction();
            System.out.println();
        }
    }
}
