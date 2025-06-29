package extends1.super2;

public class ClassC extends ClassB {

    public ClassC() {
        // ClassB에는 기본생성자가 없으므로 생성자를 지정해서 넣어야함
        super(10, 20);
        System.out.println("ClassC 생성자");
    }
}
