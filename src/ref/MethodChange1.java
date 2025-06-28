package ref;

public class MethodChange1 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("메서드 호출 전 a = " + a);
        changePrimitive(a);
        System.out.println("메서드 호출 후 a = " + a);

        /*
        * 메서드의 파라미터 전달도 값을 복사해서 전달하기 때문에 기본형 변수의 경우 원본에는 영향이 없음
        * */

    }

    static void changePrimitive(int x) {
        x = 20;
    }
}
