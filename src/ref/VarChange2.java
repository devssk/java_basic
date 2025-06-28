package ref;

public class VarChange2 {
    public static void main(String[] args) {
        Data dataA = new Data();
        dataA.value = 10;
        Data dataB = dataA;

        System.out.println("dataA 참조값 : " + dataA);
        System.out.println("dataB 참조값 : " + dataB);
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        // dataA 변경
        dataA.value = 20;
        System.out.println("변경 dataA.value = 20");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        // dataB 변경
        dataB.value = 30;
        System.out.println("변경 dataB.value = 30");
        System.out.println("dataA.value = " + dataA.value);
        System.out.println("dataB.value = " + dataB.value);

        /*
         * 자바의 대입은 값을 복사해서 대입
         * 참조형의 경우 참조값(메모리주소)를 복사하기때문에 멤버 변수를 변경할 경우 인스턴스는 1개이기 때문에 인스턴스 1개만 변경
         * */
    }
}
