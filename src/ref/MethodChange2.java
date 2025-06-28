package ref;

public class MethodChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        System.out.println("메서드 호출 전 dataA.value = " + dataA.value);
        changeReference(dataA);
        System.out.println("메서드 호출 후 dataA.value = " + dataA.value);

        /*
        * 메서드의 파라미터 전달은 값을 복사해서 전달 -> 참조형의 경우 참조값을 주므로 인스턴스에 변경이 일어났다면 변경됨
        * */

    }

    static void changeReference(Data data) {
        data.value = 20;
    }
}
