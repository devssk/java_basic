package static2;

public class DecoData {
    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        // 인스턴스 변수, 메서드 접근 불가
//        instanceValue++;
//        instanceMethod();

        staticValue++;
        staticMethod();
    }

    public void instanceCall() {
        instanceValue++;
        instanceMethod();

        // 정젹 변수, 메서드 접근 가능
        staticValue++;
        staticMethod();
    }

    private void instanceMethod() {
        System.out.println("instanceValue : " + instanceValue);
    }

    private static void staticMethod() {
        System.out.println("staticValue : " + staticValue);
    }

}
