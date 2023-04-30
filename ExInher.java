class Student {
    int rollNo;
    void getNo(int x) {
        rollNo = x ;
    }
    void putNo() {
        System.out.println("Roll = "+rollNo);
    }
}
class Test extends Student {
    float mark1 , mark2 ;
    void getMarks (float m1, float m2) {
        mark1 = m1;
        mark2 = m2;
    }
    void putMark() {
        System.out.println("Mark 1 = "+mark1);
        System.out.println("Mark 2 = "+mark2);
    }
}
class ExInher {
    public static void main(String args[]) {
        Test t = new Test();
        t.getNo(111);
        t.getMarks(60.5F,87.6F);
        t.putNo();
        t.putMark();
    }