package ref;

public class VarChange1 {
    public static void main(String[] args) {
        int a = 10;
        int b = a;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // a 변경
        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // b 변경
        b = 30;
        System.out.println("변경 b = 30");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        /*
        * 자바의 대입은 값을 복사해서 대입
        * 기본형의 경우 값을 복사해서 넣기때문에 각각의 변수를 변경할경우 서로의 변수에 영향을 주지 않음
        * */

    }
}
